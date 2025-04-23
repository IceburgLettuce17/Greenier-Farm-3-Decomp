import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.InvalidRecordIDException;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

// $FF: renamed from: g
public abstract class class_1 extends Canvas implements Runnable {

   // $FF: renamed from: a javax.microedition.lcdui.Graphics
   public static Graphics field_1;
   // $FF: renamed from: b javax.microedition.lcdui.Graphics
   static Graphics field_2;
   // $FF: renamed from: o boolean
   static boolean field_3;
   // $FF: renamed from: a_ int
   static int field_4 = -1;
   // $FF: renamed from: c long
   static long field_5;
   // $FF: renamed from: a long
   private static long field_6;
   // $FF: renamed from: K int
   static int width;
   // $FF: renamed from: L int
   static int height;
   // $FF: renamed from: a javax.microedition.lcdui.Display
   static Display field_9;
   // $FF: renamed from: a boolean
   private static boolean field_10 = true;
   // $FF: renamed from: a javax.microedition.midlet.MIDlet
   static MIDlet field_11;
   // $FF: renamed from: a int
   private static int field_12;
   // $FF: renamed from: b long
   private long field_13;
   // $FF: renamed from: M int
   static int field_14;
   // $FF: renamed from: N int
   static int field_15;
   // $FF: renamed from: d long
   private static long field_16;
   // $FF: renamed from: O int
   static int field_17;
   // $FF: renamed from: b int
   private static int field_18;
   // $FF: renamed from: a g
   static class_1 field_19;
   // $FF: renamed from: p boolean
   static boolean field_20;
   // $FF: renamed from: a java.lang.String
   private static String field_21;
   // $FF: renamed from: c int
   private static int field_22;
   // $FF: renamed from: d int
   private static int field_23;
   // $FF: renamed from: e int
   private static int field_24;
   // $FF: renamed from: f int
   private static int field_25;
   // $FF: renamed from: g int
   private static int field_26;
   // $FF: renamed from: h int
   private static int field_27;
   // $FF: renamed from: a java.util.Hashtable
   private static Hashtable field_28;
   // $FF: renamed from: b java.util.Hashtable
   private static Hashtable field_29;
   // $FF: renamed from: i int
   private static int field_30;
   // $FF: renamed from: P int
   static int field_31;
   // $FF: renamed from: Q int
   static int field_32;
   // $FF: renamed from: a java.util.Random
   static Random field_33;
   // $FF: renamed from: R int
   static int field_34;
   // $FF: renamed from: S int
   static int field_35;
   // $FF: renamed from: a int[]
   private static int[] field_36;
   // $FF: renamed from: b int[]
   private static int[] field_37;
   // $FF: renamed from: T int
   static int field_38;
   // $FF: renamed from: U int
   static int field_39;
   // $FF: renamed from: j int
   private static int field_40;
   // $FF: renamed from: k int
   private static int field_41;
   // $FF: renamed from: l int
   private static int field_42;
   // $FF: renamed from: c java.lang.String
   static String field_43;
   // $FF: renamed from: a java.io.InputStream
   private static InputStream field_44;
   // $FF: renamed from: m int
   private static int field_45;
   // $FF: renamed from: a byte[]
   private static byte[] field_46;
   // $FF: renamed from: n int
   private static int field_47;
   // $FF: renamed from: o int
   private static int field_48;
   // $FF: renamed from: a short
   private static short field_49;
   // $FF: renamed from: c int[]
   private static int[] field_50;
   // $FF: renamed from: b short
   private static short field_51;
   // $FF: renamed from: a short[]
   private static short[] field_52;
   // $FF: renamed from: p int
   private static int field_53;
   // $FF: renamed from: V int
   static int field_54;
   // $FF: renamed from: b byte[]
   private static byte[] field_55;
   // $FF: renamed from: a byte[][]
   private static byte[][] field_56;
   // $FF: renamed from: q int
   private static int field_57;
   // $FF: renamed from: a char[]
   private static char[] field_58;
   // $FF: renamed from: d int[]
   private static int[] field_59;
   // $FF: renamed from: b boolean
   private static boolean field_60;
   // $FF: renamed from: d java.lang.String
   static String field_61;
   // $FF: renamed from: e int[]
   private static int[] field_62;
   // $FF: renamed from: b byte[][]
   private static byte[][] field_63;
   // $FF: renamed from: f int[]
   private static int[] field_64;
   // $FF: renamed from: b int[][]
   private static int[][] field_65;
   // $FF: renamed from: a java.lang.String[][]
   private static String[][] field_66;
   // $FF: renamed from: a javax.microedition.rms.RecordStore
   private static RecordStore field_67;
   // $FF: renamed from: r int
   private static int field_68;
   // $FF: renamed from: g int[]
   private static int[] field_69;
   // $FF: renamed from: c int[][]
   private static int[][] field_70;
   // $FF: renamed from: q boolean
   static boolean field_71;
   // $FF: renamed from: W int
   static int field_72;
   // $FF: renamed from: a int[][]
   static int[][] field_73;
   // $FF: renamed from: r boolean
   static boolean field_74;
   // $FF: renamed from: s int
   private static int field_75;
   // $FF: renamed from: t int
   private static int field_76;
   // $FF: renamed from: X int
   static int field_77;
   // $FF: renamed from: Y int
   static int field_78;
   // $FF: renamed from: Z int
   static int field_79;
   // $FF: renamed from: aa int
   static int field_80;
   // $FF: renamed from: ab int
   static int field_81;
   // $FF: renamed from: ac int
   static int field_82;
   // $FF: renamed from: ad int
   static int field_83;
   // $FF: renamed from: u int
   private static int field_84;
   // $FF: renamed from: v int
   private static int field_85;
   // $FF: renamed from: c boolean
   private static boolean field_86;
   // $FF: renamed from: d boolean
   private static boolean field_87;
   // $FF: renamed from: e boolean
   private static boolean field_88;
   // $FF: renamed from: e long
   private static long field_89;


   // $FF: renamed from: f () void
   abstract void method_1();

   // $FF: renamed from: <init> (java.lang.Object, java.lang.Object) void
   public class_1(Object var1, Object var2) {
      super();
      field_19 = this;
      field_11 = (MIDlet)var1;
      field_9 = (Display)var2;
      this.method_7();
      field_29 = new Hashtable();
      (field_28 = new Hashtable()).put(new Integer(48), new Integer(6));
      field_28.put(new Integer(49), new Integer(7));
      field_28.put(new Integer(50), new Integer(1));
      field_28.put(new Integer(51), new Integer(9));
      field_28.put(new Integer(52), new Integer(3));
      field_28.put(new Integer(53), new Integer(5));
      field_28.put(new Integer(54), new Integer(4));
      field_28.put(new Integer(55), new Integer(13));
      field_28.put(new Integer(56), new Integer(2));
      field_28.put(new Integer(57), new Integer(15));
      field_28.put(new Integer(35), new Integer(17));
      field_28.put(new Integer(42), new Integer(16));
      field_28.put(new Integer(-6), new Integer(18));
      field_28.put(new Integer(-7), new Integer(19));
      field_28.put(new Integer(-8), new Integer(24));
      field_29.put(new Integer(-5), new Integer(5));
      field_29.put(new Integer(-1), new Integer(1));
      field_29.put(new Integer(-2), new Integer(2));
      field_29.put(new Integer(-3), new Integer(3));
      field_29.put(new Integer(-4), new Integer(4));
      field_16 = System.currentTimeMillis();
      this.field_13 = field_16;
   }

   // $FF: renamed from: j () void
   protected final void initValues() {
      if(field_4 < 0) {
         width = 800;
         height = 480;
         field_81 = 0;
         if(!field_60) {
            field_59 = new int[256];

            for(int var1 = 0; var1 < 256; ++var1) {
               int var2 = var1;

               for(int var3 = 8; var3 > 0; --var3) {
                  if((var2 & 1) == 1) {
                     var2 = var2 >>> 1 ^ -306674912;
                  } else {
                     var2 >>>= 1;
                  }
               }

               field_59[var1] = var2;
            }

            field_60 = true;
         }
         if(field_33 == null) {
            field_33 = new Random(System.currentTimeMillis());
         } else {
            field_33.setSeed(System.currentTimeMillis());
         }

         field_4 = 0;
         new Thread(this).start();
      }
   }

   // $FF: renamed from: g () void
   protected void collectGarbage() {
      field_56 = null;
      System.gc();
   }

   // $FF: renamed from: h () void
   protected void method_5() {
      if(!field_3) {
         field_3 = true;
         cSoundEngine.method_1150();
      }

   }

   // $FF: renamed from: a () void
   private void method_6() {
      if(field_3) {
         long var1;
         field_5 = var1 = System.currentTimeMillis();
         field_16 = var1;
         this.field_13 = var1;
         field_3 = false;
         this.method_7();
         if(!field_10) {
            this.repaint();
         }

         method_12();
      }

   }

   public void hideNotify() {
      this.method_5();
   }

