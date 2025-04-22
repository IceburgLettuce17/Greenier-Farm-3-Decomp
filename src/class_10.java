import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.control.MIDIControl;
import javax.microedition.media.control.TempoControl;
import javax.microedition.media.control.VolumeControl;

// $FF: renamed from: k
final class class_10 implements Runnable {

   // $FF: renamed from: c int
   private int field_1134;
   // $FF: renamed from: d int
   private int field_1135;
   // $FF: renamed from: a int
   int field_1136;
   // $FF: renamed from: a e
   class_5 field_1137;
   // $FF: renamed from: e int
   private int field_1138;
   // $FF: renamed from: f int
   private int field_1139;
   // $FF: renamed from: g int
   private int field_1140;
   // $FF: renamed from: h int
   private int field_1141;
   // $FF: renamed from: i int
   private int field_1142;
   // $FF: renamed from: a boolean
   private boolean field_1143;
   // $FF: renamed from: j int
   private int field_1144;
   // $FF: renamed from: k int
   private static int field_1145;
   // $FF: renamed from: l int
   private int field_1146;
   // $FF: renamed from: m int
   private static int field_1147;
   // $FF: renamed from: b int
   static int field_1148;
   // $FF: renamed from: n int
   private static int field_1149;
   // $FF: renamed from: b boolean
   private static boolean field_1150;
   // $FF: renamed from: a byte[][]
   private static byte[][] field_1151;
   // $FF: renamed from: a int[]
   private static int[] field_1152;
   // $FF: renamed from: a javax.microedition.media.Player[]
   private static Player[] field_1153;
   // $FF: renamed from: b int[]
   private static int[] field_1154;
   // $FF: renamed from: c int[]
   private static int[] field_1155;
   // $FF: renamed from: d int[]
   private static int[] field_1156;
   // $FF: renamed from: e int[]
   private static int[] field_1157;
   // $FF: renamed from: f int[]
   private static int[] field_1158;
   // $FF: renamed from: a java.lang.Thread
   private static Thread field_1159;
   // $FF: renamed from: a k
   private static class_10 field_1160;
   // $FF: renamed from: g int[]
   private static int[] field_1161;
   // $FF: renamed from: h int[]
   private static int[] field_1162;
   // $FF: renamed from: i int[]
   private static int[] field_1163;
   // $FF: renamed from: c boolean
   private static boolean field_1164;
   // $FF: renamed from: j int[]
   private static int[] field_1165;
   // $FF: renamed from: k int[]
   private static int[] field_1166;
   // $FF: renamed from: l int[]
   private static int[] field_1167;
   // $FF: renamed from: m int[]
   private static int[] field_1168;
   // $FF: renamed from: n int[]
   private static int[] field_1169;
   // $FF: renamed from: a boolean[]
   private static boolean[] field_1170;
   // $FF: renamed from: o int[]
   private static int[] field_1171;
   // $FF: renamed from: o int
   private static int field_1172;
   // $FF: renamed from: d boolean
   private static boolean field_1173;
   // $FF: renamed from: p int
   private static int field_1174;
   // $FF: renamed from: q int
   private static int field_1175;
   // $FF: renamed from: r int
   private static int field_1176;
   // $FF: renamed from: p int[]
   private static int[] field_1177;
   // $FF: renamed from: a int[][]
   private static int[][] field_1178;
   // $FF: renamed from: a byte[][][]
   private static byte[][][] field_1179;
   // $FF: renamed from: a l[][]
   private static class_11[][] field_1180;
   // $FF: renamed from: a javax.microedition.lcdui.Graphics[][]
   static Graphics[][] field_1181;
   // $FF: renamed from: a int[][][]
   private static int[][][] field_1182;
   // $FF: renamed from: s int
   private static int field_1183;
   // $FF: renamed from: a e[]
   private static class_5[] field_1184;
   // $FF: renamed from: t int
   private static int field_1185;


   // $FF: renamed from: <init> () void
   class_10() {
      super();
      this.method_1104();
   }

   // $FF: renamed from: <init> (e, int, int) void
   class_10(class_5 var1, int var2, int var3) {
      super();
      this.method_1104();
      this.field_1134 = var2;
      this.field_1135 = var3;
      this.method_1107(var1);
   }

   // $FF: renamed from: a () void
   final void method_1104() {
      this.field_1134 = 0;
      this.field_1135 = 0;
      this.field_1138 = -1;
      this.field_1139 = 0;
      this.field_1137 = null;
      this.field_1136 = 0;
      this.field_1140 = 0;
      this.field_1142 = 1;
      this.field_1146 = -1;
      this.field_1143 = true;
      this.field_1144 = -1;
   }

   // $FF: renamed from: a (int, int) void
   final void method_1105(int var1, int var2) {
      this.field_1134 = var1;
      this.field_1135 = var2;
   }

   // $FF: renamed from: a () e
   final class_5 method_1106() {
      return this.field_1137;
   }

   // $FF: renamed from: a (e) void
   final void method_1107(class_5 var1) {
      this.field_1137 = var1;
      if(var1 != null) {
         this.method_1109(-1, -1);
      } else {
         this.field_1138 = -1;
      }
   }

   // $FF: renamed from: a (int, int, boolean) void
   final void method_1108(int var1, int var2, boolean var3) {
      if(var3) {
         this.method_1109(-1, 1);
      }

      this.method_1109(var1, var2);
   }

   // $FF: renamed from: b (int, int) void
   final void method_1109(int var1, int var2) {
      if(field_1143 || var1 != this.field_1138) {
         this.field_1138 = var1;
         this.field_1141 = field_1145;
         if(this.field_1138 >= 0) {
            int var3 = this.method_1116();
            var3 = 0 % var3;
            this.field_1139 = var3;
            this.field_1140 = 0;
         }

         this.field_1142 = var2 - 1;
         this.field_1143 = false;
      }

   }

   // $FF: renamed from: a () int
   final int method_1110() {
      return this.field_1138;
   }

   // $FF: renamed from: b () void
   final void method_1111() {
      this.field_1139 = class_1.method_16(0, this.method_1116());
      this.field_1140 = 0;
   }

   // $FF: renamed from: b () int
   final int method_1112() {
      return this.field_1139;
   }

   // $FF: renamed from: a (int) void
   final void method_1113(int var1) {
      switch(var1) {
      case 0:
         this.field_1136 = 0;
         return;
      case 1:
         this.field_1136 = 2;
         return;
      case 2:
         this.field_1136 = 1;
         return;
      case 3:
         this.field_1136 = 3;
         return;
      case 4:
         this.field_1136 = 5;
      case 5:
         this.field_1136 = 4;
         return;
      case 6:
         this.field_1136 = 7;
         return;
      case 7:
         this.field_1136 = 6;
         return;
      default:
      }
   }

   // $FF: renamed from: b (int) void
   final void method_1114(int var1) {
      this.field_1146 = var1;
   }

   // $FF: renamed from: c () int
   final int method_1115() {
      return this.field_1142;
   }

   // $FF: renamed from: g () int
   private int method_1116() {
      return this.field_1138 >= 0?this.field_1137.method_912(this.field_1138):-1;
   }

   // $FF: renamed from: h () int
   private int method_1117() {
      return this.field_1138 >= 0?this.field_1137.method_911(this.field_1138, this.field_1139) * this.field_1141:0;
   }

   // $FF: renamed from: a () boolean
   final boolean method_1118() {
      return this.field_1138 < 0?true:(this.field_1142 < 0?false:this.field_1143);
   }

   // $FF: renamed from: c () void
   final void method_1119() {
      if(this.field_1138 >= 0) {
         if(!this.field_1143) {
            boolean var1 = false;
            if(this.field_1144 != -1 && this.field_1144 != 100 && (class_1.field_72 & 8192) == 0) {
               var1 = true;
               class_1.method_92();
               class_1.method_96(this.field_1144);
            }

            if(this.field_1146 != -1) {
               int var2 = this.field_1137.method_972();
               this.field_1137.method_971(this.field_1146);
               this.field_1137.method_979(class_1.field_1, this.field_1138, this.field_1139, this.field_1134, this.field_1135, this.field_1136);
               this.field_1137.method_971(var2);
            } else {
               this.field_1137.method_979(class_1.field_1, this.field_1138, this.field_1139, this.field_1134, this.field_1135, this.field_1136);
            }

            if(var1) {
               class_1.field_72 &= -1046497;
            }

         }
      }
   }

   // $FF: renamed from: c (int) void
   final void method_1120(int var1) {
      if(!this.field_1143 && this.field_1138 >= 0) {
         int var2;
         if((var2 = this.method_1117()) != 0) {
            while(this.field_1140 >= var2) {
               this.field_1140 -= var2;
               if(this.field_1139 < this.field_1137.method_912(this.field_1138) - 1) {
                  ++this.field_1139;
               } else {
                  if(this.field_1142 == 0) {
                     this.field_1143 = true;
                     break;
                  }

                  if(this.field_1142 > 0) {
                     --this.field_1142;
                  }

                  this.field_1139 = 0;
               }

               if((var2 = this.method_1117()) == 0) {
                  break;
               }
            }

            this.field_1140 += var1;
         }
      }
   }

