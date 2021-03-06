public class Model extends Renderable {

	static boolean[] field1918;

	static int[] field1960;

	static int[] field1976;

	static Model field1914;

	static byte[] field1915;

	static Model field1927;

	static int field1916;

	static byte[] field1945;

	static int[] field1966;

	static int field1971;

	static int field1972;

	static int[] field1958;

	static boolean[] field1951;

	static int[] field1962;

	public static int[] field1953;

	static int[] field1952;

	public static int[] field1954;

	static int[] field1967;

	static int[] yViewportBuffer;

	static int[][] field1920;

	static int[] field1955;

	static int[] field1957;

	static int[] field1968;

	static int[] field1970;

	static int[] xViewportBuffer;

	static int[][] field1977;

	static int[] field1912;

	static int[] field1965;

	static int[] field1913;

	static boolean field1973;

	int field1942;

	public int field1947;

	int field1939;

	int[][] field1936;

	int field1949;

	public int field1944;

	public int[] indices1;

	public int field1961;

	int XYZMag;

	int[] verticesX;

	int[] verticesZ;

	public int[] indices2;

	int[][] field1937;

	byte field1931;

	public int[] indices3;

	int field1940;

	int field1941;

	int[] verticesY;

	byte[] field1964;

	public int field1963;

	int[] field1978;

	public int[] field1935;

	public int field1948;

	public boolean field1938;

	int[] field1926;

	byte[] field1950;

	public int field1946;

	int field1943;

	public int field1924;

	short[] field1975;

	byte[] field1929;

	int[] field1933;

	int[] field1934;

	int[] field1928;

	static {
		field1927 = new Model();
		field1945 = new byte[1];
		field1914 = new Model();
		field1915 = new byte[1];
		field1951 = new boolean[4700];
		field1918 = new boolean[4700];
		field1953 = new int[4700];
		field1954 = new int[4700];
		field1955 = new int[4700];
		yViewportBuffer = new int[4700];
		field1957 = new int[4700];
		field1958 = new int[4700];
		field1960 = new int[1600];
		field1920 = new int[1600][512];
		field1962 = new int[12];
		field1977 = new int[12][2000];
		field1965 = new int[2000];
		field1913 = new int[2000];
		field1952 = new int[12];
		field1967 = new int[10];
		field1968 = new int[10];
		xViewportBuffer = new int[10];
		field1973 = true;
		field1976 = Graphics3D.SINE;
		field1966 = Graphics3D.COSINE;
		field1912 = Graphics3D.colorPalette;
		field1970 = Graphics3D.field2020;
	}

	Model() {
		this.field1949 = 0;
		this.field1961 = 0;
		this.field1931 = 0;
		this.field1941 = 0;
		this.field1938 = false;
		this.field1947 = -1;
		this.field1948 = -1;
		this.field1924 = -1;
	}

	public Model(Model[] var1, int var2) {
		this.field1949 = 0;
		this.field1961 = 0;
		this.field1931 = 0;
		this.field1941 = 0;
		this.field1938 = false;
		this.field1947 = -1;
		this.field1948 = -1;
		this.field1924 = -1;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		this.field1949 = 0;
		this.field1961 = 0;
		this.field1941 = 0;
		this.field1931 = -1;

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				this.field1949 += var8.field1949;
				this.field1961 += var8.field1961;
				this.field1941 += var8.field1941;
				if (var8.field1950 != null) {
					var3 = true;
				} else {
					if (this.field1931 == -1) {
						this.field1931 = var8.field1931;
					}

					if (this.field1931 != var8.field1931) {
						var3 = true;
					}
				}

				var4 |= var8.field1964 != null;
				var5 |= var8.field1975 != null;
				var6 |= var8.field1929 != null;
			}
		}

		this.verticesX = new int[this.field1949];
		this.verticesY = new int[this.field1949];
		this.verticesZ = new int[this.field1949];
		this.indices1 = new int[this.field1961];
		this.indices2 = new int[this.field1961];
		this.indices3 = new int[this.field1961];
		this.field1978 = new int[this.field1961];
		this.field1926 = new int[this.field1961];
		this.field1935 = new int[this.field1961];
		if (var3) {
			this.field1950 = new byte[this.field1961];
		}

		if (var4) {
			this.field1964 = new byte[this.field1961];
		}

		if (var5) {
			this.field1975 = new short[this.field1961];
		}

		if (var6) {
			this.field1929 = new byte[this.field1961];
		}

		if (this.field1941 > 0) {
			this.field1933 = new int[this.field1941];
			this.field1934 = new int[this.field1941];
			this.field1928 = new int[this.field1941];
		}

		this.field1949 = 0;
		this.field1961 = 0;
		this.field1941 = 0;

		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				int var9;
				for (var9 = 0; var9 < var8.field1961; ++var9) {
					this.indices1[this.field1961] = this.field1949 + var8.indices1[var9];
					this.indices2[this.field1961] = this.field1949 + var8.indices2[var9];
					this.indices3[this.field1961] = this.field1949 + var8.indices3[var9];
					this.field1978[this.field1961] = var8.field1978[var9];
					this.field1926[this.field1961] = var8.field1926[var9];
					this.field1935[this.field1961] = var8.field1935[var9];
					if (var3) {
						if (var8.field1950 != null) {
							this.field1950[this.field1961] = var8.field1950[var9];
						} else {
							this.field1950[this.field1961] = var8.field1931;
						}
					}

					if (var4 && var8.field1964 != null) {
						this.field1964[this.field1961] = var8.field1964[var9];
					}

					if (var5) {
						if (var8.field1975 != null) {
							this.field1975[this.field1961] = var8.field1975[var9];
						} else {
							this.field1975[this.field1961] = -1;
						}
					}

					if (var6) {
						if (var8.field1929 != null && var8.field1929[var9] != -1) {
							this.field1929[this.field1961] = (byte) (this.field1941 + var8.field1929[var9]);
						} else {
							this.field1929[this.field1961] = -1;
						}
					}

					++this.field1961;
				}

				for (var9 = 0; var9 < var8.field1941; ++var9) {
					this.field1933[this.field1941] = this.field1949 + var8.field1933[var9];
					this.field1934[this.field1941] = this.field1949 + var8.field1934[var9];
					this.field1928[this.field1941] = this.field1949 + var8.field1928[var9];
					++this.field1941;
				}

				for (var9 = 0; var9 < var8.field1949; ++var9) {
					this.verticesX[this.field1949] = var8.verticesX[var9];
					this.verticesY[this.field1949] = var8.verticesY[var9];
					this.verticesZ[this.field1949] = var8.verticesZ[var9];
					++this.field1949;
				}
			}
		}

	}

	public void method2594() {
		if (this.field1939 != 1) {
			this.field1939 = 1;
			super.modelHeight = 0;
			this.field1940 = 0;
			this.XYZMag = 0;

			for (int var1 = 0; var1 < this.field1949; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				if (-var3 > super.modelHeight) {
					super.modelHeight = -var3;
				}

				if (var3 > this.field1940) {
					this.field1940 = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.XYZMag) {
					this.XYZMag = var5;
				}
			}

			this.XYZMag = (int) (Math.sqrt((double) this.XYZMag) + 0.99D);
			this.field1943 = (int) (Math
					.sqrt((double) (this.XYZMag * this.XYZMag + super.modelHeight * super.modelHeight)) + 0.99D);
			this.field1942 = this.field1943
					+ (int) (Math.sqrt((double) (this.XYZMag * this.XYZMag + this.field1940 * this.field1940)) + 0.99D);
		}
	}

	public void method2639(Frames var1, int var2) {
		if (this.field1936 != null) {
			if (var2 != -1) {
				Frame var3 = var1.skeletons[var2];
				FrameMap var4 = var3.skin;
				field1916 = 0;
				field1971 = 0;
				field1972 = 0;

				for (int var5 = 0; var5 < var3.field1881; ++var5) {
					int var6 = var3.field1882[var5];
					this.method2600(var4.types[var6], var4.list[var6], var3.translator_x[var5], var3.translator_y[var5],
							var3.translator_z[var5]);
				}

				this.method2655();
			}
		}
	}

	void method2655() {
		this.field1939 = 0;
		this.field1947 = -1;
	}

	final void method2612(int var1) {
		int var2 = Graphics3D.centerX;
		int var3 = Graphics3D.centerY;
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field1958[var5];
		int var9 = field1958[var6];
		int var10 = field1958[var7];
		if (this.field1964 == null) {
			Graphics3D.rasterAlpha = 0;
		} else {
			Graphics3D.rasterAlpha = this.field1964[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field1967[var4] = field1953[var5];
			field1968[var4] = field1954[var5];
			xViewportBuffer[var4++] = this.field1978[var1];
		} else {
			var11 = yViewportBuffer[var5];
			var12 = field1957[var5];
			var13 = this.field1978[var1];
			if (var10 >= 50) {
				var14 = field1970[var10 - var8] * (50 - var8);
				field1967[var4] = var2
						+ Graphics3D.field2009 * (var11 + ((yViewportBuffer[var7] - var11) * var14 >> 16)) / 50;
				field1968[var4] = var3
						+ Graphics3D.field2009 * (var12 + ((field1957[var7] - var12) * var14 >> 16)) / 50;
				xViewportBuffer[var4++] = var13 + ((this.field1935[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field1970[var9 - var8] * (50 - var8);
				field1967[var4] = var2
						+ (var11 + ((yViewportBuffer[var6] - var11) * var14 >> 16)) * Graphics3D.field2009 / 50;
				field1968[var4] = var3
						+ Graphics3D.field2009 * (var12 + ((field1957[var6] - var12) * var14 >> 16)) / 50;
				xViewportBuffer[var4++] = var13 + ((this.field1926[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field1967[var4] = field1953[var6];
			field1968[var4] = field1954[var6];
			xViewportBuffer[var4++] = this.field1926[var1];
		} else {
			var11 = yViewportBuffer[var6];
			var12 = field1957[var6];
			var13 = this.field1926[var1];
			if (var8 >= 50) {
				var14 = field1970[var8 - var9] * (50 - var9);
				field1967[var4] = var2
						+ (var11 + ((yViewportBuffer[var5] - var11) * var14 >> 16)) * Graphics3D.field2009 / 50;
				field1968[var4] = var3
						+ (var12 + ((field1957[var5] - var12) * var14 >> 16)) * Graphics3D.field2009 / 50;
				xViewportBuffer[var4++] = var13 + ((this.field1978[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field1970[var10 - var9] * (50 - var9);
				field1967[var4] = var2
						+ (var11 + ((yViewportBuffer[var7] - var11) * var14 >> 16)) * Graphics3D.field2009 / 50;
				field1968[var4] = var3
						+ (var12 + ((field1957[var7] - var12) * var14 >> 16)) * Graphics3D.field2009 / 50;
				xViewportBuffer[var4++] = var13 + ((this.field1935[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field1967[var4] = field1953[var7];
			field1968[var4] = field1954[var7];
			xViewportBuffer[var4++] = this.field1935[var1];
		} else {
			var11 = yViewportBuffer[var7];
			var12 = field1957[var7];
			var13 = this.field1935[var1];
			if (var9 >= 50) {
				var14 = field1970[var9 - var10] * (50 - var10);
				field1967[var4] = var2
						+ (var11 + ((yViewportBuffer[var6] - var11) * var14 >> 16)) * Graphics3D.field2009 / 50;
				field1968[var4] = var3
						+ (var12 + ((field1957[var6] - var12) * var14 >> 16)) * Graphics3D.field2009 / 50;
				xViewportBuffer[var4++] = var13 + ((this.field1926[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field1970[var8 - var10] * (50 - var10);
				field1967[var4] = var2
						+ (var11 + ((yViewportBuffer[var5] - var11) * var14 >> 16)) * Graphics3D.field2009 / 50;
				field1968[var4] = var3
						+ (var12 + ((field1957[var5] - var12) * var14 >> 16)) * Graphics3D.field2009 / 50;
				xViewportBuffer[var4++] = var13 + ((this.field1978[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field1967[0];
		var12 = field1967[1];
		var13 = field1967[2];
		var14 = field1968[0];
		int var15 = field1968[1];
		int var16 = field1968[2];
		Graphics3D.rasterClipEnable = false;
		int var17;
		int var18;
		int var19;
		int var20;
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Graphics3D.rasterClipX || var12 > Graphics3D.rasterClipX
					|| var13 > Graphics3D.rasterClipX) {
				Graphics3D.rasterClipEnable = true;
			}

			if (this.field1975 != null && this.field1975[var1] != -1) {
				if (this.field1929 != null && this.field1929[var1] != -1) {
					var20 = this.field1929[var1] & 255;
					var17 = this.field1933[var20];
					var18 = this.field1934[var20];
					var19 = this.field1928[var20];
				} else {
					var17 = var5;
					var18 = var6;
					var19 = var7;
				}

				if (this.field1935[var1] == -1) {
					Graphics3D.rasterTextureAffine(var14, var15, var16, var11, var12, var13, this.field1978[var1],
							this.field1978[var1], this.field1978[var1], yViewportBuffer[var17], yViewportBuffer[var18],
							yViewportBuffer[var19], field1957[var17], field1957[var18], field1957[var19],
							field1958[var17], field1958[var18], field1958[var19], this.field1975[var1]);
				} else {
					Graphics3D.rasterTextureAffine(var14, var15, var16, var11, var12, var13, xViewportBuffer[0],
							xViewportBuffer[1], xViewportBuffer[2], yViewportBuffer[var17], yViewportBuffer[var18],
							yViewportBuffer[var19], field1957[var17], field1957[var18], field1957[var19],
							field1958[var17], field1958[var18], field1958[var19], this.field1975[var1]);
				}
			} else if (this.field1935[var1] == -1) {
				Graphics3D.rasterFlat(var14, var15, var16, var11, var12, var13, field1912[this.field1978[var1]]);
			} else {
				Graphics3D.rasterGouraud(var14, var15, var16, var11, var12, var13, xViewportBuffer[0],
						xViewportBuffer[1], xViewportBuffer[2]);
			}
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Graphics3D.rasterClipX || var12 > Graphics3D.rasterClipX
					|| var13 > Graphics3D.rasterClipX || field1967[3] < 0 || field1967[3] > Graphics3D.rasterClipX) {
				Graphics3D.rasterClipEnable = true;
			}

			if (this.field1975 != null && this.field1975[var1] != -1) {
				if (this.field1929 != null && this.field1929[var1] != -1) {
					var20 = this.field1929[var1] & 255;
					var17 = this.field1933[var20];
					var18 = this.field1934[var20];
					var19 = this.field1928[var20];
				} else {
					var17 = var5;
					var18 = var6;
					var19 = var7;
				}

				short var21 = this.field1975[var1];
				if (this.field1935[var1] == -1) {
					Graphics3D.rasterTextureAffine(var14, var15, var16, var11, var12, var13, this.field1978[var1],
							this.field1978[var1], this.field1978[var1], yViewportBuffer[var17], yViewportBuffer[var18],
							yViewportBuffer[var19], field1957[var17], field1957[var18], field1957[var19],
							field1958[var17], field1958[var18], field1958[var19], var21);
					Graphics3D.rasterTextureAffine(var14, var16, field1968[3], var11, var13, field1967[3],
							this.field1978[var1], this.field1978[var1], this.field1978[var1], yViewportBuffer[var17],
							yViewportBuffer[var18], yViewportBuffer[var19], field1957[var17], field1957[var18],
							field1957[var19], field1958[var17], field1958[var18], field1958[var19], var21);
				} else {
					Graphics3D.rasterTextureAffine(var14, var15, var16, var11, var12, var13, xViewportBuffer[0],
							xViewportBuffer[1], xViewportBuffer[2], yViewportBuffer[var17], yViewportBuffer[var18],
							yViewportBuffer[var19], field1957[var17], field1957[var18], field1957[var19],
							field1958[var17], field1958[var18], field1958[var19], var21);
					Graphics3D.rasterTextureAffine(var14, var16, field1968[3], var11, var13, field1967[3],
							xViewportBuffer[0], xViewportBuffer[2], xViewportBuffer[3], yViewportBuffer[var17],
							yViewportBuffer[var18], yViewportBuffer[var19], field1957[var17], field1957[var18],
							field1957[var19], field1958[var17], field1958[var18], field1958[var19], var21);
				}
			} else if (this.field1935[var1] == -1) {
				var17 = field1912[this.field1978[var1]];
				Graphics3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17);
				Graphics3D.rasterFlat(var14, var16, field1968[3], var11, var13, field1967[3], var17);
			} else {
				Graphics3D.rasterGouraud(var14, var15, var16, var11, var12, var13, xViewportBuffer[0],
						xViewportBuffer[1], xViewportBuffer[2]);
				Graphics3D.rasterGouraud(var14, var16, field1968[3], var11, var13, field1967[3], xViewportBuffer[0],
						xViewportBuffer[2], xViewportBuffer[3]);
			}
		}

	}

	Model method2604(boolean var1, Model var2, byte[] var3) {
		var2.field1949 = this.field1949;
		var2.field1961 = this.field1961;
		var2.field1941 = this.field1941;
		if (var2.verticesX == null || var2.verticesX.length < this.field1949) {
			var2.verticesX = new int[this.field1949 + 100];
			var2.verticesY = new int[this.field1949 + 100];
			var2.verticesZ = new int[this.field1949 + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.field1949; ++var4) {
			var2.verticesX[var4] = this.verticesX[var4];
			var2.verticesY[var4] = this.verticesY[var4];
			var2.verticesZ[var4] = this.verticesZ[var4];
		}

		if (var1) {
			var2.field1964 = this.field1964;
		} else {
			var2.field1964 = var3;
			if (this.field1964 == null) {
				for (var4 = 0; var4 < this.field1961; ++var4) {
					var2.field1964[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.field1961; ++var4) {
					var2.field1964[var4] = this.field1964[var4];
				}
			}
		}

		var2.indices1 = this.indices1;
		var2.indices2 = this.indices2;
		var2.indices3 = this.indices3;
		var2.field1978 = this.field1978;
		var2.field1926 = this.field1926;
		var2.field1935 = this.field1935;
		var2.field1950 = this.field1950;
		var2.field1929 = this.field1929;
		var2.field1975 = this.field1975;
		var2.field1931 = this.field1931;
		var2.field1933 = this.field1933;
		var2.field1934 = this.field1934;
		var2.field1928 = this.field1928;
		var2.field1936 = this.field1936;
		var2.field1937 = this.field1937;
		var2.field1938 = this.field1938;
		var2.method2655();
		return var2;
	}

	void method2593(int var1) {
		if (this.field1947 == -1) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field1966[var1];
			int var9 = field1976[var1];

			for (int var10 = 0; var10 < this.field1949; ++var10) {
				int var11 = Graphics3D.method2697(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				int var12 = this.verticesY[var10];
				int var13 = Graphics3D.method2699(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
				}
			}

			this.field1944 = (var5 + var2) / 2;
			this.field1963 = (var6 + var3) / 2;
			this.field1946 = (var7 + var4) / 2;
			this.field1947 = (var5 - var2 + 1) / 2;
			this.field1948 = (var6 - var3 + 1) / 2;
			this.field1924 = (var7 - var4 + 1) / 2;
			if (this.field1947 < 32) {
				this.field1947 = 32;
			}

			if (this.field1924 < 32) {
				this.field1924 = 32;
			}

			if (this.field1938) {
				this.field1947 += 8;
				this.field1924 += 8;
			}

		}
	}

	public Model method2641(boolean var1) {
		if (!var1 && field1945.length < this.field1961) {
			field1945 = new byte[this.field1961 + 100];
		}

		return this.method2604(var1, field1927, field1945);
	}

	void method2597() {
		if (this.field1939 != 2) {
			this.field1939 = 2;
			this.XYZMag = 0;

			for (int var1 = 0; var1 < this.field1949; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.XYZMag) {
					this.XYZMag = var5;
				}
			}

			this.XYZMag = (int) (Math.sqrt((double) this.XYZMag) + 0.99D);
			this.field1943 = this.XYZMag;
			this.field1942 = this.XYZMag + this.XYZMag;
		}
	}

	public Model method2591(boolean var1) {
		if (!var1 && field1915.length < this.field1961) {
			field1915 = new byte[this.field1961 + 100];
		}

		return this.method2604(var1, field1914, field1915);
	}

	public void method2633(int var1) {
		int var2 = field1976[var1];
		int var3 = field1966[var1];

		for (int var4 = 0; var4 < this.field1949; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.method2655();
	}

	public Model method2589(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method2594();
		int var7 = var2 - this.XYZMag;
		int var8 = var2 + this.XYZMag;
		int var9 = var4 - this.XYZMag;
		int var10 = var4 + this.XYZMag;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10]
					&& var3 == var1[var8][var10]) {
				return this;
			} else {
				Model var11;
				if (var5) {
					var11 = new Model();
					var11.field1949 = this.field1949;
					var11.field1961 = this.field1961;
					var11.field1941 = this.field1941;
					var11.verticesX = this.verticesX;
					var11.verticesZ = this.verticesZ;
					var11.indices1 = this.indices1;
					var11.indices2 = this.indices2;
					var11.indices3 = this.indices3;
					var11.field1978 = this.field1978;
					var11.field1926 = this.field1926;
					var11.field1935 = this.field1935;
					var11.field1950 = this.field1950;
					var11.field1964 = this.field1964;
					var11.field1929 = this.field1929;
					var11.field1975 = this.field1975;
					var11.field1931 = this.field1931;
					var11.field1933 = this.field1933;
					var11.field1934 = this.field1934;
					var11.field1928 = this.field1928;
					var11.field1936 = this.field1936;
					var11.field1937 = this.field1937;
					var11.field1938 = this.field1938;
					var11.verticesY = new int[var11.field1949];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field1949; ++var12) {
						var13 = var2 + this.verticesX[var12];
						var14 = var4 + this.verticesZ[var12];
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field1949; ++var12) {
						var13 = (-this.verticesY[var12] << 16) / super.modelHeight;
						if (var13 < var6) {
							var14 = var2 + this.verticesX[var12];
							var15 = var4 + this.verticesZ[var12];
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.verticesY[var12] = this.verticesY[var12] + (var6 - var13) * (var22 - var3) / var6;
						}
					}
				}

				var11.method2655();
				return var11;
			}
		} else {
			return this;
		}
	}

	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		field1960[0] = -1;
		if (this.field1939 != 1) {
			this.method2594();
		}

		this.method2593(var1);
		int var10 = var5 * var8 - var4 * var6 >> 16;
		int var11 = var2 * var7 + var3 * var10 >> 16;
		int var12 = var3 * this.XYZMag >> 16;
		int var13 = var11 + var12;
		if (var13 > 50 && var11 < 3500) {
			int var14 = var8 * var4 + var5 * var6 >> 16;
			int var15 = (var14 - this.XYZMag) * Graphics3D.field2009;
			if (var15 / var13 < Graphics3D.field2013) {
				int var16 = (var14 + this.XYZMag) * Graphics3D.field2009;
				if (var16 / var13 > Graphics3D.field2012) {
					int var17 = var3 * var7 - var10 * var2 >> 16;
					int var18 = var2 * this.XYZMag >> 16;
					int var19 = (var17 + var18) * Graphics3D.field2009;
					if (var19 / var13 > Graphics3D.field2014) {
						int var20 = var18 + (var3 * super.modelHeight >> 16);
						int var21 = (var17 - var20) * Graphics3D.field2009;
						if (var21 / var13 < Graphics3D.field2007) {
							int var22 = var12 + (var2 * super.modelHeight >> 16);
							boolean var23 = false;
							boolean var24 = false;
							if (var11 - var22 <= 50) {
								var24 = true;
							}

							boolean var25 = var24 || this.field1941 > 0;
							int var26 = class14.method85();
							int var27 = class47.method718();
							boolean var28 = class54.method813();
							if (class7.field243 && var9 > 0) {
								if (FileOnDisk.method2457(this, var6, var7, var8)) {
									class36.method489(this, var6, var7, var8, -65281);
								} else if (class7.field244 == class11.field270) {
									class36.method489(this, var6, var7, var8, -16776961);
								}
							}

							int var30;
							int var31;
							int var32;
							int var33;
							int var34;
							int var35;
							int var36;
							if (class7.field242 && var9 > 0) {
								int var39 = var11 - var12;
								if (var39 <= 50) {
									var39 = 50;
								}

								if (var14 > 0) {
									var30 = var15 / var13;
									var31 = var16 / var39;
								} else {
									var31 = var16 / var13;
									var30 = var15 / var39;
								}

								if (var17 > 0) {
									var32 = var21 / var13;
									var33 = var19 / var39;
								} else {
									var33 = var19 / var13;
									var32 = var21 / var39;
								}

								var34 = -8355840;
								var35 = var26 - Graphics3D.centerX;
								var36 = var27 - Graphics3D.centerY;
								if (var35 > var30 && var35 < var31 && var36 > var32 && var36 < var33) {
									var34 = -256;
								}

								ScriptVarType.method19(var30 + Graphics3D.centerX, var32 + Graphics3D.centerY,
										var31 + Graphics3D.centerX, var33 + Graphics3D.centerY, var34);
							}

							boolean var43 = false;
							if (var9 > 0 && var28) {
								boolean var42 = false;
								if (field1973) {
									var42 = FileOnDisk.method2457(this, var6, var7, var8);
								} else {
									var31 = var11 - var12;
									if (var31 <= 50) {
										var31 = 50;
									}

									if (var14 > 0) {
										var15 /= var13;
										var16 /= var31;
									} else {
										var16 /= var13;
										var15 /= var31;
									}

									if (var17 > 0) {
										var21 /= var13;
										var19 /= var31;
									} else {
										var19 /= var13;
										var21 /= var31;
									}

									var32 = var26 - Graphics3D.centerX;
									var33 = var27 - Graphics3D.centerY;
									if (var32 > var15 && var32 < var16 && var33 > var21 && var33 < var19) {
										var42 = true;
									}
								}

								if (var42) {
									if (this.field1938) {
										class132.field1990[++class132.field1989 - 1] = var9;
									} else {
										var43 = true;
									}
								}
							}

							var30 = Graphics3D.centerX;
							var31 = Graphics3D.centerY;
							var32 = 0;
							var33 = 0;
							if (var1 != 0) {
								var32 = field1976[var1];
								var33 = field1966[var1];
							}

							for (var34 = 0; var34 < this.field1949; ++var34) {
								var35 = this.verticesX[var34];
								var36 = this.verticesY[var34];
								int var37 = this.verticesZ[var34];
								int var38;
								if (var1 != 0) {
									var38 = var37 * var32 + var35 * var33 >> 16;
									var37 = var37 * var33 - var35 * var32 >> 16;
									var35 = var38;
								}

								var35 += var6;
								var36 += var7;
								var37 += var8;
								var38 = var37 * var4 + var5 * var35 >> 16;
								var37 = var5 * var37 - var35 * var4 >> 16;
								var35 = var38;
								var38 = var3 * var36 - var37 * var2 >> 16;
								var37 = var36 * var2 + var3 * var37 >> 16;
								field1955[var34] = var37 - var11;
								if (var37 >= 50) {
									field1953[var34] = var35 * Graphics3D.field2009 / var37 + var30;
									field1954[var34] = var31 + var38 * Graphics3D.field2009 / var37;
								} else {
									field1953[var34] = -5000;
									var23 = true;
								}

								if (var25) {
									yViewportBuffer[var34] = var35;
									field1957[var34] = var38;
									field1958[var34] = var37;
								}
							}

							try {
								this.method2610(var23, var43, this.field1938, var9);
							} catch (Exception var41) {
								;
							}

						}
					}
				}
			}
		}
	}

	public void method2603() {
		for (int var1 = 0; var1 < this.field1949; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.method2655();
	}

	public void method2606(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field1949; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.method2655();
	}

	public void method2602() {
		for (int var1 = 0; var1 < this.field1949; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.method2655();
	}

	public void method2656() {
		for (int var1 = 0; var1 < this.field1949; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.method2655();
	}

	public void method2647(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Frame var6 = var1.skeletons[var2];
				Frame var7 = var3.skeletons[var4];
				FrameMap var8 = var6.skin;
				field1916 = 0;
				field1971 = 0;
				field1972 = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.field1881; ++var11) {
					for (var12 = var6.field1882[var11]; var12 > var10; var10 = var5[var13++]) {
						;
					}

					if (var12 != var10 || var8.types[var12] == 0) {
						this.method2600(var8.types[var12], var8.list[var12], var6.translator_x[var11],
								var6.translator_y[var11], var6.translator_z[var11]);
					}
				}

				field1916 = 0;
				field1971 = 0;
				field1972 = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.field1881; ++var11) {
					for (var12 = var7.field1882[var11]; var12 > var10; var10 = var5[var13++]) {
						;
					}

					if (var12 == var10 || var8.types[var12] == 0) {
						this.method2600(var8.types[var12], var8.list[var12], var7.translator_x[var11],
								var7.translator_y[var11], var7.translator_z[var11]);
					}
				}

				this.method2655();
			} else {
				this.method2639(var1, var2);
			}
		}
	}

	final void method2611(int var1) {
		if (field1918[var1]) {
			this.method2612(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Graphics3D.rasterClipEnable = field1951[var1];
			if (this.field1964 == null) {
				Graphics3D.rasterAlpha = 0;
			} else {
				Graphics3D.rasterAlpha = this.field1964[var1] & 255;
			}

			if (this.field1975 != null && this.field1975[var1] != -1) {
				int var5;
				int var6;
				int var7;
				if (this.field1929 != null && this.field1929[var1] != -1) {
					int var8 = this.field1929[var1] & 255;
					var5 = this.field1933[var8];
					var6 = this.field1934[var8];
					var7 = this.field1928[var8];
				} else {
					var5 = var2;
					var6 = var3;
					var7 = var4;
				}

				if (this.field1935[var1] == -1) {
					Graphics3D.rasterTextureAffine(field1954[var2], field1954[var3], field1954[var4], field1953[var2],
							field1953[var3], field1953[var4], this.field1978[var1], this.field1978[var1],
							this.field1978[var1], yViewportBuffer[var5], yViewportBuffer[var6], yViewportBuffer[var7],
							field1957[var5], field1957[var6], field1957[var7], field1958[var5], field1958[var6],
							field1958[var7], this.field1975[var1]);
				} else {
					Graphics3D.rasterTextureAffine(field1954[var2], field1954[var3], field1954[var4], field1953[var2],
							field1953[var3], field1953[var4], this.field1978[var1], this.field1926[var1],
							this.field1935[var1], yViewportBuffer[var5], yViewportBuffer[var6], yViewportBuffer[var7],
							field1957[var5], field1957[var6], field1957[var7], field1958[var5], field1958[var6],
							field1958[var7], this.field1975[var1]);
				}
			} else if (this.field1935[var1] == -1) {
				Graphics3D.rasterFlat(field1954[var2], field1954[var3], field1954[var4], field1953[var2],
						field1953[var3], field1953[var4], field1912[this.field1978[var1]]);
			} else {
				Graphics3D.rasterGouraud(field1954[var2], field1954[var3], field1954[var4], field1953[var2],
						field1953[var3], field1953[var4], this.field1978[var1], this.field1926[var1],
						this.field1935[var1]);
			}

		}
	}

	void method2600(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			field1916 = 0;
			field1971 = 0;
			field1972 = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var9 = var2[var8];
				if (var9 < this.field1936.length) {
					int[] var10 = this.field1936[var9];

					for (var11 = 0; var11 < var10.length; ++var11) {
						var12 = var10[var11];
						field1916 += this.verticesX[var12];
						field1971 += this.verticesY[var12];
						field1972 += this.verticesZ[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				field1916 = var3 + field1916 / var7;
				field1971 = var4 + field1971 / var7;
				field1972 = var5 + field1972 / var7;
			} else {
				field1916 = var3;
				field1971 = var4;
				field1972 = var5;
			}

		} else {
			int[] var18;
			int var19;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field1936.length) {
						var18 = this.field1936[var8];

						for (var19 = 0; var19 < var18.length; ++var19) {
							var11 = var18[var19];
							this.verticesX[var11] += var3;
							this.verticesY[var11] += var4;
							this.verticesZ[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field1936.length) {
						var18 = this.field1936[var8];

						for (var19 = 0; var19 < var18.length; ++var19) {
							var11 = var18[var19];
							this.verticesX[var11] -= field1916;
							this.verticesY[var11] -= field1971;
							this.verticesZ[var11] -= field1972;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field1976[var14];
								var16 = field1966[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11]
										- var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field1976[var12];
								var16 = field1966[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11]
										+ var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field1976[var13];
								var16 = field1966[var13];
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesZ[var11] = var16 * this.verticesZ[var11]
										- var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							this.verticesX[var11] += field1916;
							this.verticesY[var11] += field1971;
							this.verticesZ[var11] += field1972;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field1936.length) {
						var18 = this.field1936[var8];

						for (var19 = 0; var19 < var18.length; ++var19) {
							var11 = var18[var19];
							this.verticesX[var11] -= field1916;
							this.verticesY[var11] -= field1971;
							this.verticesZ[var11] -= field1972;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128;
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128;
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128;
							this.verticesX[var11] += field1916;
							this.verticesY[var11] += field1971;
							this.verticesZ[var11] += field1972;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.field1937 != null && this.field1964 != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.field1937.length) {
							var18 = this.field1937[var8];

							for (var19 = 0; var19 < var18.length; ++var19) {
								var11 = var18[var19];
								var12 = (this.field1964[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.field1964[var11] = (byte) var12;
							}
						}
					}
				}

			}
		}
	}

	final void method2610(boolean var1, boolean var2, boolean var3, int var4) {
		if (this.field1942 < 1600) {
			int var5;
			for (var5 = 0; var5 < this.field1942; ++var5) {
				field1960[var5] = 0;
			}

			var5 = var3 ? 20 : 5;
			if (class7.field245 && var2) {
				class261.method4817(this, var5);
			}

			int var6;
			int var7;
			int var9;
			int var10;
			int var11;
			int var12;
			int var14;
			int var15;
			int var17;
			int var26;
			for (var6 = 0; var6 < this.field1961; ++var6) {
				if (this.field1935[var6] != -2) {
					var7 = this.indices1[var6];
					var26 = this.indices2[var6];
					var9 = this.indices3[var6];
					var10 = field1953[var7];
					var11 = field1953[var26];
					var12 = field1953[var9];
					int var13;
					int var16;
					if (!var1 || var10 != -5000 && var11 != -5000 && var12 != -5000) {
						if (var2) {
							var14 = field1954[var7];
							var15 = field1954[var26];
							var16 = field1954[var9];
							var17 = var5 + class132.field1984;
							boolean var31;
							if (var17 < var14 && var17 < var15 && var17 < var16) {
								var31 = false;
							} else {
								var17 = class132.field1984 - var5;
								if (var17 > var14 && var17 > var15 && var17 > var16) {
									var31 = false;
								} else {
									var17 = var5 + class132.field1985;
									if (var17 < var10 && var17 < var11 && var17 < var12) {
										var31 = false;
									} else {
										var17 = class132.field1985 - var5;
										if (var17 > var10 && var17 > var11 && var17 > var12) {
											var31 = false;
										} else {
											var31 = true;
										}
									}
								}
							}

							if (var31) {
								class132.field1990[++class132.field1989 - 1] = var4;
								var2 = false;
							}
						}

						if ((var10 - var11) * (field1954[var9] - field1954[var26])
								- (var12 - var11) * (field1954[var7] - field1954[var26]) > 0) {
							field1918[var6] = false;
							if (var10 >= 0 && var11 >= 0 && var12 >= 0 && var10 <= Graphics3D.rasterClipX
									&& var11 <= Graphics3D.rasterClipX && var12 <= Graphics3D.rasterClipX) {
								field1951[var6] = false;
							} else {
								field1951[var6] = true;
							}

							var13 = (field1955[var7] + field1955[var26] + field1955[var9]) / 3 + this.field1943;
							field1920[var13][field1960[var13]++] = var6;
						}
					} else {
						var13 = yViewportBuffer[var7];
						var14 = yViewportBuffer[var26];
						var15 = yViewportBuffer[var9];
						var16 = field1957[var7];
						var17 = field1957[var26];
						int var18 = field1957[var9];
						int var19 = field1958[var7];
						int var20 = field1958[var26];
						int var21 = field1958[var9];
						var13 -= var14;
						var15 -= var14;
						var16 -= var17;
						var18 -= var17;
						var19 -= var20;
						var21 -= var20;
						int var22 = var16 * var21 - var19 * var18;
						int var23 = var19 * var15 - var13 * var21;
						int var24 = var13 * var18 - var16 * var15;
						if (var14 * var22 + var17 * var23 + var20 * var24 > 0) {
							field1918[var6] = true;
							int var25 = (field1955[var7] + field1955[var26] + field1955[var9]) / 3 + this.field1943;
							field1920[var25][field1960[var25]++] = var6;
						}
					}
				}
			}

			int[] var8;
			if (this.field1950 == null) {
				for (var6 = this.field1942 - 1; var6 >= 0; --var6) {
					var7 = field1960[var6];
					if (var7 > 0) {
						var8 = field1920[var6];

						for (var9 = 0; var9 < var7; ++var9) {
							this.method2611(var8[var9]);
						}
					}
				}

			} else {
				for (var6 = 0; var6 < 12; ++var6) {
					field1962[var6] = 0;
					field1952[var6] = 0;
				}

				for (var6 = this.field1942 - 1; var6 >= 0; --var6) {
					var7 = field1960[var6];
					if (var7 > 0) {
						var8 = field1920[var6];

						for (var9 = 0; var9 < var7; ++var9) {
							var10 = var8[var9];
							byte var30 = this.field1950[var10];
							var12 = field1962[var30]++;
							field1977[var30][var12] = var10;
							if (var30 < 10) {
								field1952[var30] += var6;
							} else if (var30 == 10) {
								field1965[var12] = var6;
							} else {
								field1913[var12] = var6;
							}
						}
					}
				}

				var6 = 0;
				if (field1962[1] > 0 || field1962[2] > 0) {
					var6 = (field1952[1] + field1952[2]) / (field1962[1] + field1962[2]);
				}

				var7 = 0;
				if (field1962[3] > 0 || field1962[4] > 0) {
					var7 = (field1952[3] + field1952[4]) / (field1962[3] + field1962[4]);
				}

				var26 = 0;
				if (field1962[6] > 0 || field1962[8] > 0) {
					var26 = (field1952[8] + field1952[6]) / (field1962[8] + field1962[6]);
				}

				var10 = 0;
				var11 = field1962[10];
				int[] var27 = field1977[10];
				int[] var28 = field1965;
				if (var10 == var11) {
					var10 = 0;
					var11 = field1962[11];
					var27 = field1977[11];
					var28 = field1913;
				}

				if (var10 < var11) {
					var9 = var28[var10];
				} else {
					var9 = -1000;
				}

				for (var14 = 0; var14 < 10; ++var14) {
					while (var14 == 0 && var9 > var6) {
						this.method2611(var27[var10++]);
						if (var10 == var11 && var27 != field1977[11]) {
							var10 = 0;
							var11 = field1962[11];
							var27 = field1977[11];
							var28 = field1913;
						}

						if (var10 < var11) {
							var9 = var28[var10];
						} else {
							var9 = -1000;
						}
					}

					while (var14 == 3 && var9 > var7) {
						this.method2611(var27[var10++]);
						if (var10 == var11 && var27 != field1977[11]) {
							var10 = 0;
							var11 = field1962[11];
							var27 = field1977[11];
							var28 = field1913;
						}

						if (var10 < var11) {
							var9 = var28[var10];
						} else {
							var9 = -1000;
						}
					}

					while (var14 == 5 && var9 > var26) {
						this.method2611(var27[var10++]);
						if (var10 == var11 && var27 != field1977[11]) {
							var10 = 0;
							var11 = field1962[11];
							var27 = field1977[11];
							var28 = field1913;
						}

						if (var10 < var11) {
							var9 = var28[var10];
						} else {
							var9 = -1000;
						}
					}

					var15 = field1962[var14];
					int[] var29 = field1977[var14];

					for (var17 = 0; var17 < var15; ++var17) {
						this.method2611(var29[var17]);
					}
				}

				while (var9 != -1000) {
					this.method2611(var27[var10++]);
					if (var10 == var11 && var27 != field1977[11]) {
						var10 = 0;
						var27 = field1977[11];
						var11 = field1962[11];
						var28 = field1913;
					}

					if (var10 < var11) {
						var9 = var28[var10];
					} else {
						var9 = -1000;
					}
				}

			}
		}
	}

	public void method2665(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field1949; ++var4) {
			this.verticesX[var4] += var1;
			this.verticesY[var4] += var2;
			this.verticesZ[var4] += var3;
		}

		this.method2655();
	}

	public final void method2607(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		field1960[0] = -1;
		if (this.field1939 != 2 && this.field1939 != 1) {
			this.method2597();
		}

		int var8 = Graphics3D.centerX;
		int var9 = Graphics3D.centerY;
		int var10 = field1976[var1];
		int var11 = field1966[var1];
		int var12 = field1976[var2];
		int var13 = field1966[var2];
		int var14 = field1976[var3];
		int var15 = field1966[var3];
		int var16 = field1976[var4];
		int var17 = field1966[var4];
		int var18 = var16 * var6 + var17 * var7 >> 16;

		for (int var19 = 0; var19 < this.field1949; ++var19) {
			int var20 = this.verticesX[var19];
			int var21 = this.verticesY[var19];
			int var22 = this.verticesZ[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field1955[var19] = var22 - var18;
			field1953[var19] = var8 + var20 * Graphics3D.field2009 / var22;
			field1954[var19] = var9 + var23 * Graphics3D.field2009 / var22;
			if (this.field1941 > 0) {
				yViewportBuffer[var19] = var20;
				field1957[var19] = var23;
				field1958[var19] = var22;
			}
		}

		try {
			this.method2610(false, false, false, 0);
		} catch (Exception var25) {
			;
		}

	}

	public final void method2608(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		field1960[0] = -1;
		if (this.field1939 != 2 && this.field1939 != 1) {
			this.method2597();
		}

		int var9 = Graphics3D.centerX;
		int var10 = Graphics3D.centerY;
		int var11 = field1976[var1];
		int var12 = field1966[var1];
		int var13 = field1976[var2];
		int var14 = field1966[var2];
		int var15 = field1976[var3];
		int var16 = field1966[var3];
		int var17 = field1976[var4];
		int var18 = field1966[var4];
		int var19 = var17 * var6 + var18 * var7 >> 16;

		for (int var20 = 0; var20 < this.field1949; ++var20) {
			int var21 = this.verticesX[var20];
			int var22 = this.verticesY[var20];
			int var23 = this.verticesZ[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field1955[var20] = var23 - var19;
			field1953[var20] = var9 + var21 * Graphics3D.field2009 / var8;
			field1954[var20] = var10 + var24 * Graphics3D.field2009 / var8;
			if (this.field1941 > 0) {
				yViewportBuffer[var20] = var21;
				field1957[var20] = var24;
				field1958[var20] = var23;
			}
		}

		try {
			this.method2610(false, false, false, 0);
		} catch (Exception var26) {
			;
		}

	}

	public int method2596() {
		this.method2594();
		return this.XYZMag;
	}
}
