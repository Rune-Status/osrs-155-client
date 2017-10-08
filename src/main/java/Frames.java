public class Frames extends CacheableNode {

	public static int field2138;

	Frame[] skeletons;

	Frames(IndexDataBase var1, IndexDataBase var2, int var3, boolean var4) {
		Deque var5 = new Deque();
		int var6 = var1.fileCount(var3);
		this.skeletons = new Frame[var6];
		int[] var7 = var1.getChilds(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.getConfigData(var3, var7[var8]);
			FrameMap var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (FrameMap var12 = (FrameMap) var5.getFront(); var12 != null; var12 = (FrameMap) var5.getNext()) {
				if (var11 == var12.id) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.getChild(0, var11);
				} else {
					var13 = var2.getChild(var11, 0);
				}

				var10 = new FrameMap(var11, var13);
				var5.addFront(var10);
			}

			this.skeletons[var7[var8]] = new Frame(var9, var10);
		}

	}

	public boolean method2941(int var1) {
		return this.skeletons[var1].showing;
	}

	public static void method2948(String[] var0, short[] var1) {
		class64.method1131(var0, var1, 0, var0.length - 1);
	}
}