   // $FF: renamed from: d (int) void
   final void method_1121(int var1) {
      this.field_1144 = var1;
   }

   // $FF: renamed from: a (int) javax.microedition.media.Player
   static final Player method_1122(int var0) {
      if(var0 < 0) {
         (new StringBuffer()).append("Snd_GetChannelPlayer: Index is negative [").append(var0).append("]");
      }

      if(var0 >= field_1147) {
         (new StringBuffer()).append("Snd_GetChannelPlayer: Index [").append(var0).append("] is out of range. Max channels is ").append(field_1147);
      }

      return field_1153[var0];
   }

   // $FF: renamed from: c (int) int
   private static final int method_1123(int var0) {
      while(var0 >= 7) {
         var0 -= 7;
      }

      while(var0 < 0) {
         var0 += 7;
      }

      return var0;
   }

   // $FF: renamed from: a (int, int, int, int, int, int) void
   private static synchronized void method_1124(int var0, int var1, int var2, int var3, int var4, int var5) {
      if(field_1150) {
         int var6 = field_1162[var0];
         int var7 = field_1163[var0];
         var6 = method_1123(var6 + var7);

         int var8;
         for(int var9 = 0; var9 < var7; ++var9) {
            var8 = method_1123(var6 - var9 - 1);
            var8 = var0 * 7 * 5 + var8 * 5;
            if(field_1161[var8] == var1 && (var1 != 3 && var1 != 1 || field_1161[var8 + 2] >= var3)) {
               field_1161[var8] = 0;
            }
         }

         var8 = var0 * 7 * 5 + var6 * 5;
         field_1161[var8] = var1;
         field_1161[var8 + 1] = var2;
         field_1161[var8 + 2] = var3;
         field_1161[var8 + 3] = var4;
         field_1161[var8 + 4] = var5;
         ++field_1163[var0];
      }

   }

