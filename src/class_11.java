import javax.microedition.lcdui.Image;

// $FF: renamed from: l
public final class class_11 {

   // $FF: renamed from: a javax.microedition.lcdui.Image
   Image field_1186;


   // $FF: renamed from: a (int, int) l
   public static class_11 method_1184(int var0, int var1) {
      class_11 var10000 = new class_11(Image.createImage(var0, var1));
      return var10000;
   }

   // $FF: renamed from: a (int[], int, int, boolean) l
   public static class_11 method_1185(int[] var0, int var1, int var2, boolean var3) {
      class_11 var10000 = new class_11(Image.createRGBImage(var0, var1, var2, var3));
      return var10000;
   }

   // $FF: renamed from: a (int[], int, int, int, int, int, int) void
   public final void method_1186(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field_1186.getRGB(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: <init> (javax.microedition.lcdui.Image) void
   class_11(Image var1) {
      super();
      this.field_1186 = var1;
   }
}
