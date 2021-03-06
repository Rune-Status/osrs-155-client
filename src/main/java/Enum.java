public class Enum extends CacheableNode {

	public static NodeCache field3400;

	public static IndexDataBase field3405;

	public String defaultString;

	public char keyType;

	public char valType;

	public int size;

	public int defaultInt;

	public int[] keys;

	public String[] stringVals;

	public int[] intVals;

	static {
		field3400 = new NodeCache(64);
	}

	public Enum() {
		this.defaultString = "null";
		this.size = 0;
	}

	void method4572(Buffer var1, int var2) {
		if (var2 == 1) {
			this.keyType = (char) var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.valType = (char) var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultString = var1.readString();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.size = var1.readUnsignedShort();
				this.keys = new int[this.size];
				this.stringVals = new String[this.size];

				for (var3 = 0; var3 < this.size; ++var3) {
					this.keys[var3] = var1.readInt();
					this.stringVals[var3] = var1.readString();
				}
			} else if (var2 == 6) {
				this.size = var1.readUnsignedShort();
				this.keys = new int[this.size];
				this.intVals = new int[this.size];

				for (var3 = 0; var3 < this.size; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method4572(var1, var2);
		}
	}
}