   // $FF: renamed from: b (int, int, int, int, int, int) void
   private static void method_1125(int var0, int var1, int var2, int var3, int var4, int var5) {
      method_1124(var0, var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (int, int[]) void
   private static synchronized void method_1126(int var0, int[] var1) {
      var1[5] = field_1163[var0];
      if(field_1163[var0] > 0) {
         int var2 = field_1162[var0];
         var2 = var0 * 7 * 5 + var2 * 5;
         System.arraycopy(field_1161, var2, var1, 0, 5);
         field_1162[var0] = method_1123(field_1162[var0] + 1);
         --field_1163[var0];
      }

   }

   // $FF: renamed from: e (int) void
   static void method_1127(int var0) {
      field_1153 = new Player[field_1147];
      field_1154 = new int[field_1147];
      field_1155 = new int[field_1147];
      field_1156 = new int[field_1147];
      field_1157 = new int[field_1147];
      field_1158 = new int[field_1147];
      field_1161 = new int[field_1147 * 7 * 5];
      field_1162 = new int[field_1147];
      field_1163 = new int[field_1147];
      field_1165 = new int[6];
      field_1166 = new int[field_1147 * 3];
      field_1167 = new int[field_1147 * 3];
      field_1168 = new int[(field_1147 << 4) * 9];
      field_1169 = new int[field_1147];
      field_1170 = new boolean[field_1147];
      field_1171 = new int[field_1147];

      for(var0 = 0; var0 < field_1147; ++var0) {
         field_1169[var0] = 0;
         field_1166[var0 * 3] = 0;
         field_1167[var0 * 3] = 0;
         field_1170[var0] = false;

         for(int var1 = 0; var1 < 16; ++var1) {
            int var2 = ((var0 << 4) + var1) * 9;
            field_1168[var2] = 0;
            field_1168[var2 + 3] = 127;
         }

         field_1171[var0] = 0;
      }

      field_1172 = 0;

      for(var0 = 0; var0 < field_1147; ++var0) {
         field_1154[var0] = -1;
         field_1162[var0] = 0;
         field_1163[var0] = 0;
      }

      field_1149 = 119;
      field_1151 = new byte[119][];
      field_1152 = new int[field_1149];
      field_1148 = 100;
      field_1150 = true;
      class_10 var10000 = new class_10();
      field_1160 = var10000;
      (field_1159 = new Thread(field_1160)).start();
   }

   // $FF: renamed from: a (java.lang.String, int, boolean) void
   static void method_1128(String var0, int var1, boolean var2) {
      if(field_1150) {
         if(var1 >= 0) {
            class_1.method_21(var0);
            byte[] var10000 = class_1.method_27(var1);
            int var4 = var1;
            var1 = class_1.field_54;
            byte[] var3 = var10000;
            if(field_1150) {
               if(var3 == null || var3.length <= 0) {
                  return;
               }

               field_1151[var4] = var3;
               field_1152[var4] = var1;
            }

         }
      }
   }

   // $FF: renamed from: a (int) boolean
   static boolean method_1129(int var0) {
      return field_1151 != null && var0 < field_1151.length && field_1151[var0] != null;
   }

   // $FF: renamed from: f (int) void
   static void method_1130(int var0) {
      if(field_1150) {
         if(var0 >= 0) {
            field_1151[var0] = null;
            System.gc();
         }
      }
   }

   // $FF: renamed from: a (int, int, int, int, int) void
   static void method_1131(int var0, int var1, int var2, int var3, int var4) {
      if(var2 < 0) {
         (new StringBuffer()).append("Snd_Play: Invalid loop number of ").append(var2);
      }

      if(var0 >= field_1147) {
         (new StringBuffer()).append("Snd_Play: Attempting to play on channel ").append(var0).append(" while only have max ").append(field_1147);
      }

      if(var1 >= 0 && var3 != 0) {
         method_1125(var0, 3, var1, var4, var3, var2);
      }
   }

   // $FF: renamed from: a (int, boolean) void
   static final void method_1132(int var0, boolean var1) {
      method_1125(var0, 4, -1, -1, -1, -1);
      int var2 = var0;
      method_1146(0, var0);
      method_1147(0, var0);

      for(var0 = 0; var0 < 16; ++var0) {
         method_1148(0, var2, var0, 0);
      }

   }

   // $FF: renamed from: c (int, int, int) void
   private static void method_1133(int var0, int var1, int var2) {
      if(field_1156[var0] != 2 || field_1155[var0] >= var2) {
         if(field_1154[var0] != var1 || field_1156[var0] == 0) {
            method_1140(var0);
            if(field_1153[var0] == null) {
               if(field_1151[var1] == null) {
                  return;
               }
               try {
            	   field_1153[var0] = Manager.createPlayer(new ByteArrayInputStream(field_1151[var1]), class_1.method_34(field_1152[var1]));
               } catch (IOException e) {
               } catch (MediaException e2) {}
            }

            if(field_1153[var0] != null) {
               try {
            	   field_1153[var0].realize();
            	   field_1153[var0].prefetch();
            	   field_1156[var0] = 1;
            	   field_1154[var0] = var1;
               } catch (MediaException e3) {}
            }
         }
      }
   }

   // $FF: renamed from: c (int, int, int, int, int) void
   private static void method_1134(int var0, int var1, int var2, int var3, int var4) {
      if(!class_1.field_3) {
         method_1133(var0, var1, var2);
         if(!class_1.field_3) {
            if(field_1156[var0] == 1 && field_1153[var0] != null) {
               if(var3 == 0) {
                  field_1153[var0].setLoopCount(-1);
               } else {
                  field_1153[var0].setLoopCount(var3);
               }

               ((VolumeControl)field_1153[var0].getControl("VolumeControl")).setLevel(var4 * field_1148 * 100 / 10000);
               try {
            	   field_1153[var0].setMediaTime(0L);
            	   field_1153[var0].start();
               } catch (MediaException e) {
               } finally {
            	   field_1156[var0] = 2;
            	   field_1157[var0] = var4;
            	   field_1158[var0] = var3;
               	   field_1155[var0] = var2;
               	   field_1154[var0] = var1;
               }
            }
         }
      }
   }

   // $FF: renamed from: g (int) void
   static void method_1135(int var0) {
      if(field_1150) {
         field_1148 = var0;

         try {
            for(var0 = 0; var0 < field_1147; ++var0) {
               method_1137(var0, field_1157[var0]);
            }

         } catch (Exception var1) {
            ;
         }
      }
   }

   // $FF: renamed from: d (int) int
   private static int method_1136(int var0) {
      if(!field_1150) {
         return 0;
      } else {
         int var1 = 0;

         try {
            if(field_1153[var0] == null) {
               boolean var3 = false;
            }

            var1 = ((VolumeControl)field_1153[var0].getControl("VolumeControl")).getLevel() * 100 * 100 / (field_1148 * 100);
         } catch (Exception var2) {
            ;
         }

         return var1;
      }
   }

   // $FF: renamed from: c (int, int) void
   private static void method_1137(int var0, int var1) {
      if(field_1150 && field_1153[var0] != null) {
         try {
            if(field_1153[var0] != null) {
               ((VolumeControl)field_1153[var0].getControl("VolumeControl")).setLevel(var1 * field_1148 * 100 / 10000);
            }

         } catch (Exception var2) {
            ;
         }
      }
   }

   // $FF: renamed from: g () void
   private static void method_1138() {
      if(field_1150) {
         if(!field_1164) {
            field_1164 = true;

            for(int var0 = 0; var0 < field_1147; ++var0) {
               int[] var1 = field_1165;
               method_1126(var0, field_1165);
               if(field_1165[5] > 0) {
                  if(field_1156[var0] == 2) {
                     boolean var4;
                     try {
                        var4 = method_1139(var0);
                     } catch (Exception var2) {
                        (new StringBuffer()).append("Snd_update.error on channel (").append(var0).append(").").append(var2);
                        var4 = false;
                     }

                     if(!var4) {
                        field_1156[var0] = 1;
                     }
                  }

                  while(field_1165[5] > 0) {
                     try {
                        switch(field_1165[0]) {
                        case 1:
                           method_1133(var0, field_1165[1], field_1165[2]);
                           break;
                        case 2:
                           method_1140(var0);
                           break;
                        case 3:
                           method_1134(var0, field_1165[1], field_1165[2], field_1165[4], field_1165[3]);
                           break;
                        case 4:
                           if(field_1153[var0] != null) {
                              field_1153[var0].stop();
                              field_1156[var0] = 1;
                           }
                           break;
                        case 5:
                           if(field_1156[var0] == 2 && field_1153[var0] != null) {
                              field_1153[var0].getState();
                              field_1153[var0].stop();
                              field_1156[var0] = 3;
                           }
                           break;
                        case 6:
                           if(field_1156[var0] == 3 && field_1153[var0] != null) {
                              field_1153[var0].start();
                              field_1156[var0] = 2;
                           }
                        }
                     } catch (Exception var3) {
                        (new StringBuffer()).append("Snd_update.error on channel (").append(var0).append(").").append(var3);
                        var3.printStackTrace();
                     }

                     var1 = field_1165;
                     method_1126(var0, field_1165);
                  }
               }

               method_1149(var0);
            }

            field_1164 = false;
         }
      }
   }

   public final void run() {
      while(field_1159 != null) {
         method_1138();

         try {
            Thread.sleep((long)50);
         } catch (Exception var1) {
            ;
         }
      }

   }

   // $FF: renamed from: b (int) boolean
   protected static boolean method_1139(int var0) {
      if(!field_1150) {
         return false;
      } else if(var0 < field_1147 && field_1153[var0] != null) {
         boolean var1 = true;
         if(field_1153[var0].getState() != 400) {
            var1 = false;
         }

         return var1;
      } else {
         return false;
      }
   }

   // $FF: renamed from: i (int) void
   private static void method_1140(int var0) {
      if(field_1150) {
         if(field_1153[var0] != null) {
        	try {
        		field_1153[var0].stop();
        	} catch (MediaException e) {
        	} finally {
        		field_1153[var0].deallocate();
        		field_1153[var0].close();
        		field_1153[var0] = null;
        	}
         }

         field_1156[var0] = 0;
         field_1154[var0] = -1;
      }
   }

   // $FF: renamed from: d () int
   static int method_1141() {
      return !field_1150?-1:(field_1154 != null?field_1154[0]:-1);
   }

   // $FF: renamed from: a (int) long
   private static long method_1142(int var0) {
      if(!field_1150) {
         return -1L;
      } else {
         long var1 = -1L;

         try {
            var1 = field_1153[var0].getMediaTime();
         } catch (Exception var3) {
            ;
         }

         return var1;
      }
   }

   // $FF: renamed from: a (int, int, int) boolean
   private static boolean method_1143(int var0, int var1, int var2) {
      if(!field_1150) {
         return false;
      } else {
         boolean var3 = false;
         field_1168[((var0 << 4) + var1) * 9 + 3] = var2;
         MIDIControl var4;
         if((var4 = (MIDIControl)field_1153[var0].getControl("MIDIControl")) != null) {
            var4.shortMidiEvent(176 | var1, 7, var2);
            var3 = true;
         }

         return var3;
      }
   }

   // $FF: renamed from: e (int) int
   private static int method_1144(int var0) {
      if(!field_1150) {
         return -1;
      } else {
         try {
            TempoControl var2;
            if((var2 = (TempoControl)field_1153[var0].getControl("TempoControl")) != null) {
               return var2.getTempo();
            }
         } catch (Exception var1) {
            ;
         }

         return -1;
      }
   }

   // $FF: renamed from: a (int, int) boolean
   private static boolean method_1145(int var0, int var1) {
      if(!field_1150) {
         return false;
      } else {
         TempoControl var2;
         if((var2 = (TempoControl)field_1153[var0].getControl("TempoControl")) != null) {
            var2.setTempo(var1);
            return true;
         } else {
            return false;
         }
      }
   }

   // $FF: renamed from: d (int, int) void
   private static void method_1146(int var0, int var1) {
      var0 = var1 * 3;
      field_1166[var0] = 0;
      field_1166[var0 + 1] = 0;
      field_1166[var0 + 2] = 0;
   }

   // $FF: renamed from: e (int, int) void
   private static void method_1147(int var0, int var1) {
      var1 *= 3;
      field_1167[var1] = var0;
      if(var0 != 1) {
         field_1167[var1 + 1] = 0;
         field_1167[var1 + 2] = 0;
      }

   }

   // $FF: renamed from: b (int, int, int, int) void
   private static void method_1148(int var0, int var1, int var2, int var3) {
      var3 = ((var1 << 4) + var2) * 9;
      field_1168[var3] = var0;
      if(var0 != 0 && var0 != 1) {
         field_1168[var3 + 1] = 0;
         field_1168[var3 + 2] = 0;
         field_1169[var1] |= 1 << var2;
      } else {
         field_1169[var1] &= ~(1 << var2);
      }
   }

   // $FF: renamed from: j (int) void
   private static void method_1149(int var0) {
      if((field_1172 += class_1.field_15) >= 0) {
         int var1 = field_1172;
         field_1172 = 0;
         long var2;
         if((var2 = method_1142(var0)) >= 0L && var2 <= (long)(var1 * 1000)) {
            field_1170[var0] = true;
         }

         try {
            if(!method_1139(var0)) {
               if(!class_1.field_3 && field_1158[var0] == 0 && field_1171[var0] < 3) {
                  switch(field_1171[var0]) {
                  case 0:
                     if(field_1156[var0] == 2) {
                        field_1171[var0] = 1;
                        field_1170[var0] = true;
                        return;
                     }
                     break;
                  case 1:
                     field_1171[var0] = 2;
                     field_1153[var0].stop();
                     field_1156[var0] = 1;
                     return;
                  case 2:
                     method_1134(var0, field_1154[var0], field_1155[var0], 0, field_1157[var0]);
                     field_1171[var0] = 3;
                  }
               }

               return;
            }
         } catch (Exception var14) {
            return;
         }

         field_1171[var0] = 0;
         int var15 = var0 * 3;
         int var3;
         int var4;
         int var5;
         int var6;
         if((var3 = field_1166[var15]) != 0 && var3 != 1) {
            var4 = field_1166[var15 + 1];

            try {
               var5 = method_1136(var0);
               var6 = 1 > field_1166[var15 + 2] * var1 / 1000?1:field_1166[var15 + 2] * var1 / 1000;
               var5 = var5 < var4?(var4 < var5 + var6?var4:var5 + var6):(var4 > var5 - var6?var4:var5 - var6);
               method_1137(var0, var5);
            } catch (Exception var13) {
               var5 = var4;
            }

            if(var5 == var4) {
               if(var3 == 4) {
                  method_1132(var0, true);
               }

               method_1146(0, var0);
            }
         }

         if((var3 = field_1167[var15]) != 0 && var3 != 1) {
            var4 = field_1167[var15 + 1];
            var5 = -1;

            try {
               var5 = method_1144(var0);
               var6 = 1 > field_1167[var15 + 2] * var1 / 1000?1:field_1167[var15 + 2] * var1 / 1000;
               var5 = var5 < var4?(var4 < var5 + var6?var4:var5 + var6):(var4 > var5 - var6?var4:var5 - var6);
               method_1145(var0, var5);
            } catch (Exception var12) {
               method_1147(0, var0);
            }

            if(var5 < 0 || (var5 - var4 < 0?-(var5 - var4):var5 - var4) < 500) {
               method_1147(1, var0);
            }
         } else if(field_1170[var0] && var3 == 1) {
            try {
               var4 = field_1167[var15 + 1];
               if(((var5 = method_1144(var0)) - var4 < 0?-(var5 - var4):var5 - var4) >= 500) {
                  method_1145(var0, var4);
               }
            } catch (Exception var11) {
               ;
            }
         }

         if(field_1169[var0] != 0 || field_1170[var0]) {
            for(var4 = 0; var4 < 16; ++var4) {
               if((field_1169[var0] & 1 << var4) != 0 || field_1170[var0]) {
                  var15 = ((var0 << 4) + var4) * 9;
                  int var7;
                  switch(var3 = field_1168[var15]) {
                  case 0:
                  case 3:
                  case 4:
                  case 5:
                  default:
                     break;
                  case 1:
                     if(field_1170[var0]) {
                        var5 = field_1168[var15 + 1];

                        try {
                           method_1143(var0, var4, var5);
                        } catch (Exception var10) {
                           ;
                        }
                     }
                     break;
                  case 2:
                     var5 = field_1168[var15 + 1];
                     var6 = field_1168[var15 + 3];
                     var7 = 1 > field_1168[var15 + 2] * var1 / 1000?1:field_1168[var15 + 2] * var1 / 1000;
                     var6 = var6 < var5?(var5 < var6 + var7?var5:var6 + var7):(var5 > var6 - var7?var5:var6 - var7);

                     try {
                        method_1143(var0, var4, var6);
                     } catch (Exception var9) {
                        var6 = var5;
                     }

                     if(var6 == var5) {
                        method_1148(1, var0, var4, 0);
                     }
                     break;
                  case 6:
                  case 7:
                     var5 = var3 == 6?field_1168[var15 + 1]:0;
                     if((var6 = field_1168[var15 + 3]) != var5) {
                        var7 = 1 > field_1168[var15 + 2] * var1 / 1000?1:field_1168[var15 + 2] * var1 / 1000;
                        var6 = var6 < var5?(var5 < var6 + var7?var5:var6 + var7):(var5 > var6 - var7?var5:var6 - var7);

                        try {
                           method_1143(var0, var4, var6);
                        } catch (Exception var8) {
                           ;
                        }
                     }

                     field_1168[var15 + 8] -= var1;
                     if(field_1168[var15 + 8] <= 0) {
                        boolean var16 = var3 == 7;
                        var15 = ((var0 << 4) + var4) * 9;
                        if((var3 = field_1168[var15]) == 6 || var3 == 7) {
                           if(var16) {
                              field_1168[var15] = 6;
                              field_1168[var15 + 8] = class_1.method_16(field_1168[var15 + 4], field_1168[var15 + 5] + 1);
                           } else {
                              field_1168[var15] = 7;
                              field_1168[var15 + 8] = class_1.method_16(field_1168[var15 + 6], field_1168[var15 + 7] + 1);
                           }
                        }
                     }
                  }
               }
            }

            field_1170[var0] = false;
         }
      }
   }

   // $FF: renamed from: d () void
   static void method_1150() {
      try {
         for(int var0 = 0; var0 < field_1147; ++var0) {
            method_1132(var0, true);
         }

         if(class_1.field_3) {
            method_1138();
         }

         if(class_1.field_3) {
            method_1138();
         }

      } catch (Exception var1) {
         ;
      }
   }

   // $FF: renamed from: a (int, int, int, int) void
   static void method_1151(int var0, int var1, int var2, int var3) {
      field_1177 = new int[8];
      field_1178 = new int[field_1174][field_1175];
      field_1180 = new class_11[field_1174][1];
      field_1181 = new Graphics[field_1174][1];
      if(var2 > 0 && var3 > 0) {
         field_1179 = new byte[field_1174][2][];
         field_1184 = new class_5[field_1174];
         field_1177[2] = var2;
         field_1177[4] = 0;
         field_1177[5] = var3;
         field_1177[7] = 0;
      }

      field_1182 = new int[field_1174][field_1176][4];
      field_1177[0] = var0;
      field_1177[1] = var1;
      field_1173 = true;
   }

   // $FF: renamed from: k (int) void
   private static void method_1152(int var0) {
      boolean var4 = false;
      boolean var1 = false;
      var0 = field_1178[0][18];
      int var5 = field_1178[0][19];
      int var2 = var0 % field_1177[2];
      int var3 = 1 + (var2 != 0?1:0);
      field_1178[0][7] = var0 - var2 + var3 * field_1177[2];
      var0 = var5 % field_1177[5];
      var2 = 1 + (var0 != 0?1:0);
      field_1178[0][8] = var5 - var0 + var2 * field_1177[5];
   }

   // $FF: renamed from: l (int) void
   private static void method_1153(int var0) {
      try {
         field_1180[0][0] = class_11.method_1184(field_1178[0][8], field_1178[0][7]);
         field_1181[0][0] = field_1180[0][0].field_1186.getGraphics();
      } catch (Exception var1) {
         (new StringBuffer()).append("GLLibPlayer.Tileset_LoadLayer.pb while ceating circular buffer : ").append(var1.toString());
      }
   }

   // $FF: renamed from: e () void
   static void method_1154() {
      if(field_1173) {
         method_1152(0);
         method_1153(0);
      }
   }

   // $FF: renamed from: b (int, int) boolean
   private static boolean method_1155(int var0, int var1) {
      return (field_1178[var0][15] & var1) != 0;
   }

   // $FF: renamed from: b (int, int, boolean) void
   private static void method_1156(int var0, int var1, boolean var2) {
      if(var2) {
         field_1178[0][15] |= var1;
      } else {
         field_1178[0][15] &= ~var1;
      }
   }

   // $FF: renamed from: a (int, byte[], byte[], byte[], e, int, int, int, int, boolean) void
   static void method_1157(int var0, byte[] var1, byte[] var2, byte[] var3, class_5 var4, int var5, int var6, int var7, int var8, boolean var9) {
      if(field_1173) {
         method_1159(0, false);
         field_1178[0][18] = 0;
         field_1178[0][19] = 0;
         field_1178[0][18] = field_1177[0];
         field_1178[0][19] = field_1177[1];
         field_1179[0][0] = var2;
         field_1179[0][1] = var3;
         field_1178[0][2] = class_1.method_58(var1, 0);
         field_1178[0][3] = class_1.method_58(var1, 2);
         field_1178[0][5] = field_1178[0][2] * field_1177[2];
         field_1178[0][6] = field_1178[0][3] * field_1177[5];
         field_1184[0] = var4;
         method_1152(0);
         if(field_1180[0][0] == null || field_1180[0][0].field_1186.getWidth() != field_1178[0][8] || field_1180[0][0].field_1186.getHeight() != field_1178[0][7]) {
            method_1153(0);
         }

         method_1156(0, 64, true);
         method_1156(0, 4, true);
         method_1156(0, 128, true);
         field_1178[0][9] = -1;
         field_1178[0][10] = -1;
         field_1178[0][11] = -1;
         field_1178[0][12] = -1;
         field_1178[0][0] = 1;
         field_1178[0][1] = 1;
         field_1178[0][13] = 0;
         field_1178[0][14] = 0;
         field_1178[0][16] = 0;
         field_1178[0][17] = 0;
         method_1156(0, 1, false);
         method_1156(0, 16, false);
         method_1156(0, 2, false);
         method_1156(0, 32, false);
         method_1156(0, 8, false);
      }

   }

   // $FF: renamed from: h (int) void
   static void method_1158(int var0) {
      method_1159(var0, true);
   }

   // $FF: renamed from: b (int, boolean) void
   private static void method_1159(int var0, boolean var1) {
      if(field_1173) {
         field_1178[var0] = new int[field_1175];
         if(var1) {
            field_1180[var0] = new class_11[1];
            field_1181[var0] = new Graphics[1];
         }

         if(field_1179 != null) {
            field_1179[var0] = new byte[2][];
            field_1184[var0] = null;
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int) void
   static void method_1160(Graphics var0, int var1, int var2, int var3) {
      if(field_1173) {
         if(var3 == -1) {
            for(int var30 = 0; var30 < field_1174; ++var30) {
               method_1160(var0, var1, var2, var30);
            }

            return;
         }

         int var4 = field_1178[var3][18] * 100 / field_1185;
         int var5 = field_1178[var3][19] * 100 / field_1185;
         if(var4 == 0) {
            field_1178[var3][18] = field_1177[0];
            var4 = field_1178[var3][18];
         }

         if(var5 == 0) {
            field_1178[var3][19] = field_1177[1];
            var4 = field_1178[var3][18];
         }

         int[] var6;
         if((var6 = field_1178[var3])[0] != 1 || var6[1] != 1) {
            return;
         }

         int var7 = var6[13] + var6[16];
         int var8 = var6[14] + var6[17];
         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         if(method_1155(var3, 4)) {
            var9 = 0;
            var10 = 0;
            var11 = 0;
            var12 = 0;
            if(var0 != null) {
               var9 = class_1.method_36(var0, true);
               var10 = class_1.method_37(var0, true);
               var11 = class_1.method_38(var0, true);
               var12 = class_1.method_39(var0, true);
            }

            if(method_1155(var3, 128)) {
               field_1183 = 0;
            }

            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            int var22;
            if(method_1155(var3, 256)) {
               label257: {
                  int[] var31;
                  var14 = (var31 = field_1178[var3])[13];
                  var15 = var31[14];
                  var16 = field_1177[0];
                  var17 = field_1177[1];
                  var18 = var31[5];
                  var19 = var31[6];
                  var20 = var18 + var31[7];
                  var21 = var19 + var31[8];
                  var22 = var31[2];
                  int var23 = var31[3];
                  boolean var24 = var31[9] > 0;
                  int var25 = var14;
                  if(var14 < 0) {
                     var25 = var14 - (var22 - 1);
                  }

                  int var26 = var15;
                  if(var15 < 0) {
                     var26 = var15 - (var23 - 1);
                  }

                  int var27;
                  int var28;
                  if(!var24) {
                     int var10000 = var20 - 1;
                     int var10001 = var21 - 1;
                     int var10002 = var14 + var16 - 1;
                     int var29 = var15 + var17 - 1;
                     var28 = var10002;
                     var27 = var10001;
                     if(var10000 < var14?false:(var18 > var28?false:(var27 < var15?false:var19 <= var29))) {
                        var27 = 0;
                        var28 = 0;
                        int var32;
                        if(var14 < var18) {
                           var14 = var25 / var22 * var22;
                           var32 = var26 / var23 * var23;
                           var16 = var18 - var14;
                           var18 = var31[8];
                           var27 = var16;
                           var28 = var16;
                           var31[5] = var14;
                           method_1182(var3, var14, var32, var16, var18);
                        } else if(var14 + var16 >= var20) {
                           var32 = var26 / var23 * var23;
                           var16 = ((var14 + var16 - var20) / var22 + 1) * var22;
                           var18 = var31[8];
                           var28 = var16;
                           var31[5] = var25 / var22 * var22;
                           method_1182(var3, var20, var32, var16, var18);
                        }

                        if(var15 < var19) {
                           var14 = var25 / var22 * var22 + var27;
                           var32 = var26 / var23 * var23;
                           var16 = var31[7] - var28;
                           var18 = var19 - var32;
                           var31[6] = var32;
                           method_1182(var3, var14, var32, var16, var18);
                        } else if(var15 + var17 >= var21) {
                           var14 = var25 / var22 * var22 + var27;
                           var16 = var31[7] - var28;
                           var18 = ((var15 + var17 - var21) / var23 + 1) * var23;
                           var31[6] = var26 / var23 * var23;
                           method_1182(var3, var14, var21, var16, var18);
                        }

                        var31[10] = 0;
                        break label257;
                     }
                  }

                  var27 = var25 / var22 * var22;
                  var28 = var26 / var23 * var23;
                  method_1182(var3, var27, var28, var31[7], var31[8]);
                  var31[5] = var27;
                  var31[6] = var28;
                  if(var24) {
                     var31[9] = 0;
                  }

                  var31[10] = 1;
               }
            } else {
               var17 = var7;
               var18 = var8;
               if(var7 < 0) {
                  var17 = var7 - field_1177[2];
               }

               if(var8 < 0) {
                  var18 = var8 - field_1177[5];
               }

               var13 = var17 / field_1177[2];
               var14 = var18 / field_1177[5];
               var15 = var13 + var6[7] / field_1177[2] - 1;
               var16 = var14 + var6[8] / field_1177[5] - 1;
               var19 = 0;
               var20 = 0;
               if(var6[10] != var14 || var6[12] != var16) {
                  if(var6[10] >= var14 && var6[12] >= var16) {
                     if(var6[10] > var16) {
                        var19 = var14;
                        var20 = var16;
                     } else {
                        var19 = var14;
                        var20 = var6[10] - 1;
                     }
                  } else if(var6[12] < var14) {
                     var19 = var14;
                     var20 = var16;
                  } else {
                     var19 = var6[12] + 1;
                     var20 = var16;
                  }
               }

               if(var6[9] != var13 || var6[11] != var15) {
                  if(var6[9] >= var13 && var6[11] >= var15) {
                     if(var6[9] > var15) {
                        var17 = var13;
                        var18 = var15;
                     } else {
                        var17 = var13;
                        var18 = var6[9] - 1;
                     }
                  } else if(var6[11] < var13) {
                     var17 = var13;
                     var18 = var15;
                  } else {
                     var17 = var6[11] + 1;
                     var18 = var15;
                  }

                  var21 = var16 - var14;
                  var22 = var14;
                  if(var6[10] != var14 || var6[12] != var16) {
                     if(var6[10] >= var14 && var6[12] >= var16) {
                        var21 -= var20 - var19 + 1;
                        var22 = var14 + var20 - var19 + 1;
                     } else {
                        var21 -= var20 - var19 + 1;
                     }
                  }

                  if(var21 >= 0) {
                     method_1163(field_1181[var3][0], var3, var17, var22, var18 - var17, var21, 0, 0);
                  }

                  var6[9] = var13;
                  var6[11] = var15;
               }

               if(var6[10] != var14 || var6[12] != var16) {
                  method_1163(field_1181[var3][0], var3, var13, var19, var15 - var13, var20 - var19, 0, 0);
                  var6[10] = var14;
                  var6[12] = var16;
               }
            }

            if(var0 != null) {
               if(!method_1155(var3, 273)) {
                  if(var7 < 0) {
                     var1 -= var7;
                     var7 = 0;
                  } else if(var7 > var6[5] - var4) {
                     var1 -= var7 - (var6[5] - var4);
                     var7 = var6[5] - var4;
                  }
               } else {
                  while(var7 < 0) {
                     var7 += var6[7];
                  }
               }

               if(!method_1155(var3, 290)) {
                  if(var8 < 0) {
                     var2 -= var8;
                     var8 = 0;
                  } else if(var8 > var6[6] - var5) {
                     var2 -= var8 - (var6[6] - var5);
                     var8 = var6[6] - var5;
                  }
               } else {
                  while(var8 < 0) {
                     var8 += var6[8];
                  }
               }

               var13 = var7 % var6[7];
               var14 = var8 % var6[8];
               var15 = (var7 + var4) % var6[7];
               var16 = (var8 + var5) % var6[8];
               class_1.method_41(var0, var9, var10, var11, var12, true);
               if(var15 > var13) {
                  if(var16 > var14) {
                     method_1162(var0, var3, var13, var14, var4, var5, var1, var2, var9, var10, var11, var12, 100);
                  } else {
                     method_1162(var0, var3, var13, var14, var4, var5 - var16, var1, var2, var9, var10, var11, var12, 100);
                     class_1.method_41(var0, var9, var10, var11, var12, true);
                     method_1162(var0, var3, var13, 0, var4, var16, var1, var5 - var16 + var2, var9, var10, var11, var12, 100);
                  }
               } else if(var16 > var14) {
                  method_1162(var0, var3, var13, var14, var4 - var15, var5, var1, var2, var9, var10, var11, var12, 100);
                  class_1.method_41(var0, var9, var10, var11, var12, true);
                  method_1162(var0, var3, 0, var14, var15, var5, var4 - var15 + var1, var2, var9, var10, var11, var12, 100);
               } else {
                  method_1162(var0, var3, var13, var14, var4 - var15, var5 - var16, var1, var2, var9, var10, var11, var12, 100);
                  class_1.method_41(var0, var9, var10, var11, var12, true);
                  method_1162(var0, var3, var13, 0, var4 - var15, var16, var1, var5 - var16 + var2, var9, var10, var11, var12, 100);
                  class_1.method_41(var0, var9, var10, var11, var12, true);
                  method_1162(var0, var3, 0, var14, var15, var5 - var16, var4 - var15 + var1, var2, var9, var10, var11, var12, 100);
                  class_1.method_41(var0, var9, var10, var11, var12, true);
                  method_1162(var0, var3, 0, 0, var15, var16, var4 - var15 + var1, var5 - var16 + var2, var9, var10, var11, var12, 100);
               }

               class_1.method_41(var0, var9, var10, var11, var12, true);
            }

            return;
         }

         if(var0 != null) {
            var15 = var7;
            var16 = var8;
            if(var7 < 0) {
               var15 = var7 - field_1177[2];
            }

            if(var8 < 0) {
               var16 = var8 - field_1177[5];
            }

            var9 = var15 / field_1177[2];
            var10 = var16 / field_1177[5];
            if((var11 = var4 / field_1177[2]) * field_1177[2] < var4) {
               ++var11;
            }

            if((var12 = var5 / field_1177[5]) * field_1177[5] < var5) {
               ++var12;
            }

            var13 = var9 * field_1177[2] - var7;
            var14 = var10 * field_1177[5] - var8;
            method_1163(var0, var3, var9, var10, var11, var12, var13 + var1, var14 + var2);
         }
      }

   }

   // $FF: renamed from: b (int, int, int, int, int) void
   static void method_1161(int var0, int var1, int var2, int var3, int var4) {
      if(field_1173 && method_1155(var4, 4)) {
         if(var4 != -1) {
            int[] var6;
            if((var6 = field_1178[var4])[0] == 1 && var6[1] == 1) {
               if(var0 + var2 > var6[13] && var0 < var6[13] + var6[7] && var1 + var3 > var6[14] && var1 < var6[14] + var6[8]) {
                  var2 = var0 + var2 < var6[13] + var6[7]?var0 + var2:var6[13] + var6[7];
                  var3 = var1 + var3 < var6[14] + var6[8]?var1 + var3:var6[14] + var6[8];
                  var0 = var0 > var6[13]?var0:var6[13];
                  var1 = var1 > var6[14]?var1:var6[14];
                  var2 -= var0;
                  var3 -= var1;
                  if(var0 < 0) {
                     var0 -= field_1177[2];
                  }

                  if(var1 < 0) {
                     var1 -= field_1177[5];
                  }

                  var0 /= field_1177[2];
                  var1 /= field_1177[5];
                  var2 = var2 / field_1177[2] - 1;
                  var3 = var3 / field_1177[5] - 1;
                  method_1164(field_1181[var4][0], var4, var0, var1, var2, var3, 0, 0, true);
               }

            }
         } else {
            for(int var5 = 0; var5 < field_1174; ++var5) {
               method_1161(var0, var1, var2, var3, var5);
            }

         }
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int, int, int, int, int, int) void
   private static void method_1162(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      if(var6 <= (var8 + var10) * 100 && var7 <= (var9 + var11) * 100 && var6 + var4 >= var8 * 100 && var7 + var5 >= var9 * 100) {
         class_1.method_40(var0, var6, var7, var4, var5, true);
         class_1.method_48(var0, field_1180[var1][0], var3 - var7 + class_5.field_970 - field_1178[var1][8], var6 - var2, 20, false);
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int) void
   private static void method_1163(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      method_1164(var0, var1, var2, var3, var4, var5, var6, var7, false);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int, int, boolean) void
   private static void method_1164(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      boolean var9 = method_1155(var1, 4);
      boolean var10 = method_1155(var1, 1);
      boolean var11 = method_1155(var1, 2);
      int var12 = field_1178[var1][2];
      int var13 = field_1178[var1][3];
      int var14 = field_1177[2];
      int var15 = field_1177[5];
      int var16 = var12 * var13;
      int var18;
      if(var9) {
         int var10000 = field_1178[var1][7];
         var18 = field_1178[var1][8];
         class_5.field_969 = var10000;
         class_5.field_970 = var18;
      }

      if(var9) {
         var6 += var2 * field_1177[2] % field_1178[var1][7];
         var7 += var3 * field_1177[5] % field_1178[var1][8];
         if(var6 < 0) {
            var6 += field_1178[var1][7];
         }

         if(var7 < 0) {
            var7 += field_1178[var1][8];
         }
      }

      if(var10) {
         while(var2 < 0) {
            var2 += var12;
         }

         while(var2 >= var12) {
            var2 -= var12;
         }
      } else if(!method_1155(var1, 16)) {
         if(var2 < 0) {
            var6 -= var2 * var14;
            var4 += var2;
            var2 = 0;
            if(var9 && var6 >= field_1178[var1][7]) {
               var6 = 0;
            }
         }

         if(var2 + var4 >= var12) {
            var4 = var12 - var2 - 1;
         }

         if(var4 < 0) {
            var1 = class_1.height;
            class_5.field_969 = class_1.width;
            class_5.field_970 = var1;
            return;
         }
      }

      if(var11) {
         while(var3 < 0) {
            var3 += var13;
         }

         while(var3 >= var13) {
            var3 -= var13;
         }
      } else if(!method_1155(var1, 32)) {
         if(var3 < 0) {
            var7 -= var3 * var15;
            var5 += var3;
            var3 = 0;
            if(var9 && var7 >= field_1178[var1][8]) {
               var7 = 0;
            }
         }

         if(var3 + var5 >= var13) {
            var5 = var13 - var3 - 1;
         }

         if(var5 < 0) {
            var1 = class_1.height;
            class_5.field_969 = class_1.width;
            class_5.field_970 = var1;
            return;
         }
      }

      int var17 = var6;
      var18 = var7;

      int var23;
      int var24;
      while(var5-- >= 0) {
         var17 = var6;
         int var19 = var4;
         int var20 = var2;

         while(var19-- >= 0) {
            int var21;
            int var22;
            if((var21 = var20 + var3 * var12) < var16 && (var22 = method_1181(var1, 0, var21, false)) != 255) {
               if(field_1179[var1][1] == null) {
                  var21 = 0;
               } else {
                  var21 = method_1181(var1, 1, var21, false);
               }

               if(field_1185 != 100) {
                  class_1.method_92();
                  var23 = field_1185;
                  class_1.field_73[13][1] = var23;
                  class_1.method_97(true);
               }

               if(field_1184[var1].method_934() == 0) {
                  field_1184[var1].method_984(var0, var22, var17, var18, var21, field_1177[2], field_1177[5]);
               } else {
                  var23 = var17;
                  var24 = var18;
                  if((var21 & 1) != 0) {
                     var23 = var17 + var14;
                  }

                  if((var21 & 2) != 0) {
                     var24 = var18 + var15;
                  }

                  if((var21 & 4) != 0) {
                     if((var21 & 1) != 0) {
                        var23 -= var15;
                     } else {
                        var23 += var15;
                     }
                  }

                  field_1184[var1].method_980(var0, var22, var23, var24, var21);
               }

               if(field_1185 != 100) {
                  class_1.method_97(false);
                  class_1.method_93();
               }
            }

            var17 += var14;
            ++var20;
            if(var20 >= var12) {
               if(!var10) {
                  break;
               }

               var20 = 0;
            }

            if(var9 && var17 >= field_1178[var1][7]) {
               var17 = 0;
            }
         }

         var18 += var15;
         ++var3;
         if(var3 >= var13) {
            if(!var11) {
               break;
            }

            var3 = 0;
         }

         if(var9 && var18 >= field_1178[var1][8]) {
            var18 = 0;
         }
      }

      if(!var8 && method_1155(var1, 128)) {
         if(var17 > var6) {
            var23 = var17;
            var24 = 0;
         } else {
            var23 = field_1178[var1][7];
            var24 = var17;
         }

         int var25;
         if(var18 > var7) {
            var25 = var18;
            var2 = 0;
         } else {
            var25 = field_1178[var1][8];
            var2 = var18;
         }

         for(var3 = 0; var3 < 4; ++var3) {
            if((var3 != 1 && var3 != 3 || var24 != 0) && (var3 != 2 && var3 != 3 || var2 != 0)) {
               var4 = var3 != 0 && var3 != 2?0:var6;
               var5 = var3 != 0 && var3 != 1?0:var7;
               int var26 = var3 != 0 && var3 != 2?var24:var23 - var6;
               int var27 = var3 != 0 && var3 != 1?var2:var25 - var7;
               method_1165(var1, var4, var5, var26, var27);
            }
         }
      }

      var1 = class_1.height;
      class_5.field_969 = class_1.width;
      class_5.field_970 = var1;
   }

   // $FF: renamed from: d (int, int, int, int, int) void
   private static final void method_1165(int var0, int var1, int var2, int var3, int var4) {
      int[] var5;
      (var5 = field_1182[var0][field_1183])[0] = var1;
      var5[1] = var2;
      var5[2] = var3;
      var5[3] = var4;
      ++field_1183;
   }

   // $FF: renamed from: a (int, int) int
   private static final int method_1166(int var0, int var1) {
      return method_1155(var0, 8)?field_1178[var0][6] - field_1177[1] - var1:var1;
   }

   // $FF: renamed from: a (int, int, int) void
   static final void method_1167(int var0, int var1, int var2) {
      if(field_1173) {
         if(field_1174 <= 0) {
            (new StringBuffer()).append("Tileset_SetCamera: nLayer invalid : ").append(0);
         } else if(field_1178[0][0] == 1 && field_1178[0][1] == 1) {
            field_1178[0][13] = var1;
            field_1178[0][14] = method_1166(0, var2);
            if(method_1155(0, 16)) {
               if(field_1178[0][13] < 0) {
                  field_1178[0][13] = 0;
               } else if(field_1178[0][13] + field_1177[0] >= field_1178[0][5]) {
                  field_1178[0][13] = field_1178[0][5] - field_1177[0] - 1;
               }
            }

            if(method_1155(0, 32)) {
               if(field_1178[0][14] < 0) {
                  field_1178[0][14] = 0;
                  return;
               }

               if(field_1178[0][14] + field_1177[1] >= field_1178[0][6]) {
                  field_1178[0][14] = field_1178[0][6] - field_1177[1] - 1;
               }
            }

         }
      }
   }

   // $FF: renamed from: a (int) int
   static final int method_1168(int var0) {
      if(!field_1173) {
         return -1;
      } else if(field_1174 <= 0) {
         (new StringBuffer()).append("Tileset_GetCamera: nLayer invalid : ").append(0);
         return -1;
      } else {
         return field_1178[0][0] == 1 && field_1178[0][1] == 1?field_1178[0][13]:-1;
      }
   }

   // $FF: renamed from: b (int) int
   static final int method_1169(int var0) {
      if(!field_1173) {
         return -1;
      } else if(field_1174 <= 0) {
         (new StringBuffer()).append("Tileset_GetCamera: nLayer invalid : ").append(0);
         return -1;
      } else {
         return field_1178[0][0] == 1 && field_1178[0][1] == 1?(method_1155(0, 8)?field_1178[0][6] - field_1177[1] - field_1178[0][14]:field_1178[0][14]):-1;
      }
   }

   // $FF: renamed from: e () int
   static final int method_1170() {
      if(!field_1173) {
         return -1;
      } else if(field_1174 <= 0) {
         (new StringBuffer()).append("Tileset_GetLayerWidth: nLayer invalid : ").append(0);
         return -1;
      } else {
         return field_1178[0][0] == 1 && field_1178[0][1] == 1?field_1178[0][5]:-1;
      }
   }

   // $FF: renamed from: f () int
   static final int method_1171() {
      if(!field_1173) {
         return -1;
      } else if(field_1174 <= 0) {
         (new StringBuffer()).append("Tileset_GetLayerHeight: nLayer invalid : ").append(0);
         return -1;
      } else {
         return field_1178[0][0] == 1 && field_1178[0][1] == 1?field_1178[0][6]:-1;
      }
   }

   // $FF: renamed from: a (int, int, int) int
   static final int method_1172(int var0, int var1, int var2) {
      var2 = method_1166(0, var2);
      if(!field_1173) {
         return -1;
      } else if(field_1174 <= 0) {
         (new StringBuffer()).append("Tileset_GetTile: nLayer invalid : ").append(0);
         return -1;
      } else if(field_1178[0][0] == 1 && field_1178[0][1] == 1) {
         if(var1 >= 0 && var1 <= field_1178[0][2]) {
            if(var2 >= 0 && var2 <= field_1178[0][3]) {
               var0 = var2;
               var2 = var1;
               var1 = field_1178[0][2];
               return method_1181(0, 0, var0 * var1 + var2, false);
            } else {
               (new StringBuffer()).append("Tileset_GetTile: y value out of bound [").append(var2).append("]  0 <= y < ").append(field_1178[0][3]);
               return -1;
            }
         } else {
            (new StringBuffer()).append("Tileset_GetTile: x value out of bound [").append(var1).append("]  0 <= x < ").append(field_1178[0][2]);
            return -1;
         }
      } else {
         return -1;
      }
   }

   // $FF: renamed from: a () l
   static final class_11 method_1173() {
      if(!field_1173) {
         return null;
      } else if(field_1174 <= 0) {
         (new StringBuffer()).append("Tileset_GetBufferImage: p_iLayer invalid : ").append(0);
         return null;
      } else {
         return field_1180[0][0];
      }
   }

   // $FF: renamed from: f () void
   static void method_1174() {
      if(field_1173) {
         if(method_1155(0, 256)) {
            field_1178[0][9] = 1;
         } else {
            field_1178[0][9] = -1;
            field_1178[0][10] = -1;
            field_1178[0][11] = -1;
            field_1178[0][12] = -1;
         }
      }
   }

   // $FF: renamed from: b (int, int, int) void
   static void method_1175(int var0, int var1, int var2) {
      var1 = method_1166(0, var1);
      var0 /= field_1177[2];
      var1 /= field_1177[5];
      if(field_1173) {
         if(field_1174 <= 0) {
            (new StringBuffer()).append("Tileset_SetTile: layer invalid : ").append(0);
         } else if(field_1178[0][0] == 1 && field_1178[0][1] == 1) {
            if(var0 >= 0 && var0 <= field_1178[0][2]) {
               if(var1 >= 0 && var1 <= field_1178[0][3]) {
                  var0 += var1 * field_1178[0][2];
                  if(var2 != -1) {
                     method_1180(0, 0, var0, var2);
                  }

                  method_1180(0, 1, var0, 0);
               } else {
                  (new StringBuffer()).append("Tileset_SetTile: y value out of bound [").append(var1).append("]  0 <= y < ").append(field_1178[0][3]);
               }
            } else {
               (new StringBuffer()).append("Tileset_SetTile: x value out of bound [").append(var0).append("]  0 <= x < ").append(field_1178[0][2]);
            }
         }
      }
   }

   // $FF: renamed from: a (int, int, int, int, boolean) void
   static final void method_1176(int var0, int var1, int var2, int var3, boolean var4) {
      if(method_1155(0, 4)) {
         method_1178(2, 0, (Object)null, 0, 0, 0, 0, var2, var3, 0, var4, (int[])null);
      } else {
         int var10000 = 0 - method_1168(0);
         var1 = 0 - method_1169(0);
         var0 = var10000;
         class_1.method_43(class_1.field_1, var0, var1, var2, var3, true);
      }
   }

   // $FF: renamed from: a (int, e, int, int, int, boolean, int[]) void
   static final void method_1177(int var0, class_5 var1, int var2, int var3, int var4, boolean var5, int[] var6) {
      if(field_1185 != 100) {
         class_1.method_92();
         var0 = field_1185;
         class_1.field_73[13][1] = var0;
         class_1.method_97(true);
      }

      if(method_1155(0, 4)) {
         method_1178(0, 0, var1, 0, var2, var3, var4, 0, 0, 0, var5, var6);
      } else {
         var1.method_980(class_1.field_1, var2, var3 - method_1168(0), var4 - method_1169(0), 0);
      }

      if(field_1185 != 100) {
         class_1.method_97(false);
         class_1.method_93();
      }

   }

   // $FF: renamed from: a (int, int, java.lang.Object, int, int, int, int, int, int, int, boolean, int[]) void
   private static void method_1178(int var0, int var1, Object var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int[] var11) {
      int var10002 = var4;
      int var10003 = var5;
      int var10004 = var6;
      int var10005 = var7;
      int[] var49 = var11;
      boolean var48 = var10;
      var7 = var8;
      var6 = var10005;
      var5 = var10004;
      var4 = var10003;
      var3 = var10002;
      if(method_1155(0, 4) && (field_1183 != 0 || var10)) {
         var11 = field_1178[0];
         var1 = 0;
         var8 = 0;
         int var12 = 0;
         int var13 = 0;
         int var14;
         if(var0 == 0) {
            var1 = ((class_5)var2).method_920(var3);
            var8 = ((class_5)var2).method_921(var3);
            var12 = ((class_5)var2).method_918(var3);
            var13 = ((class_5)var2).method_919(var3);
            if((class_1.field_72 & 8192) != 0) {
               var14 = class_1.field_73[13][1];
               var1 = var1 * var14 / 100;
               var8 = var8 * var14 / 100;
               var12 = var12 * var14 / 100;
               var13 = var13 * var14 / 100;
            }
         } else if(var0 != 1 && var0 != 2 && var0 != 3 && var0 != 5 && var0 != 4) {
            (new StringBuffer()).append("Tileset_PaintToBuffer: Invalid drawOperation set: ").append(var0);
         } else {
            var12 = var6;
            var13 = var7;
         }

         var5 = method_1166(0, var5);
         var14 = var11[13];
         int var15 = var11[14];
         int var16;
         int var17;
         if(method_1155(0, 256)) {
            var16 = var11[2];
            var17 = var11[3];
         } else {
            var16 = field_1177[2];
            var17 = field_1177[5];
         }

         int var18 = var14 % var16;
         int var19 = var15 % var17;
         if(var18 < 0) {
            var18 += var16;
         }

         if(var19 < 0) {
            var19 += var17;
         }

         var14 -= var18;
         var15 -= var19;
         var4 -= var14;
         var5 -= var15;
         if(method_1155(0, 273) && var14 < 0) {
            var14 = var11[7] + var14 % var11[7];
         }

         if(method_1155(0, 290) && var15 < 0) {
            var15 = var11[8] + var15 % var11[8];
         }

         var16 = var14 % var11[7];
         var17 = var15 % var11[8];
         var18 = var11[7] - var16;
         var19 = var11[8] - var17;
         Graphics var20 = field_1181[0][0];
         int var10000 = field_1178[0][7];
         int var21 = field_1178[0][8];
         class_5.field_969 = var10000;
         class_5.field_970 = var21;
         var21 = class_1.method_36(var20, true);
         int var22 = class_1.method_37(var20, true);
         int var23 = class_1.method_38(var20, true);
         int var24 = class_1.method_39(var20, true);
         int var25 = 1;
         if(!var10) {
            var25 = field_1183;
         }

         int var26 = var11[7];
         int var27 = var11[8];
         int var28 = class_5.field_969;
         int var29 = class_5.field_970;
         class_5.field_969 = var26;
         class_5.field_970 = var27;
         int var30 = var25;
         var4 += var1;
         var5 += var8;
         var12 += var4;
         var13 += var5;
         int var37 = 0;
         int var38 = 0;
         int var39 = 0;
         int var40 = 0;
         if(var49 != null) {
            var37 = var49[0] - var14;
            var38 = var49[1] - var15;
            var39 = var49[2] - var14;
            var40 = var49[3] - var15;
         }

         for(int var41 = 0; var41 < 1; ++var41) {
            var14 = var4;
            var15 = var5;
            int var31 = var12;
            int var32 = var13;

            for(int var42 = 0; var42 < 1; ++var42) {
               int var33 = var14;
               int var34 = var15;
               int var35 = var31;
               int var36 = var32;
               if(var14 <= var26 && var32 >= 0 && var31 >= 0 && var15 <= var27) {
                  var25 = var30;

                  while(true) {
                     --var25;
                     if(var25 < 0) {
                        break;
                     }

                     int[] var43 = null;
                     int var44;
                     int var45;
                     int var46;
                     int var47;
                     if(!var48) {
                        var44 = (var43 = field_1182[0][var25])[0] - var16;
                        if(var43[0] < var16) {
                           var44 += var11[7];
                        }

                        var45 = var44 + var43[2];
                        if(var33 >= var45 || var35 < var44) {
                           continue;
                        }

                        var46 = var43[1] - var17;
                        if(var43[1] < var17) {
                           var46 += var11[8];
                        }

                        var47 = var46 + var43[3];
                        if(var34 >= var47 || var36 < var46) {
                           continue;
                        }
                     }

                     if(var33 < var18 && (var49 == null || var37 < var18)) {
                        if(var34 < var19 && (var49 == null || var38 < var19)) {
                           if(var49 != null) {
                              var44 = var37 > 0?var37:0;
                              var45 = var38 > 0?var38:0;
                              var46 = (var39 < var18?var39:var18) - var44;
                              var47 = (var40 < var19?var40:var19) - var45;
                              var44 += var16;
                              var45 += var17;
                           } else {
                              var44 = var16;
                              var45 = var17;
                              var46 = var18;
                              var47 = var19;
                           }

                           method_1179(var20, var2, var3, 0, var44, var45, var46, var47, var16 + var33 - var1, var17 + var34 - var8, var6, var7, var0, var21, var22, var23, var24, var43, var48);
                        }

                        if(var36 >= var19 && var17 != 0 && (var49 == null || var40 >= var19)) {
                           if(var49 != null) {
                              var44 = var37 > 0?var37:0;
                              var45 = var38 - var19 > 0?var38 - var19:0;
                              var46 = (var39 < var18?var39:var18) - var44;
                              var47 = (var40 - var19 < var17?var40 - var19:var17) - var45;
                              var44 += var16;
                           } else {
                              var44 = var16;
                              var45 = 0;
                              var46 = var18;
                              var47 = var17;
                           }

                           method_1179(var20, var2, var3, 0, var44, var45, var46, var47, var16 + var33 - var1, var34 - var8 - var19, var6, var7, var0, var21, var22, var23, var24, var43, var48);
                        }
                     }

                     if(var35 >= var18 && var16 != 0 && (var49 == null || var39 >= var18)) {
                        if(var34 < var19 && (var49 == null || var38 < var19)) {
                           if(var49 != null) {
                              var44 = var37 - var18 > 0?var37 - var18:0;
                              var45 = var38 > 0?var38:0;
                              var46 = (var39 - var18 < var16?var39 - var18:var16) - var44;
                              var47 = (var40 < var19?var40:var19) - var45;
                              var45 += var17;
                           } else {
                              var44 = 0;
                              var45 = var17;
                              var46 = var16;
                              var47 = var19;
                           }

                           method_1179(var20, var2, var3, 0, var44, var45, var46, var47, var33 - var1 - var18, var17 + var34 - var8, var6, var7, var0, var21, var22, var23, var24, var43, var48);
                        }

                        if(var36 >= var19 && var17 != 0 && (var49 == null || var40 >= var19)) {
                           if(var49 != null) {
                              var44 = var37 - var18 > 0?var37 - var18:0;
                              var45 = var38 - var19 > 0?var38 - var19:0;
                              var46 = (var39 - var18 < var16?var39 - var18:var16) - var44;
                              var47 = (var40 - var19 < var17?var40 - var19:var17) - var45;
                           } else {
                              var44 = 0;
                              var45 = 0;
                              var46 = var16;
                              var47 = var17;
                           }

                           method_1179(var20, var2, var3, 0, var44, var45, var46, var47, var33 - var1 - var18, var34 - var8 - var19, var6, var7, var0, var21, var22, var23, var24, var43, var48);
                        }
                     }
                  }
               }
            }
         }

         class_1.method_41(var20, var21, var22, var23, var24, true);
         class_5.field_969 = var28;
         class_5.field_970 = var29;
         var0 = class_1.height;
         class_5.field_969 = class_1.width;
         class_5.field_970 = var0;
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.Object, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int[], boolean) void
   private static void method_1179(Graphics var0, Object var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int[] var17, boolean var18) {
      class_1.method_40(var0, var4, var5, var6, var7, true);
      if(!var18) {
         int var10001 = var17[0];
         int var10002 = var17[1];
         int var10003 = var17[2];
         int var20 = var17[3];
         var7 = var10003;
         var6 = var10002;
         class_1.method_40(var0, var10001, var6, var7, var20, true);
      }

      if(var12 == 0) {
         ((class_5)var1).method_981(var0, var2, var8, var9, var3);
      } else if(var12 == 5) {
         var2 = var8;
         var8 = class_5.field_970 - var9 - var11;
         class_1.method_51(var0, (int[])var1, 0, var11, var8, var2, var11, var10, true, false, var3, -1, false);
      } else if(var12 == 4) {
         class_11 var19;
         class_1.method_48(var0, var19 = (class_11)var1, var8, var9, 20, true);
      } else if(var12 == 1) {
         class_1.method_44(var0, var8, var9, var10, var11, true);
      } else if(var12 == 2) {
         class_1.method_43(var0, var8, var9, var10, var11, true);
      } else if(var12 == 3) {
         class_1.method_87(var0, var8, var9, var10, var11);
      }

      class_1.method_41(var0, var13, var14, var15, var16, true);
   }

   // $FF: renamed from: c (int, int, int, int) void
   private static final void method_1180(int var0, int var1, int var2, int var3) {
      field_1179[0][var1][var2] = (byte)var3;
   }

   // $FF: renamed from: a (int, int, int, boolean) int
   private static int method_1181(int var0, int var1, int var2, boolean var3) {
      return field_1179[var0][var1][var2] & 255;
   }

   // $FF: renamed from: e (int, int, int, int, int) void
   private static void method_1182(int var0, int var1, int var2, int var3, int var4) {
      Graphics var5;
      (var5 = field_1181[var0][0]).setColor(field_1178[var0][4]);
      int var6 = field_1178[var0][7];
      int var7 = field_1178[var0][8];
      class_5.field_969 = var6;
      class_5.field_970 = var7;
      if((var1 %= var6) < 0) {
         var1 += var6;
      }

      if((var2 %= var7) < 0) {
         var2 += var7;
      }

      int var10;
      if(var1 + var3 > var6) {
         int var8 = var4;
         int var9;
         if(var2 + var4 > var7) {
            int var10001 = var1 + var3 - var6;
            var10 = var2 + var4 - var7;
            var9 = var10001;
            class_1.method_43(var5, 0, 0, var9, var10, true);
            method_1165(var0, 0, 0, var1 + var3 - var6, var2 + var4 - var7);
            var8 = var7 - var2;
         }

         var9 = var1 + var3 - var6;
         class_1.method_43(var5, 0, var2, var9, var8, true);
         method_1165(var0, 0, var2, var1 + var3 - var6, var8);
         var3 = var6 - var1;
      }

      if(var2 + var4 > var7) {
         var10 = var2 + var4 - var7;
         class_1.method_43(var5, var1, 0, var3, var10, true);
         method_1165(var0, var1, 0, var3, var2 + var4 - var7);
         var4 = var7 - var2;
      }

      class_1.method_43(var5, var1, var2, var3, var4, true);
      method_1165(var0, var1, var2, var3, var4);
      var1 = class_1.height;
      class_5.field_969 = class_1.width;
      class_5.field_970 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1183() {
      field_1145 = 50;
      field_1147 = 1;
      field_1173 = false;
      field_1174 = 4;
      field_1175 = 20;
      field_1176 = 6;
      field_1185 = 100;
   }
}