   public void showNotify() {
      this.method_6();
   }

   public void sizeChanged(int var1, int var2) {}

   // $FF: renamed from: b () void
   private void method_7() {
      this.setFullScreenMode(true);
      if(field_9 != null && field_9.getCurrent() != this) {
         field_9.setCurrent(this);
      }

   }

   public void run() {
      try {
         this.method_7();
         field_10 = false;

         while(field_4 >= 0) {
            if(!field_3) {
               this.repaint();
               this.serviceRepaints();
               long var2 = System.currentTimeMillis();
               this.field_13 = Math.min(this.field_13, var2);
               if(field_14 >= 0) {
                  if(field_14 == 0) {
                     Thread.yield();
                  } else {
                     Thread.sleep((long)field_14);
                  }
               } else {
                  Thread.sleep(Math.max(1L, (long)field_12 - (var2 - this.field_13)));
               }

               this.field_13 = System.currentTimeMillis();
            } else {
               this.field_13 = Math.min(this.field_13, System.currentTimeMillis());
               Thread.sleep(1L);
            }
         }
      } catch (Exception var4) {
         field_4 = -1;
      }

      this.collectGarbage();
      field_11.notifyDestroyed();
   }

   public void paint(Graphics var1) {
      long var3 = System.currentTimeMillis() - field_6;
      field_6 = System.currentTimeMillis();
      if(var3 > (long)3000 && field_6 != 0L) {
         this.method_5();
         this.method_6();
      }

      if(!field_3 && !field_10) {
         field_10 = true;
         if(field_4 != -1) {
            field_22 = field_25;
            field_23 = field_26;
            field_25 = 0;
            field_26 = 0;
            if(field_27 > 0) {
               if(field_27 != Integer.MAX_VALUE) {
                  field_27 -= field_15;
               }

               method_12();
            }
         }

         boolean var2;
         switch(field_81) {
         case 0:
         case 3:
         default:
            break;
         case 1:
            var2 = true;
            var2 = true;
            field_81 = 4;
            break;
         case 2:
            var2 = false;
            var2 = false;
            field_81 = 0;
         }

         if(field_86) {
            var2 = true;
            var2 = true;
            field_81 = 1;
            field_86 = false;
         } else if(field_87) {
            var2 = true;
            var2 = true;
            field_81 = 2;
            field_87 = false;
            field_88 = false;
         } else if(field_88) {
            var2 = true;
            var2 = true;
            field_81 = 3;
            field_88 = false;
         }

         field_84 = field_82;
         field_85 = field_83;
         if((field_15 = (int)((field_5 = System.currentTimeMillis()) - field_16)) < 0) {
            field_15 = 0;
         }

         if(field_15 > 1000) {
            field_15 = 1000;
         }

         field_16 = field_5;
         field_17 += field_15;
         ++field_18;

         try {
            field_2 = var1;
            field_1 = var1;
            this.method_1();
         } catch (Exception var5) {
            field_4 = -1;
         }

         field_10 = false;
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   static final void method_8(String var0) {
      field_20 = true;
      field_21 = var0;
      class_9 var10002 = new class_9();
      Thread var10000 = new Thread(var10002);
      var10000.start();
   }

   // $FF: renamed from: k () void
   static final void method_9() {
      field_20 = false;
      if(field_21 != null) {
         try {
            field_11.platformRequest(field_21);
            return;
         } catch (Exception var0) {
            ;
         }
      }

   }

   protected void keyPressed(int var1) {
      int var2 = 1 << method_11(var1);
      field_25 |= var2;
      field_24 |= var2;
   }

   protected void keyReleased(int var1) {
      int var2 = 1 << method_11(var1);
      field_26 |= var2;
      field_24 &= ~var2;
   }

   // $FF: renamed from: b (boolean, int, int) void
   public static void method_10(boolean var0, int var1, int var2) {
      Integer var4 = new Integer(var1);
      Hashtable var3 = field_28;
      if((Integer)field_28.get(var4) != null) {
         var3.remove(var4);
      }

      var3.put(var4, new Integer(var2));
   }

   // $FF: renamed from: a (int) byte
   private static byte method_11(int var0) {
      Integer var2 = new Integer(var0);
      Integer var1;
      return field_28 == null?0:((var1 = (Integer)field_28.get(var2)) != null?var1.byteValue():((var1 = (Integer)field_29.get(var2)) != null?var1.byteValue():0));
   }

   // $FF: renamed from: c () void
   private static void method_12() {
      field_22 = 0;
      field_23 = 0;
      field_24 = 0;
      field_25 = 0;
      field_26 = 0;
   }

   // $FF: renamed from: h () int
   public static int method_13() {
      if(field_22 == 0) {
         return -1;
      } else {
         int var0 = field_30;

         do {
            --var0;
            if(var0 < 0) {
               return -1;
            }
         } while((field_22 & 1 << var0) == 0);

         return var0;
      }
   }

   // $FF: renamed from: i () int
   public static int method_14() {
      if(field_23 == 0) {
         return -1;
      } else {
         int var0 = field_30;

         do {
            --var0;
            if(var0 < 0) {
               return -1;
            }
         } while((field_23 & 1 << var0) == 0);

         return var0;
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   static void method_15(String var0) {
      method_21(var0);
      field_36 = (int[])method_32(1);
      field_37 = (int[])method_32(0);
      method_24(true);
   }

   // $FF: renamed from: c (int, int) int
   static int method_16(int var0, int var1) {
      if(var1 != var0) {
         int var2;
         if((var2 = field_33.nextInt()) < 0) {
            var2 = -var2;
         }

         return var0 + var2 % (var1 - var0);
      } else {
         return var1;
      }
   }

   // $FF: renamed from: d (int) int
   static int method_17(int var0) {
      if(var0 < 0) {
         var0 = -var0;
      }

      if((var0 &= field_42 - 1) <= field_39) {
         return field_36[var0];
      } else if(var0 < field_40) {
         var0 = field_40 - var0;
         return -field_36[var0];
      } else if(var0 <= field_41) {
         var0 -= field_40;
         return -field_36[var0];
      } else {
         var0 = field_42 - var0;
         return field_36[var0];
      }
   }

   // $FF: renamed from: e (int) int
   static int method_18(int var0) {
      return var0 >= 65536?(var0 >= 16777216?(var0 >= 268435456?(var0 >= 1073741824?field_37[var0 >> 24] << 8:field_37[var0 >> 22] << 7):(var0 >= 67108864?field_37[var0 >> 20] << 6:field_37[var0 >> 18] << 5)):(var0 >= 1048576?(var0 >= 4194304?field_37[var0 >> 16] << 4:field_37[var0 >> 14] << 3):(var0 >= 262144?field_37[var0 >> 12] << 2:field_37[var0 >> 10] << 1))):(var0 >= 256?(var0 >= 4096?(var0 >= 16384?field_37[var0 >> 8]:field_37[var0 >> 6] >> 1):(var0 >= 1024?field_37[var0 >> 4] >> 2:field_37[var0 >> 2] >> 3)):(var0 >= 0?field_37[var0] >> 4:0));
   }

   // $FF: renamed from: b (int, int, int, int, int, int, int) void
   static void method_19(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var9 = var6 * var6;
      int var7;
      int var10000 = var7 = field_31 - var6;
      int var8 = var10000 * var10000;
      var6 = var7 * var6;
      field_34 = (var0 * var8 + (var2 << 1) * var6 + var4 * var9) / (1 << 16);
      field_35 = (var1 * var8 + (var3 << 1) * var6 + var5 * var9) / (1 << 16);
   }

   // $FF: renamed from: d () void
   private static void method_20() {
      int var0;
      if(field_53 == field_51 - 1) {
         var0 = field_49 - field_52[field_53];
      } else {
         var0 = field_52[field_53 + 1] - field_52[field_53];
      }

      field_50 = new int[var0 + 1];

      for(int var1 = 0; var1 < var0 + 1; ++var1) {
         field_50[var1] = method_29() & 255 | (method_29() & 255) << 8 | (method_29() & 255) << 16 | (method_29() & 255) << 24;
      }

   }

   // $FF: renamed from: c (java.lang.String) void
   static final void method_21(String var0) {
      field_45 = 1;
      if(field_43 == null || var0 == null || var0.compareTo(field_43) != 0) {
         method_24(true);
         field_43 = var0;
         field_46 = null;
         field_47 = 0;
         field_44 = method_22(field_43);
         field_49 = (short)method_30();
         field_52 = new short[field_51 = (short)method_30()];

         for(int var1 = 0; var1 < field_51; ++var1) {
            field_52[var1] = (short)method_30();
         }

         field_53 = 0;
         method_20();
      }

   }

   // $FF: renamed from: a (java.lang.String) java.io.InputStream
   private static InputStream method_22(String var0) {
      Object var1 = null;
      if(field_45 == 3) {
         var1 = new ByteArrayInputStream((byte[])null, 0, ((Object[])null).length);
      } else if(field_45 != 2 && field_45 == 1) {
         var1 = "".getClass().getResourceAsStream(var0);
      }

      return (InputStream)var1;
   }

   // $FF: renamed from: l () void
   static final void method_23() {
      method_24(true);
   }

   // $FF: renamed from: a (boolean) void
   private static final void method_24(boolean var0) {
      method_25();
      if(field_45 == 3) {
         field_46 = null;
      }

      if(var0) {
         field_43 = null;
      }

      System.gc();
   }

   // $FF: renamed from: e () void
   private static final void method_25() {
      if(field_44 != null) {
         try {
            field_44.close();
         } catch (Exception var0) {
            ;
         }

         field_44 = null;
      }

      field_48 = 0;
   }

   // $FF: renamed from: a (int) int
   private static int method_26(int var0) {
      int var1;
      for(var1 = field_51 - 1; var1 >= 0 && field_52[var1] > var0; --var1) {
         ;
      }

      String var2;
      if(field_53 != var1) {
         field_53 = var1;
         method_24(false);
         if(field_53 == 0) {
            var2 = field_43;
            field_43 = null;
            method_21(var2);
         } else {
            field_44 = method_22(field_43 + "." + field_53);
            method_20();
         }
      } else if(field_44 == null) {
         if(field_53 == 0) {
            var2 = field_43;
            field_43 = null;
            method_21(var2);
         } else {
            field_44 = method_22(field_43 + "." + field_53);
         }
      }

      var0 -= field_52[field_53];
      var1 = field_50[var0];
      var0 = field_50[var0 + 1] - field_50[var0];
      if(field_48 != var1) {
         if(field_48 > var1) {
            method_25();
            if(field_53 == 0) {
               field_44 = method_22(field_43);
            } else {
               field_44 = method_22(field_43 + "." + field_53);
            }
         } else {
            var1 -= field_48;
         }

         method_28(var1);
      }

      if(var0 > 0) {
         field_54 = method_29() & 255;
         --var0;
      }

      return var0;
   }

   // $FF: renamed from: a (int) byte[]
   static final byte[] method_27(int var0) {
      byte[] var1;
      method_31(var1 = new byte[method_26(var0)], 0, var1.length);
      return var1;
   }

   // $FF: renamed from: a (int) void
   private static void method_28(int var0) {
      if(var0 != 0) {
         if(field_45 == 3) {
            field_48 += var0;

            try {
               while(var0 > 0) {
                  var0 = (int)((long)var0 - field_44.skip((long)var0));
               }

            } catch (Exception var1) {
               ;
            }
         } else {
            if(field_55 == null) {
               field_55 = new byte[256];
            }

            while(var0 > 256) {
               method_31(field_55, 0, 256);
               var0 -= 256;
            }

            if(var0 > 0) {
               method_31(field_55, 0, var0);
            }

         }
      }
   }

   // $FF: renamed from: a () int
   private static int method_29() {
      int var0 = 0;

      try {
         var0 = field_44.read();
      } catch (Exception var1) {
         ;
      }

      ++field_48;
      return var0;
   }

   // $FF: renamed from: b () int
   private static int method_30() {
      return method_29() & 255 | (method_29() & 255) << 8;
   }

   // $FF: renamed from: b (byte[], int, int) int
   private static int method_31(byte[] var0, int var1, int var2) {
      var1 = 0;
      int var3 = var2;

      try {
         while(var3 > 0) {
            int var4 = field_44.read(var0, var1, var3);
            var3 -= var4;
            var1 += var4;
         }
      } catch (Exception var5) {
         ;
      }

      field_48 += var2;
      return var2;
   }

   // $FF: renamed from: a (int) java.lang.Object
   static final Object method_32(int var0) {
      method_26(var0);
      field_57 = 0;
      Object var1 = method_61(field_44);
      field_48 += field_57;
      return var1;
   }

   // $FF: renamed from: d (java.lang.String) void
   static void method_33(String var0) {
      if(field_56 == null) {
         InputStream var1 = field_44;
         field_44 = method_22(var0);
         int var5;
         field_56 = new byte[var5 = method_29()][];

         for(int var2 = 0; var2 < var5; ++var2) {
            int var3 = method_29();
            field_56[var2] = new byte[var3];
            method_31(field_56[var2], 0, var3);
         }

         try {
            field_44.close();
         } catch (Exception var4) {
            ;
         }

         field_44 = var1;
      }

   }

   // $FF: renamed from: a (int) java.lang.String
   static String method_34(int var0) {
      if(var0 >= field_56.length) {
         return "";
      } else {
         try {
            return new String(field_56[var0], "UTF-8");
         } catch (Exception var1) {
            return "";
         }
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int) void
   private static void method_35(Graphics var0, int var1, int var2, int var3) {
      var1 = (var1 & 255) << 16 | (var2 & 255) << 8 | var3 & 255;
      var0.setColor(var1);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, boolean) int
   static final int method_36(Graphics var0, boolean var1) {
      return var1?var0.getClipY():var0.getClipX();
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, boolean) int
   static final int method_37(Graphics var0, boolean var1) {
      return var1?class_5.field_970 - var0.getClipX() - var0.getClipWidth():var0.getClipY();
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, boolean) int
   static final int method_38(Graphics var0, boolean var1) {
      return var1?var0.getClipHeight():var0.getClipWidth();
   }

   // $FF: renamed from: d (javax.microedition.lcdui.Graphics, boolean) int
   static final int method_39(Graphics var0, boolean var1) {
      return var1?var0.getClipWidth():var0.getClipHeight();
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, boolean) void
   static final void method_40(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1;
      var1 = class_5.field_970 - var2 - var4;
      var0.clipRect(var1, var6, var4, var3);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int, boolean) void
   static final void method_41(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1;
      var1 = class_5.field_970 - var2 - var4;
      var0.setClip(var1, var6, var4, var3);
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int, boolean) void
   static final void method_42(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1;
      var1 = class_5.field_970 - var2 - 1;
      var2 = var6;
      var6 = var3;
      var3 = class_5.field_970 - var4 - 1;
      var0.drawLine(var1, var2, var3, var6);
   }

   // $FF: renamed from: d (javax.microedition.lcdui.Graphics, int, int, int, int, boolean) void
   static final void method_43(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1;
      var1 = class_5.field_970 - var2 - var4;
      var0.fillRect(var1, var6, var4, var3);
   }

   // $FF: renamed from: e (javax.microedition.lcdui.Graphics, int, int, int, int, boolean) void
   static final void method_44(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1;
      var1 = class_5.field_970 - var2 - var4 - 1;
      var0.drawRect(var1, var6, var4, var3);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, boolean) void
   static final void method_45(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var1;
      var1 = class_5.field_970 - var2 - var4;
      var5 -= 90;
      var0.fillArc(var1, var8, var4, var3, var5, var6);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, boolean) void
   static final void method_46(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = var1;
      var1 = class_5.field_970 - var2 - var4;
      var5 -= 90;
      var0.drawArc(var1, var8, var4, var3, var5, var6);
   }

   // $FF: renamed from: a (java.lang.String, int, int, int) void
   static final void method_47(String var0, int var1, int var2, int var3) {
      try {
         int var4 = var3;
         if((var3 & 2) != 0) {
            var4 = var3 & -3 | 64;
         }

         field_1.drawString(var0, var1, var2, var4);
      } catch (Exception var5) {
         ;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, l, int, int, int, boolean) void
   static final void method_48(Graphics var0, class_11 var1, int var2, int var3, int var4, boolean var5) {
      try {
         if(var5) {
            int var10002 = var1.field_1186.getWidth();
            int var7 = var1.field_1186.getHeight();
            var4 = var10002;
            method_49(var0, var1, 0, 0, var4, var7, 0, var2, var3, 20, true);
         } else {
            var0.drawImage(var1.field_1186, var2, var3, 20);
         }
      } catch (Exception var6) {
         ;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, l, int, int, int, int, int, int, int, int, boolean) void
   static final void method_49(Graphics var0, class_11 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      if(var10) {
         if(var6 == 0) {
            var6 = 5;
         } else if(var6 == 5) {
            var6 = 3;
         } else if(var6 == 3) {
            var6 = 6;
         } else if(var6 == 6) {
            var6 = 0;
         } else if(var6 == 2) {
            var6 = 7;
         }

         var3 = var7;
         var7 = class_5.field_970 - var8;
         var8 = var3;
         var9 = 24;
      }

      if(var4 >= var1.field_1186.getWidth()) {
         var4 += var1.field_1186.getWidth() - var4;
      }

      if(var5 >= var1.field_1186.getHeight()) {
         var5 += var1.field_1186.getHeight() - var5;
      }

      if(var5 > 0 && var4 > 0) {
         try {
            var0.drawRegion(var1.field_1186, 0, 0, var4, var5, var6, var7, var8, var9);
         } catch (Exception var11) {
            ;
         }
      }
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, boolean) void
   static final void method_50(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var10 = var1;
      var1 = class_5.field_970 - var2 - 1;
      var2 = var10;
      var10 = var3;
      var3 = class_5.field_970 - var4 - 1;
      var4 = var10;
      var10 = var5;
      var5 = class_5.field_970 - var6 - 1;
      var0.fillTriangle(var1, var2, var3, var4, var5, var10);
      method_42(var0, var1, var2, var3, var4, true);
      method_42(var0, var1, var2, var5, var10, true);
      method_42(var0, var5, var10, var3, var4, true);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int[], int, int, int, int, int, int, boolean, boolean, int, int, boolean) void
   static final void method_51(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, int var10, int var11, boolean var12) {
      int var13;
      if(var12) {
         var13 = var7;
         if((var10 & 4) != 0) {
            var13 = var6;
            if(((var10 &= -5) & 2) != 0) {
               var10 &= -3;
            } else {
               var10 |= 2;
            }

            if((var10 & 1) != 0) {
               var10 &= -2;
            } else {
               var10 |= 1;
            }
         } else {
            var10 |= 4;
         }

         var11 = var4;
         var4 = class_5.field_970 - var5 - var13;
         var5 = var11;
      }

      if(var10 != 0) {
         var13 = 0;
         if((var10 & 4) != 0) {
            var13 = var6;
            var6 = var7;
            var7 = var3;
            var3 = var6;
         }

         var1 = class_5.method_985(var1, var6, var7, var10, (int[])null);
         if((var10 & 4) != 0) {
            var7 = var13;
         }
      }

      var0.drawRGB(var1, 0, var3, var4, var5, var6, var7, var8);
   }

   // $FF: renamed from: a (l, int[], int, int, int, int, int, int) void
   static final void method_52(class_11 var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      var0.method_1186(var1, 0, var3, 0, 0, var6, var7);
   }

   // $FF: renamed from: a (byte[], int, byte) int
   static int method_53(byte[] var0, int var1, byte var2) {
      var0[var1++] = var2;
      return var1;
   }

   // $FF: renamed from: a (byte[], int, short) int
   static int method_54(byte[] var0, int var1, short var2) {
      var0[var1++] = (byte)var2;
      var0[var1++] = (byte)(var2 >>> 8);
      return var1;
   }

   // $FF: renamed from: a (byte[], int, int) int
   static int method_55(byte[] var0, int var1, int var2) {
      var0[var1++] = (byte)var2;
      var0[var1++] = (byte)(var2 >>> 8);
      var0[var1++] = (byte)(var2 >>> 16);
      var0[var1++] = (byte)(var2 >> 24);
      return var1;
   }

   // $FF: renamed from: a (byte[], int, long) int
   static int method_56(byte[] var0, int var1, long var2) {
      var0[var1++] = (byte)((int)(var2 & 255L));
      var0[var1++] = (byte)((int)(var2 >>> 8 & 255L));
      var0[var1++] = (byte)((int)(var2 >>> 16 & 255L));
      var0[var1++] = (byte)((int)(var2 >>> 24 & 255L));
      var0[var1++] = (byte)((int)(var2 >>> 32 & 255L));
      var0[var1++] = (byte)((int)(var2 >>> 40 & 255L));
      var0[var1++] = (byte)((int)(var2 >>> 48 & 255L));
      var0[var1++] = (byte)((int)(var2 >>> 56 & 255L));
      return var1;
   }

   // $FF: renamed from: a (byte[], int) byte
   static byte method_57(byte[] var0, int var1) {
      return var0[var1];
   }

   // $FF: renamed from: a (byte[], int) short
   static short method_58(byte[] var0, int var1) {
      return (short)(var0[var1++] & 255 | (var0[var1] & 255) << 8);
   }

   // $FF: renamed from: a (byte[], int) int
   static int method_59(byte[] var0, int var1) {
      return var0[var1++] & 255 | (var0[var1++] & 255) << 8 | (var0[var1++] & 255) << 16 | (var0[var1] & 255) << 24;
   }

   // $FF: renamed from: a (byte[], int) long
   static long method_60(byte[] var0, int var1) {
      return (long)(var0[var1++] & 255) | (long)(var0[var1++] & 255) << 8 | (long)(var0[var1++] & 255) << 16 | (long)(var0[var1++] & 255) << 24 | (long)(var0[var1++] & 255) << 32 | (long)(var0[var1++] & 255) << 40 | (long)(var0[var1++] & 255) << 48 | (long)(var0[var1] & 255) << 56;
   }

   // $FF: renamed from: a (java.io.InputStream) java.lang.Object
   private static Object method_61(InputStream var0) {
      Object var1 = null;

      try {
         int var2;
         int var3 = (var2 = method_62(var0)) >> 4;
         int var4 = var2 & 7;
         if((var2 & 8) != 0) {
            var2 = method_63(var0);
         } else {
            var2 = method_62(var0);
         }

         switch(var4) {
         case 0:
            byte[] var8 = new byte[var2];

            for(var3 = 0; var3 < var2; ++var3) {
               var8[var3] = (byte)method_62(var0);
            }

            var1 = var8;
            break;
         case 1:
            short[] var7 = new short[var2];
            if(var3 == 0) {
               for(var3 = 0; var3 < var2; ++var3) {
                  var7[var3] = (byte)method_62(var0);
               }
            } else {
               for(var3 = 0; var3 < var2; ++var3) {
                  var7[var3] = (short)method_63(var0);
               }
            }

            var1 = var7;
            break;
         case 2:
            int[] var6 = new int[var2];
            if(var3 == 0) {
               for(var3 = 0; var3 < var2; ++var3) {
                  var6[var3] = (byte)method_62(var0);
               }
            } else if(var3 == 1) {
               for(var3 = 0; var3 < var2; ++var3) {
                  var6[var3] = (short)method_63(var0);
               }
            } else {
               for(var3 = 0; var3 < var2; ++var3) {
                  var6[var3] = method_64(var0);
               }
            }

            var1 = var6;
            break;
         default:
            Object[] var9;
            switch(var4 & 3) {
            case 0:
               if(var3 == 2) {
                  var9 = (Object[])(new byte[var2][]);
               } else {
                  var9 = (Object[])(new byte[var2][][]);
               }
               break;
            case 1:
               if(var3 == 2) {
                  var9 = (Object[])(new short[var2][]);
               } else {
                  var9 = (Object[])(new short[var2][][]);
               }
               break;
            default:
               if(var3 == 2) {
                  var9 = (Object[])(new int[var2][]);
               } else {
                  var9 = (Object[])(new int[var2][][]);
               }
            }

            for(var3 = 0; var3 < var2; ++var3) {
               var9[var3] = method_61(var0);
            }

            var1 = var9;
         }
      } catch (Exception var5) {
         ;
      }

      return var1;
   }

   // $FF: renamed from: a (java.io.InputStream) int
   private static int method_62(InputStream var0) {
      int var1 = 0;
      try {
    	  if((var1 = var0.read()) >= 0) {
    		  ++field_57;
    	  }
      } catch (IOException e) {}

      return var1;
   }

   // $FF: renamed from: b (java.io.InputStream) int
   private static int method_63(InputStream var0) {
      return method_62(var0) & 255 | (method_62(var0) & 255) << 8;
   }

   // $FF: renamed from: c (java.io.InputStream) int
   private static int method_64(InputStream var0) {
      return method_62(var0) & 255 | (method_62(var0) & 255) << 8 | (method_62(var0) & 255) << 16 | (method_62(var0) & 255) << 24;
   }

   // $FF: renamed from: a (java.io.InputStream, byte[], int, int) int
   private static int method_65(InputStream var0, byte[] var1, int var2, int var3) {
      var2 = 0;
      int var4 = var3;

      try {
         while(var4 > 0) {
            int var5 = var0.read(var1, var2, var4);
            var4 -= var5;
            var2 += var5;
         }
      } catch (Exception var6) {
         ;
      }

      field_57 += var3;
      return var3;
   }

   // $FF: renamed from: a (byte[], boolean, int[]) int[]
   private static int[] method_66(byte[] var0, boolean var1, int[] var2) {
      int var3 = (var0.length & 3) == 0?var0.length >>> 2:(var0.length >>> 2) + 1;
      if(var1) {
         (var2 = new int[var3 + 1])[var3] = var0.length;
      } else {
         var2 = new int[var3];
      }

      var3 = var0.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         var2[var4 >>> 2] |= (255 & var0[var4]) << ((var4 & 3) << 3);
      }

      return var2;
   }

   // $FF: renamed from: a (byte[]) java.lang.String
   static String method_67(byte[] var0) {
      StringBuffer var1 = new StringBuffer(var0.length << 1);

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1.append(field_58[var0[var2] >> 4 & 15]);
         var1.append(field_58[var0[var2] & 15]);
      }

      return var1.toString();
   }

   // $FF: renamed from: a (int[], int, int, int) int
   static int method_68(int[] var0, int var1, int var2, int var3) {
      for(var3 = ~var3; var2-- != 0; ++var1) {
         for(int var5 = 0; var5 < 4; ++var5) {
            byte var4 = (byte)(var0[var1] >> var5);
            var3 = field_59[(var3 ^ var4) & 255] ^ var3 >>> 8;
         }
      }

      return ~var3;
   }

   // $FF: renamed from: a (byte[], java.lang.String, boolean) byte[]
   static byte[] method_69(byte[] var0, String var1, boolean var2) {
      byte[] var12 = null;
      if(!"".equals(var1) && var1 != null) {
         var12 = var1.getBytes();
      }

      if(var0.length == 0) {
         return var0;
      } else {
         int[] var10000 = method_66(var0, true, (int[])null);
         int[] var11 = method_66(var12, false, (int[])null);
         int[] var10 = var10000;
         int var15;
         int var16;
         if((var15 = var10000.length - 1) >= 1) {
            if(var11.length < 4) {
               int[] var3 = new int[4];
               System.arraycopy(var11, 0, var3, 0, var11.length);
               var11 = var3;
            }

            var16 = var10[var15];
            int var5 = -1640531527;
            int var6 = 0;

            int var4;
            int var7;
            int var8;
            for(int var9 = 6 + 52 / (var15 + 1); var9-- > 0; var16 = var10[var15] += (var16 >>> 5 ^ var4 << 2) + (var4 >>> 3 ^ var16 << 4) ^ (var6 ^ var4) + (var11[var8 & 3 ^ var7] ^ var16)) {
               var7 = (var6 += var5) >>> 2 & 3;

               for(var8 = 0; var8 < var15; ++var8) {
                  var4 = var10[var8 + 1];
                  var16 = var10[var8] += (var16 >>> 5 ^ var4 << 2) + (var4 >>> 3 ^ var16 << 4) ^ (var6 ^ var4) + (var11[var8 & 3 ^ var7] ^ var16);
               }

               var4 = var10[0];
            }
         }

         var10000 = var10;
         Object var17 = null;
         boolean var13 = false;
         var12 = new byte[var16 = var10000.length << 2];

         for(int var14 = 0; var14 < var16; ++var14) {
            var12[var14] = (byte)(var10[var14 >>> 2] >>> ((var14 & 3) << 3));
         }

         return var12;
      }
   }

   // $FF: renamed from: j () int
   static int method_70() {
      try {
         String var0;
         if((var0 = System.getProperty("microedition.locale")) == null) {
            return 0;
         }

         if((var0 = var0.toUpperCase()).indexOf("EN") >= 0) {
            return 0;
         }

         if(var0.indexOf("DE") >= 0) {
            return 1;
         }

         if(var0.indexOf("FR") >= 0) {
            return 2;
         }

         if(var0.indexOf("IT") >= 0) {
            return 3;
         }

         if(var0.indexOf("ES") >= 0) {
            return 4;
         }

         if(var0.indexOf("BR") >= 0) {
            return 5;
         }

         if(var0.indexOf("PT") >= 0) {
            return 6;
         }

         if(var0.indexOf("JA") >= 0) {
            return 7;
         }

         if(var0.indexOf("JP") >= 0) {
            return 7;
         }

         if(var0.indexOf("ZH") >= 0) {
            return 8;
         }

         if(var0.indexOf("CN") >= 0) {
            return 8;
         }

         if(var0.indexOf("KO") >= 0) {
            return 9;
         }

         if(var0.indexOf("KP") >= 0) {
            return 9;
         }

         if(var0.indexOf("KR") >= 0) {
            return 9;
         }

         if(var0.indexOf("RU") >= 0) {
            return 10;
         }

         if(var0.indexOf("PL") >= 0) {
            return 12;
         }

         if(var0.indexOf("TR") >= 0) {
            return 11;
         }

         if(var0.indexOf("CZ") >= 0) {
            return 13;
         }

         if(var0.indexOf("NL") >= 0) {
            return 14;
         }

         if(var0.indexOf("TH") >= 0) {
            return 15;
         }

         if(var0.indexOf("VI") >= 0) {
            return 16;
         }

         if(var0.indexOf("VN") >= 0) {
            return 16;
         }

         if(var0.indexOf("AR") >= 0) {
            return 17;
         }
      } catch (Exception var1) {
         ;
      }

      return 0;
   }

   // $FF: renamed from: b (int) java.lang.String
   static String method_71(int var0) {
      switch(var0) {
      case 0:
         return "EN";
      case 1:
         return "DE";
      case 2:
         return "FR";
      case 3:
         return "IT";
      case 4:
         return "ES";
      case 5:
         return "BR";
      case 6:
         return "PT";
      case 7:
         return "JP";
      case 8:
         return "CN";
      case 9:
         return "KR";
      case 10:
         return "RU";
      case 11:
         return "TR";
      case 12:
         return "PL";
      case 13:
         return "CZ";
      case 14:
         return "NL";
      case 15:
         return "TH";
      case 16:
         return "VI";
      case 17:
         return "AR";
      default:
         return null;
      }
   }

   // $FF: renamed from: d (java.io.InputStream) int
   private static int method_72(InputStream var0) {
      int var1 = 0;

      try {
         var1 = method_62(var0);
         field_64[var1] = method_64(var0);
         if(field_64[var1] > 1024) {
            field_64[var1] = 1024;
         }

         field_65[var1] = new int[field_64[var1] + 1];

         for(int var2 = 1; var2 < field_64[var1] + 1; ++var2) {
            field_65[var1][var2] = method_64(var0);
         }

         field_63[var1] = new byte[field_65[var1][field_64[var1]]];
         method_65(var0, field_63[var1], 0, field_63[var1].length);
      } catch (Exception var3) {
         ;
      }

      return var1;
   }

   // $FF: renamed from: a (java.lang.String, int) void
   static void method_73(String var0, int var1) {
      method_76(var1);
      method_21(var0);
      method_26(var1);
      int var3;
      if(field_62 == null) {
         field_62 = new int[32];

         for(var3 = 0; var3 < 32; ++var3) {
            field_62[var3] = -1;
         }

         field_63 = new byte[32][];
         field_65 = new int[32][];
         field_64 = new int[32];
         field_66 = new String[32][];
      }

      field_62[var1] = method_72(field_44);
      method_24(true);
      var3 = field_62[var1];
      if(field_64[var3] != 0) {
         String[] var4 = new String[field_64[var3]];

         for(int var2 = 0; var2 < field_64[var3]; ++var2) {
            var4[var2] = method_74(var2 + (var3 << 10));
         }

         field_66[var3] = var4;
         field_65[var3] = null;
         field_63[var3] = null;
         System.gc();
      }

   }

   // $FF: renamed from: c (int) java.lang.String
   static String method_74(int var0) {
      int var1 = var0 >> 10;
      var0 &= 1023;
      if(field_66 != null && field_66[var1] != null) {
         return field_66[var1][var0];
      } else {
         try {
            int var2;
            return (var2 = field_65[var1][var0 + 1] - field_65[var1][var0]) == 0?null:new String(field_63[var1], field_65[var1][var0], var2, field_61);
         } catch (Exception var3) {
            return null;
         }
      }
   }

   // $FF: renamed from: m () void
   static void method_75() {
      for(int var0 = 0; var0 < 32; ++var0) {
         method_76(var0);
      }

   }

   // $FF: renamed from: b (int) void
   private static void method_76(int var0) {
      if(field_62 != null) {
         int var1;
         if((var1 = field_62[var0]) == -1) {
            return;
         }

         if(field_66[var1] != null) {
            for(int var2 = 0; var2 < field_64[var1]; ++var2) {
               field_66[var1][var2] = null;
            }

            field_66[var1] = null;
         }

         field_65[var1] = null;
         field_63[var1] = null;
         field_64[var1] = 0;
         field_62[var0] = -1;
      }

   }

   // $FF: renamed from: a (long, int, java.lang.String) java.lang.String
   static String method_77(long var0, int var2, String var3) {
      if(var0 < 1000L) {
         return "" + var0;
      } else {
         String var4 = "";
         switch(var2) {
         case 0:
         case 7:
         case 8:
         case 9:
         case 15:
         case 17:
            var4 = ",";
            break;
         case 1:
         case 3:
         case 5:
         case 16:
            var4 = ".";
            break;
         case 2:
         case 4:
         case 6:
         case 10:
            if(var0 >= 10000L) {
               var4 = var3;
            }
            break;
         case 11:
         case 14:
            if(var0 >= 10000L) {
               var4 = ".";
            }
            break;
         case 12:
         case 13:
            var4 = var3;
            break;
         default:
            return "" + var0;
         }

         String var7 = "";
         long var5 = var0 % 1000L < 0L?-(var0 % 1000L):var0 % 1000L;
         var0 /= 1000L;

         while(var5 != 0L || var0 != 0L) {
            if(var5 < 10L) {
               var7 = "00" + (var5 < 0L?-var5:var5) + var7;
            } else if(var5 < 100L) {
               var7 = "0" + (var5 < 0L?-var5:var5) + var7;
            } else {
               var7 = (var5 < 0L?-var5:var5) + var7;
            }

            var5 = var0 % 1000L;
            if((var0 /= 1000L) != 0L) {
               var7 = var4 + var7;
            } else if(var5 != 0L) {
               var7 = var5 + var4 + var7;
               var5 = 0L;
            }
         }

         return var7;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String[]) java.lang.String
   static String method_78(String var0, String[] var1) {
      String var5 = "";
      if(var0.indexOf(37) < 0) {
         return var0;
      } else {
         int var3 = 0;
         int var2 = 0;

         do {
            if((var2 = var0.indexOf(37, var2)) >= 0 && var2 != var0.length() - 1) {
               if(var0.charAt(var2 + 1) == 115) {
                  int var4 = -1;
                  if(var2 + 2 < var0.length()) {
                     var4 = var0.charAt(var2 + 2) - 48;
                  }

                  if(var4 >= 0 && var4 <= 9) {
                     var5 = var5 + var0.substring(var3, var2);
                     var5 = var5 + var1[var4];
                     var2 = var3 = var2 + 3;
                  } else {
                     ++var2;
                  }
               } else {
                  ++var2;
               }
            } else {
               var5 = var5 + var0.substring(var3);
               var2 = -1;
            }
         } while(var2 >= 0);

         return var5;
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) java.lang.String
   static String method_79(String var0, String var1, String var2) {
      for(int var3 = var0.indexOf(var1); var3 != -1; var3 = var0.indexOf(var1, var3)) {
         var0 = var0.substring(0, var3) + var2 + var0.substring(var3 + var1.length());
         var3 += var2.length();
      }

      return var0;
   }

   // $FF: renamed from: i () void
   private static void method_80() {
      if(field_67 != null) {
         try {
            field_67.closeRecordStore();
         } catch (RecordStoreException var0) {
            ;
         }

         field_67 = null;
      }
   }

   // $FF: renamed from: f (java.lang.String) void
   private static void method_81(String var0) {
	   try {
		   field_67 = RecordStore.openRecordStore(var0, true);
	   } catch (RecordStoreException e) {}
   }

   // $FF: renamed from: a (java.lang.String) byte[]
   static byte[] method_82(String var0) {
      String var1 = "";
      byte[] var2 = null;
      if(!"".equals(var1)) {
         var2 = var1.getBytes();
      }

      return method_83(var0, var2);
   }

   // $FF: renamed from: a (java.lang.String, byte[]) byte[]
   private static byte[] method_83(String var0, byte[] var1) {
      var1 = null;

      try {
         method_81(var0);
         if(field_67.getNumRecords() > 0) {
            var1 = field_67.getRecord(1);
         }
      } catch (RecordStoreException var2) {
         var1 = null;
      }

      method_80();
      return var1;
   }

   // $FF: renamed from: a (java.lang.String, byte[]) void
   static void method_84(String var0, byte[] var1) {
      String var2 = "";
      byte[] var3 = null;
      if(!"".equals(var2)) {
         var3 = var2.getBytes();
      }

      method_85(var0, var1, 0, var1.length, var3);
   }

   // $FF: renamed from: a (java.lang.String, byte[], int, int, byte[]) void
   static void method_85(String var0, byte[] var1, int var2, int var3, byte[] var4) {
      method_81(var0);
      try {  
    	 if(field_67.getNumRecords() > 0) {
    		 field_67.setRecord(1, var1, 0, var3);
         } else {
             field_67.addRecord(var1, 0, var3);
         }
      } catch (InvalidRecordIDException e) {
      } catch (RecordStoreException e) {}

      method_80();
   }

   // $FF: renamed from: m (int) void
   static void method_86(int var0) {
      if(field_69 == null) {
         field_69 = new int[1];
         field_70 = new int[1][];
      }

      int var2 = 0;

      int var10000;
      while(true) {
         if(var2 >= field_69.length) {
            var10000 = -1;
            break;
         }

         if(field_69[var2] == var0) {
            var10000 = var2;
            break;
         }

         ++var2;
      }

      int var1 = var10000;
      if(var10000 == -1 || field_70 == null) {
         ++field_68;
         var1 = 0;
         field_69[0] = var0;
         if(field_70[0] == null) {
            field_70[0] = new int[256];
         }

         int[] var3;
         for(var2 = 256; var2 > 0; var3[var2] = var0) {
            var3 = field_70[0];
            --var2;
         }
      }

      field_68 = var1;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   static void method_87(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = method_36(var0, true);
      int var6 = method_37(var0, true);
      int var7 = method_38(var0, true);
      int var8 = method_39(var0, true);
      int var9 = var1 > var5?var1:var5;
      int var10 = var2 > var6?var2:var6;
      var3 = (var1 + var3 < var5 + var7?var1 + var3:var5 + var7) - var9;
      var4 = (var2 + var4 < var6 + var8?var2 + var4:var6 + var8) - var10;
      if(var3 > 0 && var4 > 0) {
         method_41(var0, var9, var10, var3, var4, true);
         var1 = var9;
         var9 = class_5.field_970 - var10 - var4;
         var10 = var1;
         var1 = var3;
         if(var4 * var3 < 256) {
            method_51(var0, field_70[field_68], 0, var4, var9, var10, var4, var3, true, true, 0, -1, false);
         } else {
            var3 = var4 + var9;
            var4 = var1 + var10;

            for(var1 = var9; var1 < var3; var1 += 16) {
               for(var2 = var10; var2 < var4; var2 += 16) {
                  method_51(var0, field_70[field_68], 0, 16, var1, var2, 16, 16, true, true, 0, -1, false);
               }
            }
         }

         method_41(var0, var5, var6, var7, var8, true);
      }
   }

   // $FF: renamed from: a (int) int[]
   public static int[] method_88(int var0) {
      return field_73[var0];
   }

   // $FF: renamed from: k () int
   public static int method_89() {
      int var0;
      if((var0 = field_72 & 1046496) != 0) {
         for(int var1 = 0; var1 < 20; ++var1) {
            if((var0 & 1 << var1) != 0) {
               return var1;
            }
         }
      }

      return -1;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int[], int, int, int, int, int, boolean) void
   private static final void method_90(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      method_51(var0, var1, 0, var2, var3, var4, var5, var6, var7, true, 0, -1, false);
   }

   // $FF: renamed from: n () void
   static final void method_91() {
      field_72 = 0;
      (field_73 = new int[20][])[13] = new int[7];
      field_73[13][1] = 100;
      field_73[13][2] = -1;
      field_73[13][0] = -1;
      field_73[13][3] = 100;
      field_73[13][4] = 100;
      field_73[13][5] = 0;
      field_73[13][6] = 0;
   }

   // $FF: renamed from: o () void
   static final void method_92() {
      field_72 |= 8192;
   }

   // $FF: renamed from: p () void
   static final void method_93() {
      field_72 &= -8193;
   }

   // $FF: renamed from: l () int
   static final int method_94() {
      int var0;
      return (var0 = field_73[13][1]) != 100?var0:field_73[13][3];
   }

   // $FF: renamed from: m () int
   static final int method_95() {
      int var0;
      return (var0 = field_73[13][1]) != 100?var0:field_73[13][4];
   }

   // $FF: renamed from: n (int) void
   static final void method_96(int var0) {
      field_73[13][1] = var0;
      field_73[13][3] = var0;
      field_73[13][4] = var0;
   }

   // $FF: renamed from: b (boolean) void
   static final void method_97(boolean var0) {
      int var1 = var0?1:0;
      field_73[13][5] = var1;
   }

   // $FF: renamed from: a (int, int, int, int, int[]) void
   static final void method_98(int var0, int var1, int var2, int var3, int[] var4) {
      var4[0] = var2 * var1 - var3 * var0 + 128 >> 8;
      var4[1] = var3 * var1 + var2 * var0 + 128 >> 8;
   }

   // $FF: renamed from: b (int, int, int, int, int[]) void
   static final void method_99(int var0, int var1, int var2, int var3, int[] var4) {
      method_98(var0, var1, 0, var3, class_5.field_985);
      int var5 = class_5.field_985[0];
      int var6 = class_5.field_985[1];
      method_98(var0, var1, var2, var3, class_5.field_985);
      var3 = class_5.field_985[0];
      int var7 = class_5.field_985[1];
      method_98(var0, var1, var2, 0, class_5.field_985);
      var0 = class_5.field_985[0];
      var1 = class_5.field_985[1];
      var4[0] = Math.max(Math.abs(var3), Math.abs(var0 - var5));
      var4[1] = Math.max(Math.abs(var7), Math.abs(var1 - var6));
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int[], int, int, int, int, int, boolean, boolean, boolean) int[]
   static final int[] method_100(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, boolean var9) {
      field_74 = var7;
      field_75 = var4;
      field_76 = var5;
      field_77 = var2;
      field_78 = var3;
      if((field_72 & 22016) != 0) {
         if((var6 & 4) != 0) {
            field_75 = var5;
            field_76 = var4;
            var4 = field_75;
            var5 = field_76;
         }

         var1 = class_5.method_985(var1, var4, var5, var6, (int[])null);
      }

      field_79 = var4;
      field_80 = var5;
      int[] var10 = class_5.method_986(var1);
      if((field_72 & 8192) != 0) {
         int var11;
         var8 = (var11 = field_73[13][0]) == 1?false:(var11 == 2?true:var8);
         int var12;
         int var13;
         int var14;
         int var15;
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         int var26;
         int var27;
         int[] var30;
         int[] var31;
         if((var11 = field_73[13][6]) % field_42 != 0) {
            var7 = true;
            int var10004 = var4;
            var14 = var6;
            var13 = var11;
            var4 = var5;
            var12 = var10004;
            var31 = var10;
            var30 = var1;
            if((var6 & 4) != 0) {
               var14 = var6 & -5;
               var20 = 90 * field_38 / 360;
               var13 = var11 + var20;
            }

            if(var14 != 0) {
               var31 = class_5.method_986(var30 = class_5.method_985(var1, var12, var5, var14, (int[])null));
            }

            int var16 = method_17(field_39 - var13);
            var17 = method_17(var13);
            method_99(var16, var17, var12, var5, class_5.field_985);
            var18 = class_5.field_985[0];
            var5 = class_5.field_985[1];
            int var29 = var18 >> 1;
            var19 = var5 >> 1;
            var20 = var18 - var12 >> 1;
            var21 = var5 - var4 >> 1;
            var15 = var19 * var16;
            var24 = -var19 * var17;
            var13 = var29 * var16;
            var14 = var29 * var17;
            int var25 = var29 - var20;
            var26 = var19 - var21;
            var20 = -var14;
            var22 = -var13;

            for(var21 = 0; var21 < var18; ++var21) {
               var23 = var20 - var15;
               var29 = var24 - var22;
               var19 = var21;

               for(var27 = 0; var27 < var5; ++var27) {
                  var13 = var25 + (var23 + 128 >> 8);
                  var14 = var26 + (var29 + 128 >> 8);
                  var23 += var16;
                  var29 += var17;
                  if(var13 >= 0 && var14 >= 0 && var13 < var12 && var14 < var4) {
                     var31[var19] = var30[var14 * var12 + var13];
                  } else {
                     var31[var19] = 0;
                  }

                  var19 += var18;
               }

               var20 += var17;
               var22 += var16;
            }

            field_77 = var2;
            field_78 = var3;
            field_79 = var18;
            field_80 = var5;
            field_74 = true;
            var1 = var31;
            var10 = class_5.method_986(var31);
            var2 = field_77;
            var3 = field_78;
            var4 = field_79;
            var5 = field_80;
            var6 &= ~var6;
         }

         var11 = method_95();
         var12 = method_94();
         int var10005 = var4;
         int var10009 = field_73[13][2];
         var18 = var6;
         boolean var36 = var7;
         var15 = var10009;
         var14 = var12;
         var4 = var5;
         var12 = var10005;
         int var35 = var2;
         var31 = var10;
         var30 = var1;
         Graphics var32 = var0;
         var19 = 0;
         var20 = var6 & -2;
         if((var6 & 4) != 0) {
            var20 = var6;
            var18 = 0;
         }

         if(var20 != 0) {
            if((var20 & 4) != 0) {
               field_75 = var5;
               field_76 = var12;
               var12 = field_75;
               var4 = field_76;
            }

            var31 = class_5.method_986(var30 = class_5.method_985(var1, var12, var4, var20, (int[])null));
         }

         var21 = var12 * var11 / 100 + (var12 * var11 % 100 != 0?1:0);
         var20 = var4 * var14 / 100 + (var4 * var14 % 100 != 0?1:0);
         field_79 = var21;
         field_80 = var20;
         if(var21 > 0 && var20 > 0) {
            var22 = (var12 << 8) / var21;
            var23 = (var4 << 8) / var20;
            method_36(var0, false);
            method_37(var0, false);
            method_38(var0, false);
            method_39(var0, false);
            var26 = var21;
            if((var27 = var31.length / var21) <= 0) {
               return null;
            } else {
               var24 = var27;
               int var28 = var3;
               int var33;
               int var34;
               if(var15 < 0) {
                  var4 = var27 * var21;
                  if((var18 & 1) != 0) {
                     var18 = (var21 - var21) * var22;
                     var33 = var22;
                  } else {
                     var18 = (var21 - 1) * var22;
                     var33 = -var22;
                  }

                  if((var24 = var20 - var20 / var27 * var27) == 0) {
                     var24 = var27;
                  }

                  var34 = var24;
                  var19 = var24 * var21;
                  var28 = var3 + var20 - var24;
                  var5 = var20;
                  var17 = var20 * var23;

                  while(true) {
                     --var5;
                     if(var5 < 0) {
                        break;
                     }

                     var14 = (((var17 -= var23) >> 8) * var12 << 8) + var18;
                     var6 = var26;

                     while(true) {
                        --var6;
                        if(var6 < 0) {
                           --var24;
                           if(var24 == 0) {
                              if(var9) {
                                 method_90(var32, var31, var21, var35, var28, var21, var34, var36);
                              }

                              var34 = var27;
                              var28 -= var27;
                              var24 = var27;
                              var19 = var4;
                           }
                           break;
                        }

                        --var19;
                        var31[var19] = var30[var14 >> 8];
                        var14 += var33;
                     }
                  }
               } else {
                  if((var18 & 1) != 0) {
                     var4 = (var21 - 1) * var22;
                     var18 = -var22;
                  } else {
                     var4 = 0;
                     var18 = var22;
                  }

                  if(!var8 && !var7) {
                     var15 = (var15 & 255) << 24;
                     var33 = 0;

                     for(var34 = 0; var33 < var20; var34 += var23) {
                        var13 = (var34 >> 8) * var12;
                        var5 = 0;

                        for(var17 = var4; var5 < var21; var17 += var18) {
                           var14 = var13 + (var17 >> 8);
                           var31[var19++] = var15 | var30[var14] & 16777215;
                           ++var5;
                        }

                        --var24;
                        if(var24 == 0) {
                           if(var9) {
                              method_90(var32, var31, var21, var35, var28, var21, var27, true);
                           }

                           var28 += var27;
                           var24 = var27;
                           var19 = 0;
                        }

                        ++var33;
                     }
                  } else if(!var8 && var7) {
                     var15 = (var15 & 255) << 24;
                     var33 = 0;

                     for(var34 = 0; var33 < var20; var34 += var23) {
                        var13 = (var34 >> 8) * var12;
                        var5 = 0;

                        for(var17 = var4; var5 < var21; var17 += var18) {
                           var14 = var13 + (var17 >> 8);
                           if((var6 = var30[var14] & 16777215) != 16711935 && var6 != 0) {
                              var31[var19++] = var15 | var6;
                           } else {
                              var31[var19++] = 0;
                           }

                           ++var5;
                        }

                        --var24;
                        if(var24 == 0) {
                           if(var9) {
                              method_90(var32, var31, var21, var35, var28, var21, var27, true);
                           }

                           var28 += var27;
                           var24 = var27;
                           var19 = 0;
                        }

                        ++var33;
                     }
                  } else {
                     var33 = 0;

                     for(var34 = 0; var33 < var20; var34 += var23) {
                        var13 = (var34 >> 8) * var12;
                        var5 = 0;

                        for(var17 = var4; var5 < var21; var17 += var18) {
                           var14 = var13 + (var17 >> 8);
                           var6 = ((var30[var14] >>> 24) * var15 >> 8 & 255 & 255) << 24;
                           var31[var19++] = var6 | var30[var14] & 16777215;
                           ++var5;
                        }

                        --var24;
                        if(var24 == 0) {
                           if(var9) {
                              method_90(var32, var31, var21, var35, var28, var21, var27, true);
                           }

                           var28 += var27;
                           var24 = var27;
                           var19 = 0;
                        }

                        ++var33;
                     }
                  }

                  if(var9 && var24 != var27) {
                     method_90(var32, var31, var21, var35, var28, var21, var27 - var24, true);
                  }
               }

               return var9?null:var31;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int) void
   static void method_101(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var5 >> 16 & 255;
      int var9 = var5 >> 8 & 255;
      var5 &= 255;
      int var10 = var6 >> 16 & 255;
      int var11 = var6 >> 8 & 255;
      var6 &= 255;
      var10 -= var8;
      var11 -= var9;
      var6 -= var5;
      var3 = var1 + var3 - 1;
      var4 = var2 + var4 - 1;
      var8 <<= 16;
      var9 <<= 16;
      var5 <<= 16;
      if(var7 == 4) {
         var7 = var3 - var1;
         var10 = (var10 << 16) / var7;
         var11 = (var11 << 16) / var7;
         var6 = (var6 << 16) / var7;

         for(var7 = var3; var7 >= var1; --var7) {
            method_35(var0, var8 >> 16, var9 >> 16, var5 >> 16);
            method_42(var0, var7, var2, var7, var4, true);
            var8 += var10;
            var9 += var11;
            var5 += var6;
         }

      } else if(var7 == 8) {
         var7 = var3 - var1;
         var10 = (var10 << 16) / var7;
         var11 = (var11 << 16) / var7;
         var6 = (var6 << 16) / var7;

         for(var7 = var1; var7 <= var3; ++var7) {
            method_35(var0, var8 >> 16, var9 >> 16, var5 >> 16);
            method_42(var0, var7, var2, var7, var4, true);
            var8 += var10;
            var9 += var11;
            var5 += var6;
         }

      } else if(var7 == 16) {
         var7 = var4 - var2;
         var10 = (var10 << 16) / var7;
         var11 = (var11 << 16) / var7;
         var6 = (var6 << 16) / var7;

         for(var7 = var4; var7 >= var2; --var7) {
            method_35(var0, var8 >> 16, var9 >> 16, var5 >> 16);
            method_42(var0, var1, var7, var3, var7, true);
            var8 += var10;
            var9 += var11;
            var5 += var6;
         }

      } else {
         if(var7 == 32) {
            var7 = var4 - var2;
            var10 = (var10 << 16) / var7;
            var11 = (var11 << 16) / var7;
            var6 = (var6 << 16) / var7;

            for(var7 = var2; var7 <= var4; ++var7) {
               method_35(var0, var8 >> 16, var9 >> 16, var5 >> 16);
               method_42(var0, var1, var7, var3, var7, true);
               var8 += var10;
               var9 += var11;
               var5 += var6;
            }
         }

      }
   }

   // $FF: renamed from: a (int, int, int, int) void
   static void method_102(int var0, int var1, int var2, int var3) {
      method_103(field_1, 0, var0, var1, var2, var3, 0, 16);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int) void
   static void method_103(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3;
      int var9 = var4;
      if(var7 == 16 || var7 == 32) {
         var8 = var4;
         var9 = var3;
      }

      int var10;
      if(var7 == 4 || var7 == 16) {
         var10 = var5;
         var5 = var6;
         var6 = var10;
      }

      int[] var11 = class_5.method_939((int[])null);
      int var12 = var9 < var11.length / var8?var9:var11.length / var8;
      int var13 = var5 >>> 24;
      int var14 = var5 >> 16 & 255;
      int var15 = var5 >> 8 & 255;
      int var16 = var5 & 255;
      var10 = var6 >>> 24;
      int var17 = var6 >> 16 & 255;
      int var18 = var6 >> 8 & 255;
      var6 &= 255;
      --var8;
      int var19 = (var10 - var13 << 16) / var8;
      var17 = (var17 - var14 << 16) / var8;
      int var20 = (var18 - var15 << 16) / var8;
      int var21 = (var6 - var16 << 16) / var8;
      ++var8;
      var13 <<= 16;
      var14 <<= 16;
      var15 <<= 16;
      var16 <<= 16;
      if(var7 != 4 && var7 != 8) {
         var18 = 1;
         var6 = 0;
      } else {
         var18 = var3;
         var6 = -(var3 * var12) + 1;
      }

      var10 = 0;
      int var22 = 0;

      while(var22 < var8) {
         int var23 = var12;

         while(true) {
            --var23;
            if(var23 < 0) {
               var13 += var19;
               var14 += var17;
               var15 += var20;
               var16 += var21;
               var5 = var13 << 8 & -16777216 | var14 & 16711680 | var15 >> 8 & '\uff00' | var16 >> 16 & 255;
               var10 += var6;
               ++var22;
               break;
            }

            var11[var10] = var5;
            var10 += var18;
         }
      }

      if(var7 != 4 && var7 != 8) {
         if(var7 == 16 || var7 == 32) {
            while(var9 > 0) {
               var8 = var12 < var9?var12:var9;
               method_51(var0, var11, 0, var12, var1, var2, var8, var4, true, true, 0, -1, true);
               var1 += var12;
               var9 -= var12;
            }
         }
      } else {
         while(var9 > 0) {
            var10 = var12 < var9?var12:var9;
            method_51(var0, var11, 0, var3, var1, var2, var3, var10, true, true, 0, -1, true);
            var2 += var12;
            var9 -= var12;
         }
      }

   }

   public void addCommand(Command var1) {
      super.addCommand(var1);
   }

   // $FF: renamed from: q () void
   public static final void method_104() {
      field_81 = 0;
   }

   // $FF: renamed from: t () void
   private static final void method_105() {
      int var0 = field_83;
      field_83 = height - field_82;
      field_82 = var0;
   }

   protected void pointerReleased(int var1, int var2) {
      field_82 = var1;
      field_83 = var2;
      method_105();
      field_87 = true;
   }

   protected void pointerPressed(int var1, int var2) {
      field_82 = var1;
      field_83 = var2;
      method_105();
      field_86 = true;
   }

   protected void pointerDragged(int var1, int var2) {
      field_82 = var1;
      field_83 = var2;
      method_105();
      field_88 = true;
   }

   // $FF: renamed from: g () boolean
   static final boolean method_106() {
      return field_81 == 2;
   }

   // $FF: renamed from: h () boolean
   static final boolean method_107() {
      return field_81 == 1;
   }

   // $FF: renamed from: i () boolean
   static final boolean method_108() {
      return field_81 == 3;
   }

   // $FF: renamed from: j () boolean
   static final boolean method_109() {
      return field_81 == 4;
   }

   // $FF: renamed from: k () boolean
   static final boolean method_110() {
      return field_81 == 4 || field_81 == 1 || field_81 == 3;
   }

   // $FF: renamed from: l () boolean
   static boolean method_111() {
      return class_14.method_1246();
   }

   // $FF: renamed from: e (java.lang.String) void
   static void method_112(String var0) {
      class_14.method_1244(var0);
   }

   // $FF: renamed from: a (int, java.lang.String) void
   static void method_113(int var0, String var1) {
      if(System.currentTimeMillis() - field_89 > 3000L) {
         field_89 = System.currentTimeMillis();
         class_14.method_1249(class_14.method_1270(var0, var1), var1);
      }
   }

   // $FF: renamed from: r () void
   static void method_114() {
      if(System.currentTimeMillis() - field_89 > 3000L) {
         field_89 = System.currentTimeMillis();
         class_14.method_1250();
      }
   }

   // $FF: renamed from: n () int
   static int method_115() {
      return class_14.method_1251();
   }

   // $FF: renamed from: j (int) boolean
   static boolean method_116(int var0) {
      return class_14.method_1254(var0);
   }

   // $FF: renamed from: m () boolean
   static boolean method_117() {
      return class_14.method_1248();
   }

   // $FF: renamed from: o () int
   static int method_118() {
      return class_14.method_1253();
   }

   // $FF: renamed from: p () int
   static int method_119() {
      return class_14.method_1252();
   }

   // $FF: renamed from: a (int, java.lang.String) java.lang.String
   static String method_120(int var0, String var1) {
      return class_14.method_1262(class_14.method_1270(var0, var1));
   }

   // $FF: renamed from: a () java.lang.String
   static String method_121() {
      return class_14.method_1267();
   }

   // $FF: renamed from: b () java.lang.String
   static String method_122() {
      return class_14.method_1299();
   }

   // $FF: renamed from: s () void
   static void method_123() {
      class_14.method_1256();
   }

   // $FF: renamed from: a (long, int, java.lang.String) long
   static long method_124(long var0, int var2, String var3) {
      var2 = class_14.method_1270(var2, var3);
      return class_14.method_1264(var0, var2);
   }

   // $FF: renamed from: q () int
   static int method_125() {
      return class_14.method_1297();
   }

   // $FF: renamed from: a (int, java.lang.String) int
   static int method_126(int var0, String var1) {
      return class_14.method_1298(class_14.method_1270(var0, var1));
   }

   // $FF: renamed from: a (java.lang.String) int
   static int method_127(String var0) {
      return class_14.method_1268(var0);
   }

   // $FF: renamed from: b (int, java.lang.String) int
   static int method_128(int var0, String var1) {
      return class_14.method_1270(var0, var1);
   }

   // $FF: renamed from: a (long) long
   static long method_129(long var0) {
      int var2 = class_14.method_1253();
      String var3 = class_14.method_1290();
      return method_124(var0, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   public class_1() {
      field_1 = null;
      field_2 = null;
      width = 800;
      height = 480;
      field_12 = 50;
      field_14 = -1;
      field_20 = false;
      field_21 = null;
      field_30 = 25;
      field_31 = 256;
      field_32 = 128;
      field_38 = 256;
      field_39 = 90 * field_38 / 360;
      field_40 = 180 * field_38 / 360;
      field_41 = 270 * field_38 / 360;
      field_42 = 360 * field_38 / 360;
      field_57 = 0;
      field_58 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
      byte[] var10000 = new byte[]{(byte)-128, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
      char[] var0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
      field_61 = "UTF-8";
      field_71 = true;
      field_72 = 0;
      field_73 = null;
      var0 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
      field_89 = 0L;
   }
}
