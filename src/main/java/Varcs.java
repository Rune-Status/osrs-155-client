import java.io.EOFException;

public class Varcs {

	static int baseY;

	static IndexData indexSoundEffects;

	boolean changed;

	String[] varcstrings;

	int[] varcs;

	boolean[] varcSerials;

	long lastSerialize;

	boolean[] varcstringSerials;

	Varcs() {
		this.changed = false;
		this.varcs = new int[FaceNormal.configsIndex.fileCount(19)];
		this.varcstrings = new String[FaceNormal.configsIndex.fileCount(15)];
		this.varcSerials = new boolean[this.varcs.length];

		int var1;
		byte[] var4;
		for (var1 = 0; var1 < this.varcs.length; ++var1) {
			class243 var3 = (class243) class243.field3310.get((long) var1);
			class243 var2;
			if (var3 != null) {
				var2 = var3;
			} else {
				var4 = class243.field3311.getConfigData(19, var1);
				var3 = new class243();
				if (var4 != null) {
					var3.method4419(new Buffer(var4));
				}

				class243.field3310.put(var3, (long) var1);
				var2 = var3;
			}

			this.varcSerials[var1] = var2.field3312;
		}

		this.varcstringSerials = new boolean[this.varcstrings.length];

		for (var1 = 0; var1 < this.varcstrings.length; ++var1) {
			class244 var6 = (class244) class244.field3316.get((long) var1);
			class244 var5;
			if (var6 != null) {
				var5 = var6;
			} else {
				var4 = class244.field3319.getConfigData(15, var1);
				var6 = new class244();
				if (var4 != null) {
					var6.method4427(new Buffer(var4));
				}

				class244.field3316.put(var6, (long) var1);
				var5 = var6;
			}

			this.varcstringSerials[var1] = var5.field3317;
		}

		for (var1 = 0; var1 < this.varcs.length; ++var1) {
			this.varcs[var1] = -1;
		}

		this.deserialize();
	}

	FileOnDisk getVarPrefs(boolean var1) {
		return class81.getPreferencesFile("2", Client.field923.field3198, var1);
	}

	boolean changed() {
		return this.changed;
	}

	void serialize() {
		FileOnDisk var1 = this.getVarPrefs(true);

		try {
			int var2 = 3;
			int var3 = 0;

			int var4;
			for (var4 = 0; var4 < this.varcs.length; ++var4) {
				if (this.varcSerials[var4] && this.varcs[var4] != -1) {
					var2 += 6;
					++var3;
				}
			}

			var2 += 2;
			var4 = 0;

			for (int var5 = 0; var5 < this.varcstrings.length; ++var5) {
				if (this.varcstringSerials[var5] && this.varcstrings[var5] != null) {
					var2 += 2 + class162.getLength(this.varcstrings[var5]);
					++var4;
				}
			}

			Buffer var9 = new Buffer(var2);
			var9.putByte(1);
			var9.putShort(var3);

			int var6;
			for (var6 = 0; var6 < this.varcs.length; ++var6) {
				if (this.varcSerials[var6] && this.varcs[var6] != -1) {
					var9.putShort(var6);
					var9.putInt(this.varcs[var6]);
				}
			}

			var9.putShort(var4);

			for (var6 = 0; var6 < this.varcstrings.length; ++var6) {
				if (this.varcstringSerials[var6] && this.varcstrings[var6] != null) {
					var9.putShort(var6);
					var9.putString(this.varcstrings[var6]);
				}
			}

			var1.write(var9.payload, 0, var9.offset);
		} catch (Exception var17) {
			;
		} finally {
			try {
				var1.close();
			} catch (Exception var16) {
				;
			}

		}

		this.changed = false;
		this.lastSerialize = class147.currentTimeMs();
	}

	void deserialize() {
		FileOnDisk var1 = this.getVarPrefs(false);

		label199: {
			try {
				byte[] var2 = new byte[(int) var1.length()];

				int var4;
				for (int var3 = 0; var3 < var2.length; var3 += var4) {
					var4 = var1.read(var2, var3, var2.length - var3);
					if (var4 == -1) {
						throw new EOFException();
					}
				}

				Buffer var13 = new Buffer(var2);
				if (var13.payload.length - var13.offset < 1) {
					return;
				}

				int var5 = var13.readUnsignedByte();
				if (var5 >= 0 && var5 <= 1) {
					int var6 = var13.readUnsignedShort();

					int var7;
					int var8;
					int var9;
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var13.readUnsignedShort();
						var9 = var13.readInt();
						if (this.varcSerials[var8]) {
							this.varcs[var8] = var9;
						}
					}

					var7 = var13.readUnsignedShort();
					var8 = 0;

					while (true) {
						if (var8 >= var7) {
							break label199;
						}

						var9 = var13.readUnsignedShort();
						String var10 = var13.readString();
						if (this.varcstringSerials[var9]) {
							this.varcstrings[var9] = var10;
						}

						++var8;
					}
				}
			} catch (Exception var24) {
				break label199;
			} finally {
				try {
					var1.close();
				} catch (Exception var23) {
					;
				}

			}

			return;
		}

		this.changed = false;
	}

	String getVarcString(int var1) {
		return this.varcstrings[var1];
	}

	int getVarc(int var1) {
		return this.varcs[var1];
	}

	void putVarc(int var1, int var2) {
		this.varcs[var1] = var2;
		if (this.varcSerials[var1]) {
			this.changed = true;
		}

	}

	void putVarcString(int var1, String var2) {
		this.varcstrings[var1] = var2;
		if (this.varcstringSerials[var1]) {
			this.changed = true;
		}

	}

	void reset() {
		int var1;
		for (var1 = 0; var1 < this.varcs.length; ++var1) {
			if (!this.varcSerials[var1]) {
				this.varcs[var1] = -1;
			}
		}

		for (var1 = 0; var1 < this.varcstrings.length; ++var1) {
			if (!this.varcstringSerials[var1]) {
				this.varcstrings[var1] = null;
			}
		}

	}

	void process() {
		if (this.changed && this.lastSerialize < class147.currentTimeMs() - 60000L) {
			this.serialize();
		}

	}

	static final String method1895(int var0) {
		return var0 < 999999999 ? Integer.toString(var0) : "*";
	}

	public static void method1894(int var0) {
		MouseInput.mouseIdleTicks = var0;
	}

	static final int getSmoothNoise(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = class44.getSmoothNoise2D(var3, var5);
		int var8 = class44.getSmoothNoise2D(var3 + 1, var5);
		int var9 = class44.getSmoothNoise2D(var3, var5 + 1);
		int var10 = class44.getSmoothNoise2D(var3 + 1, var5 + 1);
		int var12 = 65536 - Graphics3D.COSINE[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var12 * var8 >> 16);
		int var14 = 65536 - Graphics3D.COSINE[var4 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
		int var16 = 65536 - Graphics3D.COSINE[var6 * 1024 / var2] >> 1;
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16);
		return var15;
	}
}
