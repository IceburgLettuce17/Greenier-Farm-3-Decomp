import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

// $FF: renamed from: m
public final class class_12 implements Runnable, CommandListener {

   // $FF: renamed from: a java.lang.String
   private static String field_1189;
   // $FF: renamed from: b java.lang.String
   private static String field_1190;
   // $FF: renamed from: c java.lang.String
   private static String field_1191;
   // $FF: renamed from: d java.lang.String
   private static String field_1192;
   // $FF: renamed from: a javax.microedition.lcdui.Font
   private static Font field_1193;
   // $FF: renamed from: e java.lang.String
   private static String field_1194;
   // $FF: renamed from: a int
   private static int field_1195;
   // $FF: renamed from: a boolean[]
   private static boolean[] field_1196;
   // $FF: renamed from: a int[]
   private static int[] field_1197;
   // $FF: renamed from: b int
   private static int field_1198;
   // $FF: renamed from: c int
   private static int field_1199;
   // $FF: renamed from: d int
   private static int field_1200;
   // $FF: renamed from: e int
   private static int field_1201;
   // $FF: renamed from: f int
   private static int field_1202;
   // $FF: renamed from: g int
   private static int field_1203;
   // $FF: renamed from: h int
   private static int field_1204;
   // $FF: renamed from: i int
   private static int field_1205;
   // $FF: renamed from: j int
   private static int field_1206;
   // $FF: renamed from: k int
   private static int field_1207;
   // $FF: renamed from: l int
   private static int field_1208;
   // $FF: renamed from: m int
   private static int field_1209;
   // $FF: renamed from: n int
   private static int field_1210;
   // $FF: renamed from: o int
   private static int field_1211;
   // $FF: renamed from: p int
   private static int field_1212;
   // $FF: renamed from: q int
   private static int field_1213;
   // $FF: renamed from: r int
   private static int field_1214;
   // $FF: renamed from: s int
   private static int field_1215;
   // $FF: renamed from: t int
   private static int field_1216;
   // $FF: renamed from: f java.lang.String
   private static String field_1217;
   // $FF: renamed from: g java.lang.String
   private static String field_1218;
   // $FF: renamed from: h java.lang.String
   private static String field_1219;
   // $FF: renamed from: i java.lang.String
   private static String field_1220;
   // $FF: renamed from: j java.lang.String
   private static String field_1221;
   // $FF: renamed from: k java.lang.String
   private static String field_1222;
   // $FF: renamed from: l java.lang.String
   private static String field_1223;
   // $FF: renamed from: u int
   private static int field_1224;
   // $FF: renamed from: v int
   private static int field_1225;
   // $FF: renamed from: w int
   private static int field_1226;
   // $FF: renamed from: x int
   private static int field_1227;
   // $FF: renamed from: y int
   private static int field_1228;
   // $FF: renamed from: z int
   private static int field_1229;
   // $FF: renamed from: A int
   private static int field_1230;
   // $FF: renamed from: B int
   private static int field_1231;
   // $FF: renamed from: C int
   private static int field_1232;
   // $FF: renamed from: D int
   private static int field_1233;
   // $FF: renamed from: E int
   private static int field_1234;
   // $FF: renamed from: F int
   private static int field_1235;
   // $FF: renamed from: G int
   private static int field_1236;
   // $FF: renamed from: H int
   private static int field_1237;
   // $FF: renamed from: I int
   private static int field_1238;
   // $FF: renamed from: J int
   private static int field_1239;
   // $FF: renamed from: K int
   private static int field_1240;
   // $FF: renamed from: L int
   private static int field_1241;
   // $FF: renamed from: M int
   private static int field_1242;
   // $FF: renamed from: N int
   private static int field_1243;
   // $FF: renamed from: O int
   private static int field_1244;
   // $FF: renamed from: P int
   private static int field_1245;
   // $FF: renamed from: Q int
   private static int field_1246;
   // $FF: renamed from: R int
   private static int field_1247;
   // $FF: renamed from: S int
   private static int field_1248;
   // $FF: renamed from: T int
   private static int field_1249;
   // $FF: renamed from: U int
   private static int field_1250;
   // $FF: renamed from: V int
   private static int field_1251;
   // $FF: renamed from: W int
   private static int field_1252;
   // $FF: renamed from: X int
   private static int field_1253;
   // $FF: renamed from: Y int
   private static int field_1254;
   // $FF: renamed from: Z int
   private static int field_1255;
   // $FF: renamed from: aa int
   private static int field_1256;
   // $FF: renamed from: ab int
   private static int field_1257;
   // $FF: renamed from: b int[]
   private static int[] field_1258;
   // $FF: renamed from: ac int
   private static int field_1259;
   // $FF: renamed from: ad int
   private static int field_1260;
   // $FF: renamed from: ae int
   private static int field_1261;
   // $FF: renamed from: af int
   private static int field_1262;
   // $FF: renamed from: ag int
   private static int field_1263;
   // $FF: renamed from: ah int
   private static int field_1264;
   // $FF: renamed from: m java.lang.String
   private static String field_1265;
   // $FF: renamed from: n java.lang.String
   private static String field_1266;
   // $FF: renamed from: o java.lang.String
   private static String field_1267;
   // $FF: renamed from: p java.lang.String
   private static String field_1268;
   // $FF: renamed from: q java.lang.String
   private static String field_1269;
   // $FF: renamed from: r java.lang.String
   private static String field_1270;
   // $FF: renamed from: s java.lang.String
   private static String field_1271;
   // $FF: renamed from: t java.lang.String
   private static String field_1272;
   // $FF: renamed from: u java.lang.String
   private static String field_1273;
   // $FF: renamed from: v java.lang.String
   private static String field_1274;
   // $FF: renamed from: w java.lang.String
   private static String field_1275;
   // $FF: renamed from: x java.lang.String
   private static String field_1276;
   // $FF: renamed from: y java.lang.String
   private static String field_1277;
   // $FF: renamed from: z java.lang.String
   private static String field_1278;
   // $FF: renamed from: A java.lang.String
   private static String field_1279;
   // $FF: renamed from: B java.lang.String
   private static String field_1280;
   // $FF: renamed from: C java.lang.String
   private static String field_1281;
   // $FF: renamed from: a boolean
   private static boolean field_1282;
   // $FF: renamed from: b boolean
   private static boolean field_1283;
   // $FF: renamed from: D java.lang.String
   private static String field_1284;
   // $FF: renamed from: c boolean
   private static boolean field_1285;
   // $FF: renamed from: a java.lang.String[]
   private static String[] field_1286;
   // $FF: renamed from: ai int
   private static int field_1287;
   // $FF: renamed from: b java.lang.String[]
   private static String[] field_1288;
   // $FF: renamed from: a short[]
   private static short[] field_1289;
   // $FF: renamed from: c java.lang.String[]
   private static String[] field_1290;
   // $FF: renamed from: d java.lang.String[]
   private static String[] field_1291;
   // $FF: renamed from: aj int
   private static int field_1292;
   // $FF: renamed from: d boolean
   private static boolean field_1293;
   // $FF: renamed from: e boolean
   private static boolean field_1294;
   // $FF: renamed from: a int[][]
   private static int[][] field_1295;
   // $FF: renamed from: f boolean
   private static boolean field_1296;
   // $FF: renamed from: a javax.microedition.midlet.MIDlet
   private static MIDlet field_1297;
   // $FF: renamed from: a javax.microedition.lcdui.Canvas
   private static Canvas field_1298;
   // $FF: renamed from: g boolean
   private static boolean field_1299;
   // $FF: renamed from: a javax.microedition.lcdui.CommandListener
   private static CommandListener field_1300;
   // $FF: renamed from: a m
   private static class_12 field_1301;
   // $FF: renamed from: h boolean
   private static boolean field_1302;
   // $FF: renamed from: E java.lang.String
   private static String field_1303;
   // $FF: renamed from: i boolean
   private static boolean field_1304;
   // $FF: renamed from: ak int
   private static int field_1305;
   // $FF: renamed from: al int
   private static int field_1306;
   // $FF: renamed from: am int
   private static int field_1307;
   // $FF: renamed from: an int
   private static int field_1308;
   // $FF: renamed from: ao int
   private static int field_1309;
   // $FF: renamed from: ap int
   private static int field_1310;
   // $FF: renamed from: a e[]
   private static ASprite[] field_1311;
   // $FF: renamed from: a e
   private static ASprite field_1312;
   // $FF: renamed from: b e
   private static ASprite field_1313;
   // $FF: renamed from: c int[]
   private static int[] field_1314;
   // $FF: renamed from: e java.lang.String[]
   private static String[] field_1315;
   // $FF: renamed from: d int[]
   private static int[] field_1316;
   // $FF: renamed from: b boolean[]
   private static boolean[] field_1317;
   // $FF: renamed from: aq int
   private static int field_1318;
   // $FF: renamed from: ar int
   private static int field_1319;
   // $FF: renamed from: as int
   private static int field_1320;
   // $FF: renamed from: at int
   private static int field_1321;
   // $FF: renamed from: F java.lang.String
   private static String field_1322;
   // $FF: renamed from: G java.lang.String
   private static String field_1323;
   // $FF: renamed from: H java.lang.String
   private static String field_1324;
   // $FF: renamed from: I java.lang.String
   private static String field_1325;
   // $FF: renamed from: J java.lang.String
   private static String field_1326;
   // $FF: renamed from: K java.lang.String
   private static String field_1327;
   // $FF: renamed from: j boolean
   private static boolean field_1328;
   // $FF: renamed from: au int
   private static int field_1329;
   // $FF: renamed from: av int
   private static int field_1330;
   // $FF: renamed from: aw int
   private static int field_1331;
   // $FF: renamed from: ax int
   private static int field_1332;
   // $FF: renamed from: ay int
   private static int field_1333;
   // $FF: renamed from: k boolean
   private static boolean field_1334;
   // $FF: renamed from: l boolean
   private static boolean field_1335;
   // $FF: renamed from: m boolean
   private static boolean field_1336;
   // $FF: renamed from: n boolean
   private static boolean field_1337;
   // $FF: renamed from: o boolean
   private static boolean field_1338;
   // $FF: renamed from: az int
   private static int field_1339;
   // $FF: renamed from: aA int
   private static int field_1340;

   // $FF: renamed from: b () boolean
   private static boolean method_1191() {
      method_1192();

      try {
         InputStream var0;
         field_1258 = new int[field_1257 = (field_1257 = (var0 = method_1230("/dataIGP")).read() & 255) + ((var0.read() & 255) << 8)];

         for(int var1 = 0; var1 < field_1257; ++var1) {
            field_1258[var1] = var0.read() & 255;
            field_1258[var1] += (var0.read() & 255) << 8;
            field_1258[var1] += (var0.read() & 255) << 16;
            field_1258[var1] += (var0.read() & 255) << 24;
         }

         var0.close();
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   // $FF: renamed from: a () void
   private static void method_1192() {
      field_1258 = null;
      field_1257 = 0;
      System.gc();
   }

   // $FF: renamed from: a (int) byte[]
   private static byte[] method_1193(int var0) {
      if(var0 >= 0 && var0 < field_1257 - 1) {
         int var1;
         if((var1 = field_1258[var0 + 1] - field_1258[var0]) == 0) {
            return null;
         } else {
            byte[] var2 = null;

            try {
               InputStream var3;
               (var3 = method_1230("/dataIGP")).skip((long)(2 + 4 * field_1257 + field_1258[var0]));

               for(var0 = (var2 = new byte[var1]).length; var0 > 0; var0 -= var3.read(var2)) {
                  ;
               }

               var3.close();
            } catch (Exception var4) {
               ;
            }

            return var2;
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: a (byte[]) int
   private static int method_1194(byte[] var0) {
      return (var0[field_1259++] & 255) + ((var0[field_1259++] & 255) << 8);
   }

   // $FF: renamed from: a (int) java.lang.String
   private static String method_1195(int var0) {
      return "" + field_1288[var0];
   }

   // $FF: renamed from: a (java.lang.String, javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void method_1196(String var0, Graphics var1, int var2, int var3, int var4, int var5) {
      method_1198(var0, var1, var2, var3, var4, var5, 10, false);
   }

   // $FF: renamed from: a (java.lang.String, javax.microedition.lcdui.Graphics, int, int, int, int, boolean) void
   private static void method_1197(String var0, Graphics var1, int var2, int var3, int var4, int var5, boolean var6) {
      method_1198(var0, var1, var2, var3, var4, 3, 10, true);
   }

   // $FF: renamed from: a (java.lang.String, javax.microedition.lcdui.Graphics, int, int, int, int, int, boolean) void
   private static void method_1198(String var0, Graphics var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if(var7) {
         short[] var8;
         if(field_1262 == 0) {
            field_1312.method_971(field_1261);
            var8 = field_1312.method_965(var0, var2, false);
            field_1312.method_966(var1, var0, var8, var3, var4, 0, 10, var5, -1, false);
         } else {
            field_1313.method_971(field_1261);
            var8 = field_1313.method_965(var0, var2, false);
            field_1313.method_966(var1, var0, var8, var3, var4, 0, 10, var5, -1, false);
         }
      } else if(field_1262 == 0) {
         field_1312.method_971(field_1261);
         field_1312.method_968(var1, var0, var3, var4, var5);
      } else {
         field_1313.method_971(field_1261);
         field_1313.method_968(var1, var0, var3, var4, var5);
      }
   }

   // $FF: renamed from: a (javax.microedition.midlet.MIDlet, javax.microedition.lcdui.Canvas, int, int) void
   public static void method_1199(MIDlet var0, Canvas var1, int var2, int var3) {
      (new StringBuffer()).append("initialize(midlet = ").append(var0).append(", game = ").append(var1).append(", screenWidth = ").append(var2).append(", screenHeight = ").append(var3).append(", cmdListener = ").append((Object)null).append(")");
      field_1329 = var3;
      field_1330 = var2;
      field_1331 = field_1329 >> 1;
      field_1332 = field_1330 >> 1;
      if(2 > field_1329) {
         field_1195 = 2;
      }

      if(field_1297 == null && var1 != null) {
         field_1297 = var0;
         field_1298 = var1;
         method_1204();
         String var4 = field_1190;
         (new StringBuffer()).append(var4).append("");
         method_1208();
         field_1279 = null;
         field_1281 = null;
         field_1268 = null;
         field_1265 = null;
         field_1221 = null;
         field_1222 = null;
         field_1223 = null;
         field_1194 = null;
         field_1274 = null;
         field_1275 = null;
         field_1278 = null;
         field_1276 = null;
         field_1280 = null;
         field_1266 = null;
         System.gc();
      }

   }

   // $FF: renamed from: a (java.lang.String, int) boolean
   private static boolean method_1200(String var0, int var1) {
      return var0 == null?false:(var0 = var0.trim()).length() != 0 && var0.toUpperCase().compareTo("DEL") != 0 && var0.toUpperCase().compareTo("NO") != 0 && var0.toUpperCase().compareTo("0") != 0;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.lang.String) java.lang.String
   private static String method_1201(String var0, String var1, String var2) {
      String var3 = "";

      try {
         if(var2 != null && var0 != null && var1 != null) {
            int var4 = var0.indexOf(var1 + "=");
            var2 = var2.trim();
            if(var4 >= 0 && var2.length() > 0) {
               var4 += var1.length() + 1;
               int var7;
               if((var7 = var0.indexOf(field_1280, var4)) < 0) {
                  var7 = var0.length();
               }

               if((var3 = var0.substring(var4, var7).trim()).length() != 0 && var3.compareTo("0") != 0 && var3.toUpperCase().compareTo("NO") != 0) {
                  if(var3.toUpperCase().compareTo("DEL") != 0 && var1.compareTo("OP") != 0) {
                     int var6;
                     if((var6 = var2.indexOf(field_1274)) >= 0) {
                        var3 = var2.substring(0, var6) + var3 + var2.substring(var6 + field_1274.length());
                     } else {
                        var3 = var2;
                     }
                  }
               } else {
                  var3 = "";
               }
            }
         }
      } catch (Exception var5) {
         var3 = "";
      }

      return var3;
   }

   // $FF: renamed from: a (int, java.lang.String, int, java.lang.String, java.lang.String, int) void
   private static void method_1202(int var0, String var1, int var2, String var3, String var4, int var5) {
      try {
         String var6 = "";
         String var8;
         if(field_1283) {
            var8 = method_1201(field_1297.getAppProperty(var3), var1, var4);
            if(var1.equals(field_1218)) {
               var3 = field_1267;
               var6 = method_1201(field_1297.getAppProperty(var3), field_1290[var0 - field_1291.length], var4);
            }
         } else if(var1.equals(field_1220)) {
            var8 = field_1325;
         } else {
            var3 = field_1194 + "-" + var1;
            var8 = field_1297.getAppProperty(var3);
         }

         if(var1.equals(field_1218)) {
            if(field_1283) {
               int var9;
               if((var9 = var8.indexOf(field_1218)) >= 0) {
                  var8 = var8.substring(0, var9) + field_1290[var0 - field_1291.length] + var8.substring(var9 + field_1290[var0 - field_1291.length].length());
               }
            } else {
               var3 = field_1194 + "-" + field_1218 + "-" + field_1290[var0 - field_1291.length];
               var8 = field_1297.getAppProperty(var3);
               var3 = field_1194 + "-" + field_1218 + "-" + field_1290[var0 - field_1291.length];
               var6 = field_1297.getAppProperty(var3);
            }
         }

         boolean var11 = method_1200(var8, 7);
         boolean var10 = true;
         if(var1.equals(field_1218)) {
            var10 = method_1200(var6, 7);
         }

         if(var11 && var10 && (var8.toUpperCase().compareTo("NO") != 0 || var8.toUpperCase().compareTo("0") != 0)) {
            field_1317[var0] = true;
            field_1315[var0] = var8;
            if(field_1317[var0]) {
               field_1316[var0] = var5;
               switch(var5) {
               case 4:
                  ++field_1318;
                  if(field_1282) {
                     field_1315[var0] = field_1315[var0] + field_1276 + field_1278 + (field_1318 < 10?"0":"") + field_1318;
                     return;
                  }
               case 5:
               default:
                  break;
               case 6:
                  ++field_1319;
                  if(field_1282) {
                     field_1315[var0] = field_1315[var0] + field_1276 + field_1218;
                     return;
                  }
                  break;
               case 7:
                  if(field_1282) {
                     field_1315[var0] = field_1315[var0] + field_1276 + field_1219;
                     return;
                  }
                  break;
               case 8:
                  if(field_1282) {
                     field_1315[var0] = field_1315[var0] + field_1276 + field_1220;
                  }
               }
            }
         }

      } catch (Exception var7) {
         ;
      }
   }

   // $FF: renamed from: a (byte[]) java.lang.String[]
   private static String[] method_1203(byte[] var0) {
      String[] var1 = new String[method_1194(var0)];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         int var3 = method_1194(var0);
         var1[var2] = new String(var0, field_1259, var3);
         field_1259 += var3;
      }

      return var1;
   }

   // $FF: renamed from: b () void
   private static void method_1204() {
      try {
         if(!method_1191()) {
            field_1304 = false;
            return;
         }

         byte[] var0;
         method_1194(var0 = method_1193(0));
         int var1 = method_1194(var0);
         field_1259 += var1;
         var1 = method_1194(var0);
         field_1284 = new String(var0, field_1259, var1);
         field_1259 += var1;
         var1 = method_1194(var0);
         field_1259 += var1;
         var1 = method_1194(var0);
         field_1259 += var1;
         var1 = method_1194(var0);
         field_1259 += var1;
         field_1285 = method_1194(var0) == 1;
         method_1194(var0);
         method_1194(var0);
         field_1286 = method_1203(var0);
         field_1291 = method_1203(var0);
         field_1290 = method_1203(var0);
         method_1203(var0);

         for(var1 = 0; var1 < field_1196.length; ++var1) {
            field_1196[var1] = method_1194(var0) == 1;
         }

         try {
            var1 = method_1194(var0);
            field_1191 = new String(var0, field_1259, var1);
            (new StringBuffer()).append("IGP dataIGP version: ").append(field_1191);
            (new StringBuffer()).append(field_1189).append("z");
            if(!field_1191.startsWith(field_1189)) {
               (new StringBuffer()).append("Invalid dataIGP file, dataIGP file IGP Version : ").append(field_1191);
               (new StringBuffer()).append("IGP Class version : ").append(field_1189);
            }
         } catch (Exception var4) {
            field_1304 = false;
         }

         method_1192();
      } catch (Exception var5) {
         field_1304 = false;
         return;
      }

      String[] var9 = field_1290;
      String[] var6 = field_1291;
      int var7 = (field_1291.length - 1 > 0?var6.length - 1:0) + (var9.length - 1 > 0?var9.length - 1:0);
      ++var7;
      field_1207 = (field_1216 = (field_1215 = (field_1214 = (field_1213 = (field_1212 = (field_1211 = (field_1210 = (field_1209 = (field_1206 = (field_1205 = (field_1204 = (field_1203 = (field_1208 = var7 + 1) + 1 + 1 + 1 + 1 + 1) + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1) + 1) + 1) + 1;
      field_1287 = field_1291.length + field_1290.length + 1 + 1;

      for(var7 = 0; var7 < field_1196.length; ++var7) {
         if(field_1196[var7]) {
            field_1197[var7] = ++field_1199;
         } else {
            field_1197[var7] = --field_1198;
         }
      }

      ++field_1199;
      field_1315 = new String[field_1287];
      field_1317 = new boolean[field_1287];
      field_1316 = new int[field_1287];

      for(var7 = 0; var7 < field_1317.length; ++var7) {
         field_1317[var7] = false;
      }

      field_1202 = (field_1201 = (field_1200 = field_1291.length) + field_1290.length) + 1;
      String var8 = field_1269;
      field_1271 = field_1297.getAppProperty(var8);
      var8 = field_1270;
      field_1272 = field_1297.getAppProperty(var8);
      if(field_1271 != null && field_1272.toLowerCase().equals(field_1273.toLowerCase())) {
         field_1327 = field_1271;
         field_1328 = true;
         field_1304 = true;
      } else {
         try {
            var8 = field_1268;
            if((field_1281 = field_1297.getAppProperty(var8)) != null) {
               field_1281 = field_1281.trim();
               field_1283 = true;
               if(field_1281.indexOf(field_1279) != -1) {
                  field_1282 = true;
               }
            }
         } catch (Exception var3) {
            ;
         }

         for(var7 = 0; var7 < field_1291.length; ++var7) {
            method_1202(var7, field_1291[var7], 7, field_1266, field_1281, 4);
         }

         for(var7 = 0; var7 < field_1290.length; ++var7) {
            method_1202(field_1200 + var7, field_1218, 7, field_1265, field_1281, 6);
         }

         try {
            var8 = field_1223;
            if(method_1200(var8 = field_1297.getAppProperty(var8).trim(), 7)) {
               field_1325 = var8;
            }
         } catch (Exception var2) {
            ;
         }

         method_1202(field_1201, field_1219, 7, field_1265, field_1281, 7);
         method_1202(field_1202, field_1220, 7, field_1265, field_1281, 8);
         var8 = field_1221;
         field_1322 = method_1205(field_1297.getAppProperty(var8));
         var8 = field_1222;
         field_1323 = method_1205(field_1297.getAppProperty(var8));
         field_1314 = method_1210();
         if(method_1211() > 0) {
            field_1304 = true;
         }

         (new StringBuffer()).append("isAvailable = ").append(field_1304);
      }
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   private static String method_1205(String var0) {
      if(var0 == null) {
         return "0";
      } else {
         String var1 = "";
         var0 = var0.toUpperCase();
         boolean var2 = false;
         int var3 = field_1330;
         int var4 = field_1329;
         if(var3 >= var4 && var3 == 320) {
            var2 = true;
         }

         char[] var5 = var0.toCharArray();

         for(var3 = 0; var3 < var5.length; ++var3) {
            char var6 = var5[var3];
            if(!var2 || var6 != 10) {
               var1 = var1 + var6;
            }
         }

         return var1;
      }
   }

   // $FF: renamed from: a () boolean
   public static boolean method_1206() {
      return field_1304;
   }

   // $FF: renamed from: a (java.lang.String, int) void
   public static void method_1207(String var0, int var1) {
      (new StringBuffer()).append("enterIGP(loadingMsg = ").append(var0).append(", appLanguage = ").append(0).append(" (").append(field_1286[0]).append(")");
      if(field_1328) {
         method_1209();
         field_1302 = true;
         field_1303 = field_1327;
      } else {
         method_1223();
         if(0 < field_1286.length) {
            boolean var10000 = false;
            int var10001 = field_1286.length;
            field_1321 = 0;
            field_1324 = var0;
            field_1309 = -1;
            field_1305 = 0;
            field_1308 = -1;
            field_1307 = 0;
            field_1302 = true;
            field_1193 = Font.getFont(0, 0, 8);
            method_1209();
         }

         field_1310 = 4 + field_1287;
         field_1307 = method_1212();
      }

      RecordStore var5 = null;

      try {
         var5 = RecordStore.openRecordStore("igp19", false);
      } catch (Exception var4) {
         try {
            var5 = RecordStore.openRecordStore("igp19", true);
         } catch (Exception var3) {
            ;
         }
      }

      try {
         if(var5 != null) {
            var5.closeRecordStore();
         }

      } catch (Exception var2) {
         ;
      }
   }

   // $FF: renamed from: c () boolean
   private static boolean method_1208() {
      boolean var0 = false;

      for(int var1 = 0; var1 < field_1286.length; ++var1) {
         if(field_1286[var1].equals("SP")) {
            var0 = true;
         }
      }

      if(!var0) {
         return false;
      } else {
         try {
            String var4 = field_1265;
            String var6;
            if((var6 = field_1297.getAppProperty(var4)) != null && var6.indexOf(field_1217) != -1) {
               int var2;
               int var5;
               if((var2 = (var5 = var6.indexOf(field_1217) + field_1217.length() + 1) + field_1217.length()) >= var6.length()) {
                  return false;
               } else if(!var6.substring(var5, var2).equals(field_1217)) {
                  return false;
               } else {
                  field_1326 = field_1325;
                  if(field_1282) {
                     if((var5 = (field_1326 = field_1326 + field_1275).indexOf(field_1274)) >= 0) {
                        field_1326 = field_1326.substring(0, var5) + field_1217 + field_1326.substring(var5 + field_1274.length());
                     }

                     if(field_1326.length() == 0) {
                        return false;
                     }
                  }

                  return true;
               }
            } else {
               var4 = field_1194 + "-" + field_1217;
               if((field_1326 = field_1297.getAppProperty(var4)) == null) {
                  return false;
               } else {
                  return true;
               }
            }
         } catch (Exception var3) {
            return false;
         }
      }
   }

   // $FF: renamed from: c () void
   private static void method_1209() {
      if(field_1301 == null) {
         class_12 var10000 = new class_12();
         field_1301 = var10000;
      }

      (new Thread(field_1301)).start();
   }

   // $FF: renamed from: a () int[]
   private static int[] method_1210() {
      int[] var0;
      (var0 = new int[2])[0] = 0;
      var0[1] = 0;

      for(int var1 = 0; var1 < field_1317.length; ++var1) {
         if(field_1317[var1]) {
            if(var1 < field_1200) {
               ++var0[0];
            } else {
               ++var0[1];
            }
         }
      }

      return var0;
   }

   // $FF: renamed from: a () int
   private static int method_1211() {
      int var0 = 0;

      for(int var1 = 0; var1 < field_1317.length; ++var1) {
         if(field_1317[var1]) {
            ++var0;
         }
      }

      return var0;
   }

   // $FF: renamed from: b () int
   private static int method_1212() {
      for(int var0 = 0; var0 < field_1317.length; ++var0) {
         if(field_1317[var0]) {
            return var0;
         }
      }

      return -1;
   }

   // $FF: renamed from: a (int) void
   private static void method_1213(int var0) {
      try {
         field_1259 = 0;
         int var4;
         switch(var0) {
         case -1:
            field_1311 = new ASprite[field_1232];
            return;
         case 0:
            return;
         case 1:
            method_1191();
            byte[] var7;
            method_1194(var7 = method_1193(var0));
            int var1;
            field_1288 = new String[var1 = method_1194(var7)];
            byte[] var2 = new byte[var1];
            System.arraycopy(var7, field_1259, var2, 0, var1);
            field_1259 += var1;
            method_1194(var7);
            int var3;
            field_1289 = new short[var3 = var7[field_1259++] & 255 | (var7[field_1259++] & 255) << 8];

            for(var4 = 0; var4 < var3 - 1; ++var4) {
               field_1289[var4] = (short)((var7[field_1259++] & 255) + ((var7[field_1259++] & 255) << 8));
            }

            field_1289[var3 - 1] = (short)var1;

            for(var4 = 0; var4 < var3; ++var4) {
               var0 = var4 == 0?0:field_1289[var4 - 1] & '\uffff';
               if((var1 = (field_1289[var4] & '\uffff') - var0) != 0) {
                  try {
                     field_1288[var4] = new String(var2, var0, var1, "UTF-8");
                  } catch (Exception var5) {
                     ;
                  }
               }
            }

            return;
         case 2:
            class_1.method_21("/11");
            field_1312 = method_1231(field_1228, 3, true, false);
            short[] var8 = (short[])class_1.method_32(field_1230);
            field_1312.method_955(var8);
            field_1260 = field_1312.method_958();
            field_1313 = method_1231(field_1229, 3, true, false);
            var8 = (short[])class_1.method_32(field_1231);
            field_1313.method_955(var8);
            if(field_1330 > 160 && field_1330 > 220) {
               if(field_1330 <= 320) {
                  field_1312.method_961(-1);
                  if(field_1329 == 240 || field_1285) {
                     field_1312.method_961(0);
                  }
               } else if(field_1330 <= 480) {
                  field_1313.method_961(-1);
               }
            }

            class_1.method_23();
            return;
         case 3:
            class_1.method_21("/11");

            for(var4 = 0; var4 < field_1232; ++var4) {
               if(var4 != field_1228 && var4 != field_1230 && var4 != field_1229 && var4 != field_1231) {
                  field_1311[var4] = method_1231(var4, 1, true, true);
               }
            }

            class_1.method_23();
         case 4:
            return;
         case 5:
            return;
         case 6:
            return;
         case 7:
            return;
         case 8:
            return;
         default:
         }
      } catch (Exception var6) {
         ;
      }
   }

   // $FF: renamed from: b (boolean) void
   private static void method_1214(boolean var0) {
      int var1;
      for(var1 = 0; var1 < field_1232; ++var1) {
         if(field_1311[var1] != null && var1 != field_1228 && var1 != field_1230 && var1 != field_1229 && var1 != field_1231 && var1 != 0) {
            field_1311[var1].method_907();
            field_1311[var1] = null;
         }
      }

      if(var0) {
         method_1192();
         class_1.method_23();
         field_1289 = null;
         field_1288 = null;
         field_1324 = null;

         for(var1 = 0; var1 < field_1232; ++var1) {
            if(field_1311[var1] != null) {
               field_1311[var1].method_907();
               field_1311[var1] = null;
            }
         }

         field_1311 = null;
         field_1312.method_907();
         field_1312 = null;
         field_1313.method_907();
         field_1313 = null;
      }

      System.gc();
   }

   // $FF: renamed from: a (boolean) void
   public static void method_1215(boolean var0) {
      if(!var0) {
         if(field_1305 == 5) {
            field_1305 = field_1308;
            field_1309 = -1;
         }

      } else {
         if(field_1305 == 0 || field_1305 == 2) {
            field_1308 = field_1305;
            field_1305 = 5;
         }

         method_1223();
      }
   }

   // $FF: renamed from: a (int) boolean
   public static boolean method_1216(int var0) {
      if(field_1328) {
         return true;
      } else if(!field_1304) {
         return true;
      } else {
         if(field_1334) {
            field_1334 = false;
         } else {
            field_1306 = var0;
         }

         int var1;
         switch(field_1305) {
         case 0:
            if(field_1309 >= field_1310) {
               field_1305 = 1;
               field_1320 = field_1307;
               var0 = field_1330;
               var1 = field_1329;
               field_1295 = new int[field_1256][];

               int var2;
               for(var2 = 0; var2 < field_1256; ++var2) {
                  field_1295[var2] = new int[2];
                  field_1295[var2][0] = 0;
                  field_1295[var2][1] = 0;
               }

               var2 = method_1217(0, 0);
               int var3 = method_1218(0, 0);
               int var4 = method_1217(field_1224, 0);
               int var5 = method_1218(field_1224, 0);
               int var6 = method_1218(0, 9);
               int var7 = method_1217(0, 10);
               int var8 = method_1218(0, 10);
               if(var0 == 240 && (var1 == 320 || var1 == 400) || var0 == 360 && (var1 == 640 || var1 == 480)) {
                  var7 = method_1217(0, 35);
                  var8 = method_1218(0, 35);
               }

               int var9 = method_1218(0, 15);
               int var10 = method_1218(0, 29);
               field_1312.method_967(method_1195(field_1216), (char[])null);
               ASprite var10000 = field_1312;
               String var10001 = method_1195(field_1216);
               int var13 = var0 - var2;
               short[] var11 = var10000.method_965(var10001, var13, false);
               field_1264 = ASprite.field_996;
               int var18 = field_1263 = var11[0] * field_1260;
               if(var3 > field_1263) {
                  var18 = var3;
               }

               if(var8 > var18) {
                  var18 = var8;
               }

               int var12 = field_1260;
               var18 += field_1260 + var6 + var5;
               var18 = var1 - var18 - 3 - var9 >> 2;
               byte var19 = -3;
               if(var1 <= 160) {
                  var19 = 2;
               } else if(var1 <= 220) {
                  var19 = 1;
               } else if(var1 <= 240) {
                  var19 = 0;
               } else if(var1 <= 320) {
                  var19 = 0;
                  if(var0 == 240) {
                     var19 = 1;
                  }
               } else if(var1 <= 360) {
                  var19 = 3;
               } else if(var1 <= 400) {
                  var19 = 1;
               } else if(var1 <= 480) {
                  var19 = 6;
                  if(var0 == 360) {
                     var19 = 0;
                  }
               } else if(var1 <= 640) {
                  var19 = 0;
               } else if(var1 <= 800) {
                  var19 = 3;
               }

               int var14 = method_1217(0, 15);
               int var15 = method_1217(0, 17);
               if(var0 == 240 && (var1 == 320 || var1 == 400) || var0 == 360 && (var1 == 640 || var1 == 480)) {
                  var14 = method_1217(0, 31);
                  var15 = method_1217(0, 33);
               }

               field_1295[field_1234][0] = var0 - var14 >> 2;
               field_1295[field_1234][1] = 3;
               field_1295[field_1235][0] = (var0 - var15 >> 2) * 3;
               field_1295[field_1235][1] = field_1295[field_1234][1];
               var14 = field_1311[0].method_935(15);
               var15 = field_1311[0].method_928(15, var14 - 1);
               field_1295[field_1236][0] = var0 >> 2;
               field_1295[field_1236][1] = field_1295[field_1234][1] + (var15 >> 1) + var19;
               field_1295[field_1237][0] = (var0 >> 1) + (var0 >> 2);
               field_1295[field_1237][1] = field_1295[field_1236][1];
               field_1295[0][0] = var0 >> 1;
               field_1295[0][1] = var18 + (var12 >> 1) + var19 + -2;
               field_1295[0][1] += field_1295[field_1234][1] + var9;
               field_1295[field_1238][0] = 0;
               field_1295[field_1238][1] = field_1295[0][1] + var18 + (var12 >> 1) - var19 - -2;
               field_1295[field_1233][0] = var0 >> 1;
               field_1295[field_1233][1] = field_1295[field_1238][1] + (var6 >> 1) + var19 + -2;
               var14 = method_1217(0, 2);
               var15 = method_1218(0, 2);
               field_1295[field_1245][0] = 5;
               field_1295[field_1245][1] = field_1295[field_1238][1] + (var6 >> 1) - (var15 >> 1);
               field_1295[field_1246][0] = var0 - 5 - var14;
               field_1295[field_1246][1] = field_1295[field_1245][1];
               field_1295[field_1243][0] = var0 - field_1195 - var2;
               field_1295[field_1243][1] = var1 - 2 - var3;
               field_1295[field_1255][0] = field_1195;
               field_1295[field_1255][1] = var1 - 2 - var3;
               var15 = field_1295[field_1243][0] - (var7 << 1);
               field_1295[field_1248][0] = var15 / 3;
               field_1295[field_1248][1] = var1 - 2 - var8;
               field_1295[field_1250][0] = field_1295[field_1248][0] + (var7 >> 1) + var7 % 2;
               field_1295[field_1250][1] = field_1295[field_1248][1] + (var8 >> 1) + var19;
               field_1295[field_1247][0] = field_1295[field_1248][0] + var7 + var15 / 3;
               field_1295[field_1247][1] = field_1295[field_1248][1];
               field_1295[field_1251][0] = field_1295[field_1247][0] + (var7 >> 1) + var7 % 2;
               field_1295[field_1251][1] = field_1295[field_1247][1] + (var8 >> 1) + var19;
               field_1295[field_1249][0] = (var0 >> 1) - (var7 >> 1);
               field_1295[field_1249][1] = field_1295[field_1248][1];
               field_1295[field_1252][0] = field_1295[field_1249][0] + (var7 >> 1) + var7 % 2;
               field_1295[field_1252][1] = field_1295[field_1249][1] + (var8 >> 1) + var19;
               field_1295[field_1239][0] = (var0 >> 1) - (var4 >> 1);
               field_1295[field_1239][1] = field_1295[field_1238][1] + var6 + var18;
               field_1295[field_1253][0] = var0 - var2 >> 1;
               field_1295[field_1253][1] = field_1295[field_1239][1] + var5 + (var1 - field_1295[field_1239][1] - var5 >> 1);
               field_1295[field_1253][0] = var0 - var7 >> 2;
               if(var1 > var0) {
                  field_1295[field_1253][1] = field_1295[field_1239][1] + var5 + (field_1295[field_1249][1] - (field_1295[field_1239][1] + var5) >> 1);
                  field_1295[field_1253][0] = var0 >> 1;
               }

               field_1295[field_1240][0] = var0 >> 1;
               field_1295[field_1240][1] = field_1295[field_1239][1] + (var5 << 1) / 3;
               field_1295[field_1241][0] = 5;
               field_1295[field_1241][1] = field_1295[field_1239][1] + (var5 >> 1) - (method_1218(0, 6) >> 1);
               field_1295[field_1242][0] = var0 - method_1217(0, 4) - 5;
               field_1295[field_1242][1] = field_1295[field_1241][1];
               var14 = method_1217(0, 8);
               var15 = method_1218(0, 8);
               if(var0 == 360 && var1 == 480) {
                  var14 = method_1217(0, 39);
                  var15 = method_1218(0, 39);
               }

               field_1295[field_1244][0] = field_1295[field_1239][0] + var4 - var14;
               field_1295[field_1244][1] = field_1295[field_1239][1] + var5 - var15;
               field_1295[field_1254][0] = 0;
               field_1295[field_1254][1] = field_1295[0][1] - (var10 >> 1);
               var0 = field_1311[0].method_935(15);
               var0 = field_1311[0].method_928(15, var0 - 1);
               field_1295[field_1254][1] = field_1295[field_1234][1] + (var0 >> 1) - (var10 >> 1);
            } else {
               method_1213(field_1309);
            }

            ++field_1309;
            break;
         case 1:
            byte var17;
            switch(field_1306) {
            case 21:
            case 22:
            case 30:
            case 31:
            case 32:
            default:
               return false;
            case 23:
               var17 = 0;
               if(field_1307 >= field_1200) {
                  var17 = 1;
               }

               if(field_1314[var17] <= 1) {
                  return false;
               }

               if(field_1307 == 0) {
                  field_1307 = field_1200 - 1;
               } else if(field_1307 == field_1200) {
                  field_1307 = field_1287 - 1;
               } else {
                  --field_1307;
               }

               while(!field_1317[field_1307]) {
                  if(field_1307 == 0) {
                     field_1307 = field_1200 - 1;
                  } else if(field_1307 == field_1200) {
                     field_1307 = field_1287 - 1;
                  } else {
                     --field_1307;
                  }
               }

               field_1293 = true;
               break;
            case 24:
               var17 = 0;
               if(field_1307 >= field_1200) {
                  var17 = 1;
               }

               if(field_1314[var17] > 1) {
                  if(!field_1293) {
                     if(field_1307 == field_1200 - 1) {
                        field_1307 = 0;
                     } else if(field_1307 == field_1287 - 1) {
                        field_1307 = field_1200;
                     } else {
                        ++field_1307;
                     }

                     while(!field_1317[field_1307]) {
                        if(field_1307 == field_1200 - 1) {
                           field_1307 = 0;
                        } else if(field_1307 == field_1287 - 1) {
                           field_1307 = field_1200;
                        } else {
                           ++field_1307;
                        }
                     }

                     field_1294 = true;
                  }

                  field_1320 = field_1307;
               }

               return false;
            case 25:
            case 27:
               field_1305 = 6;
               return false;
            case 26:
               field_1305 = 4;
               return false;
            case 28:
               label202:
               while(true) {
                  for(field_1307 = 0; !field_1317[field_1307]; ++field_1307) {
                     if(field_1307 == field_1200 - 1) {
                        continue label202;
                     }
                  }

                  field_1320 = field_1307;
                  return false;
               }
            case 29:
               label188:
               while(true) {
                  field_1307 = field_1200;

                  while(true) {
                     if(field_1317[field_1307]) {
                        break label188;
                     }

                     if(field_1307 == field_1287 - 1) {
                        break;
                     }

                     ++field_1307;
                  }
               }
            }

            field_1320 = field_1307;
            break;
         case 2:
            method_1214(false);
            var0 = field_1307;
            method_1213(field_1309 = field_1316[var0] == 4?field_1316[var0]:(field_1316[var0] == 6?6:(field_1316[var0] == 7?7:(field_1316[var0] == 8?8:-1))));
            field_1305 = 1;
            break;
         case 3:
            switch(field_1306) {
            case 25:
            case 30:
               field_1303 = null;
               return false;
            case 26:
               field_1305 = 1;
               return false;
            default:
               return false;
            }
         case 4:
            method_1214(true);
            field_1302 = false;
            return true;
         case 5:
         default:
            break;
         case 6:
            String var16;
            if(field_1296) {
               var16 = field_1315[field_1202];
            } else {
               var16 = field_1315[field_1307];
            }

            if(var16 != null && var16.length() > 0) {
               if(field_1282) {
                  if((var1 = var16.indexOf(field_1277)) == -1) {
                     var16 = var16 + field_1277 + field_1286[0];
                  } else {
                     var16 = var16.substring(0, var1) + field_1277 + field_1286[0] + var16.substring(var1 + field_1277.length() + 2);
                  }
               }

               field_1303 = var16;
            }
         }

         return false;
      }
   }

   // $FF: renamed from: a (int, int) int
   private static int method_1217(int var0, int var1) {
      return field_1311[var0].method_918(var1);
   }

   // $FF: renamed from: b (int, int) int
   private static int method_1218(int var0, int var1) {
      return field_1311[var0].method_919(var1);
   }

   // $FF: renamed from: a (int, int) void
   public static void method_1219(int var0, int var1) {
      int var2 = method_1222(var0, var1);
      int var3 = field_1330;
      int var4 = field_1329;
      int var6 = var0;
      var0 = var1;
      var1 = var4 - var6;
      int var5 = method_1218(0, 10);
      if(var3 == 240 && (var4 == 320 || var4 == 400) || var3 == 360 && (var4 == 640 || var4 == 480)) {
         var5 = method_1218(0, 35);
      }

      var6 = method_1218(0, 15);
      int var7 = method_1217(0, 6);
      int var8 = method_1218(0, 6);
      if(Math.abs(field_1339 - var0) > var3 * 10 / 100 && var1 < var4 - var5 && var1 > var6 && (field_1339 >= var7 || field_1340 <= field_1295[field_1241][1] || field_1340 >= field_1295[field_1241][1] + var8) && (field_1339 <= var3 - var7 || field_1340 <= field_1295[field_1242][1] || field_1340 >= field_1295[field_1242][1] + var8) && field_1340 >= var6 && field_1340 <= var4 - var5) {
         if(field_1339 - var0 < 0) {
            var2 = 23;
            field_1336 = true;
         } else {
            var2 = 24;
            field_1336 = true;
         }
      }

      if(var2 != 0) {
         field_1306 = var2;
         field_1334 = true;
         if(field_1337 && field_1315[field_1202] != null) {
            field_1296 = true;
         }
      }

      field_1333 = 0;
      field_1335 = false;
      field_1337 = false;
      field_1338 = false;
      field_1339 = -1;
      field_1340 = -1;
   }

   // $FF: renamed from: b (int, int) void
   public static void method_1220(int var0, int var1) {
      int var2;
      if((var2 = method_1222(var0, var1)) != 0) {
         field_1333 = var2;
      }

      var2 = field_1329;
      int var3 = var0;
      var0 = var1;
      var1 = var2 - var3;
      if(field_1339 == -1 || field_1340 == -1) {
         field_1339 = var0;
         field_1340 = var1;
      }

   }

   // $FF: renamed from: c (int, int) void
   public static void method_1221(int var0, int var1) {
      field_1306 = 0;
      field_1333 = 0;
      field_1335 = false;
      field_1337 = false;
      field_1338 = false;
      method_1220(var0, var1);
   }

   // $FF: renamed from: c (int, int) int
   private static int method_1222(int var0, int var1) {
      int var2 = field_1330;
      int var3 = field_1329;
      int var4 = var0;
      var0 = var1;
      var1 = var3 - var4;
      if(var0 >= 0 && var1 >= 0) {
         if(field_1305 != 0 && field_1302) {
            if(var1 > field_1295[field_1234][1] && var1 < field_1295[field_1234][1] + method_1218(0, 15)) {
               if(var0 < var2 >> 1) {
                  if(field_1307 > field_1291.length - 1) {
                     return 28;
                  }
               } else if(field_1307 < field_1291.length) {
                  return 29;
               }
            }

            var4 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4) + 1;
            if(var0 > field_1295[field_1241][0] + var4 && var0 < field_1295[field_1241][0] + method_1217(0, 6) + var4 && var1 > field_1295[field_1241][1] && var1 < field_1295[field_1241][1] + method_1218(0, 6)) {
               return 23;
            } else if(var0 > field_1295[field_1242][0] - var4 && var0 < field_1295[field_1242][0] + method_1217(0, 4) - var4 && var1 > field_1295[field_1242][1] && var1 < field_1295[field_1242][1] + method_1218(0, 4)) {
               return 24;
            } else {
               var4 = method_1217(0, 10);
               int var5 = method_1218(0, 10);
               if(var2 == 240 && (var3 == 320 || var3 == 400) || var2 == 360 && (var3 == 640 || var3 == 480)) {
                  var4 = method_1217(0, 35);
                  var5 = method_1218(0, 35);
               }

               if(field_1316[field_1307] != 6 && field_1316[field_1307] != 7 && field_1316[field_1307] != 8) {
                  if(var0 > field_1295[field_1248][0] && var0 < field_1295[field_1248][0] + var4 && var1 > field_1295[field_1248][1] && var1 < field_1295[field_1248][1] + var5) {
                     field_1337 = true;
                     return 25;
                  }

                  if(var0 > field_1295[field_1247][0] && var0 < field_1295[field_1247][0] + var4 && var1 > field_1295[field_1247][1] && var1 < field_1295[field_1247][1] + var5) {
                     field_1335 = true;
                     return 25;
                  }
               } else if(var0 > field_1295[field_1249][0] && var0 < field_1295[field_1249][0] + var4 && var1 > field_1295[field_1249][1] && var1 < field_1295[field_1249][1] + var5) {
                  field_1335 = true;
                  return 25;
               }

               if(var0 > field_1295[field_1243][0] - 10 && var0 < field_1295[field_1243][0] + method_1217(0, 0) + 10 && var1 > field_1295[field_1243][1] - 10 && var1 < field_1295[field_1243][1] + method_1218(0, 0) + 10) {
                  field_1338 = true;
                  return 26;
               } else {
                  var2 = method_1217(field_1224, 0);
                  var3 = method_1218(field_1224, 0);
                  return var0 > field_1295[field_1239][0] && var0 < field_1295[field_1239][0] + var2 && var1 > field_1295[field_1239][1] && var1 < field_1295[field_1239][1] + var3?25:0;
               }
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   // $FF: renamed from: d () void
   private static void method_1223() {
      field_1306 = 0;
      field_1333 = 0;
      field_1334 = true;
      field_1335 = false;
      field_1337 = false;
      field_1338 = false;
      field_1292 = 0;
      field_1293 = false;
      field_1294 = false;
      field_1339 = -1;
      field_1340 = -1;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics) void
   public static void method_1224(Graphics var0) {
      if(!field_1328) {
         if(field_1304) {
            Graphics var1 = var0;
            method_1229(var0, 0, 0, field_1329, field_1330);
            int var3;
            int var4;
            int var5;
            int var6;
            int var8;
            int var10001;
            int var10002;
            switch(field_1305) {
            case 0:
               var0.setColor(0);
               var4 = field_1329;
               var3 = field_1330;
               class_1.method_43(var0, 0, 0, var3, var4, true);
               var10002 = field_1330 * 3 / 4;
               var6 = field_1310;
               var5 = field_1309;
               var4 = var10002;
               var3 = field_1331;
               if(var5 > var6) {
                  var5 = var6;
               }

               int var7 = (field_1330 - var4) / 2;
               var5 = (var4 - 2 - 2) * var5 / var6 + 1;
               method_1229(var0, 0, 0, field_1329, field_1330);
               var8 = 16777215;
               var0.setColor(16777215);
               class_1.method_43(var0, var7, var3, var4, 6, true);
               var0.setColor(0);
               var10001 = var7 + 1 + 1;
               var10002 = var3 + 1 + 1;
               var8 = var4 - 2 - 1;
               var6 = var10002;
               class_1.method_43(var0, var10001, var6, var8, 3, true);
               var4 = 16711680;
               var0.setColor(16711680);
               class_1.method_43(var0, var7 + 1 + 1, var6, var5, 3, true);
               if(field_1324 != null && !field_1324.trim().equals("")) {
                  Image var10;
                  Graphics var11;
                  (var11 = (var10 = Image.createImage(field_1330, 30)).getGraphics()).setColor(0);
                  var5 = field_1330;
                  class_1.method_43(var11, 0, 0, 30, var5, true);
                  var5 = 16777215;
                  var11.setColor(16777215);
                  if(var11 == null) {
                     class_1.field_1 = class_1.field_2;
                  } else {
                     class_1.field_1 = var11;
                  }

                  Font var12 = field_1193;
                  class_1.field_1.setFont(var12);
                  class_1.method_47(field_1324, field_1332, 25, 33);
                  if(var0 == null) {
                     class_1.field_1 = class_1.field_2;
                  } else {
                     class_1.field_1 = var0;
                  }

                  var0.drawRegion(var10, 0, 0, field_1329, 30, 5, field_1331 + 5 + 30, 0, 0);
                  return;
               }
               break;
            case 1:
               method_1226(var0);
               if(System.currentTimeMillis() % 1000L > 500L || field_1333 == 27 && !field_1335) {
                  if(field_1307 != field_1202) {
                     return;
                  }

                  return;
               }
               break;
            case 2:
               return;
            case 3:
               method_1226(var0);
               int var2 = field_1329;
               var3 = field_1330;
               int var9 = var2 * 40 / 100;
               var5 = method_1217(0, 0) - 5;
               method_1225(var1, 0, var9 - 1, var3, var2 - (var9 - 1 << 1), -1);
               method_1225(var1, 0, var9, var3, var2 - (var9 << 1), -220209185);
               var6 = 16777215;
               var1.setColor(16777215);
               var10001 = var2 - (var5 + 1);
               var8 = var5 + 1;
               var6 = var10001;
               class_1.method_43(var1, 0, var6, var3, var8, true);
               var4 = -220209185;
               var1.setColor(-220209185);
               var4 = var2 - var5;
               class_1.method_43(var1, 0, var4, var3, var5, true);
               field_1261 = 1;
               var10002 = var3 >> 1;
               var5 = var2 >> 1;
               var4 = var10002;
               method_1197(method_1195(field_1207), var1, field_1329, var4, var5, 3, true);
               method_1227(var1);
            case 4:
            default:
               break;
            case 5:
               return;
            }

         }
      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
   private static void method_1225(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[var3 * var4];

      for(int var6 = 0; var6 < var7.length; ++var6) {
         var7[var6] = var5;
      }

      var0.drawRGB(var7, 0, var3, 0, var2, var3, var4, true);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics) void
   private static void method_1226(Graphics var0) {
      int var1 = field_1330;
      int var2 = field_1329;
      int var4 = 16777215;
      var0.setColor(16777215);
      if(field_1196[0]) {
         var0.setColor(0);
      }

      int var3 = 16777215;
      var0.setColor(16777215);
      class_1.method_43(var0, 0, 0, var1, var2, true);
      var3 = field_1295[0][0];
      var4 = field_1295[0][1];
      int var5 = field_1295[field_1233][0];
      int var6 = field_1295[field_1233][1];
      int var7 = field_1295[field_1239][0];
      int var8 = field_1295[field_1239][1];
      int var9 = field_1295[field_1244][0];
      int var10 = field_1295[field_1244][1];
      int var11 = field_1295[field_1238][0];
      int var12 = field_1295[field_1238][1];
      int var13 = field_1295[field_1245][0];
      int var14 = field_1295[field_1245][1];
      int var15 = field_1295[field_1246][0];
      int var16 = field_1295[field_1246][1];
      int var17 = field_1295[field_1253][0];
      int var18 = field_1295[field_1253][1];
      int var19 = field_1295[field_1254][1];
      method_1228(var0, 0, 9, var11, var12);
      field_1261 = 1;
      field_1262 = 0;
      byte var29;
      if(field_1316[field_1307] == 6) {
         if(!field_1322.equals("0")) {
            method_1196(field_1322, var0, var1, var3, var4, 3);
         }

         method_1196(method_1195(field_1320), var0, var1, var5, var6, 3);
         method_1228(var0, field_1225 + (field_1307 - field_1200), 0, var7, var8);
         var29 = 8;
         if(var1 == 360 && var2 == 480) {
            var29 = 39;
         }

         method_1228(var0, 0, var29, var9, var10);
         if(field_1284 == null || !field_1284.equals("TMUS")) {
            var4 = field_1262;
            field_1262 = 1;
            var3 = method_1217(0, 10);
            if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
               var3 = method_1217(0, 35);
            }

            var5 = var1 - field_1195 - var3 >> 1;
            if(var2 > var1) {
               var5 = var1;
            }

            method_1197(method_1195(field_1216), var0, var5, var17, var18, 3, true);
            field_1262 = var4;
         }
      } else if(field_1316[field_1307] == 7) {
         if(!field_1323.equals("0")) {
            method_1196(field_1323, var0, var1, var3, var4, 3);
         }

         method_1196(method_1195(field_1210), var0, var1, var5, var6, 3);
         method_1228(var0, field_1226, 0, var7, var8);
      } else if(field_1316[field_1307] == 8) {
         method_1196(method_1195(field_1211), var0, var1, var3, var4, 3);
         method_1196(method_1195(field_1208), var0, var1 * 3 / 4, var5, var6, 3);
         method_1228(var0, field_1227, 0, var7, var8);
      } else {
         field_1261 = 1;
         method_1196(method_1195(field_1209), var0, var1, var3, var4, 3);
         method_1196(method_1195(field_1320), var0, var1 * 3 / 4, var5, var6, 3);
         method_1228(var0, field_1224 + field_1307, 0, var7, var8);
      }

      var29 = 0;
      if(field_1307 >= field_1200) {
         var29 = 1;
      }

      boolean var30 = false;
      if(field_1314[var29] > 1) {
         var30 = true;
      }

      if(var30) {
         method_1228(var0, 0, 2, var13, var14);
         method_1228(var0, 0, 3, var15, var16);
      }

      var3 = field_1295[field_1234][0];
      var5 = field_1295[field_1234][1];
      var6 = field_1295[field_1235][0];
      var7 = field_1295[field_1235][1];
      var8 = field_1295[field_1248][0];
      var9 = field_1295[field_1248][1];
      var10 = field_1295[field_1247][0];
      var11 = field_1295[field_1247][1];
      var12 = field_1295[field_1249][0];
      var13 = field_1295[field_1249][1];
      var14 = field_1295[field_1236][0];
      var15 = field_1295[field_1236][1];
      var16 = field_1295[field_1237][0];
      var17 = field_1295[field_1237][1];
      var18 = field_1295[field_1250][0];
      int var20 = field_1295[field_1250][1];
      int var21 = field_1295[field_1251][0];
      int var22 = field_1295[field_1251][1];
      int var23 = field_1295[field_1252][0];
      int var24 = field_1295[field_1252][1];
      ASprite var10000;
      String var10001;
      byte var28;
      byte var35;
      if(field_1316[field_1307] != 6 && field_1316[field_1307] != 7 && field_1316[field_1307] != 8) {
         byte var37 = 17;
         byte var38 = 16;
         if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
            var37 = 33;
            var38 = 32;
         }

         method_1228(var0, 0, var37, var6, var7);
         method_1228(var0, 0, var38, var3, var5);
         byte var39 = 13;
         var28 = 10;
         if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
            var39 = 37;
            var28 = 35;
         }

         if(field_1335) {
            var39 = 11;
            if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
               var39 = 36;
            }
         }

         if(field_1337) {
            var28 = 11;
            if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
               var28 = 36;
            }
         }

         method_1228(var0, 0, var28, var8, var9);
         method_1228(var0, 0, var39, var10, var11);
         field_1261 = 0;
         if(field_1337) {
            field_1261 = 1;
         }

         method_1196(method_1195(field_1214), var0, var1, var18, var20 - 2, 3);
         var8 = method_1217(0, 19);
         var3 = method_1217(0, 10);
         var5 = method_1218(0, 10);
         if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
            var3 = method_1217(0, 35);
            var5 = method_1218(0, 35);
         }

         var10000 = field_1312;
         var10001 = method_1195(field_1215);
         var9 = var3 - var8 - 4;
         short[] var32;
         field_1264 = (var32 = var10000.method_965(var10001, var9, false))[2];
         if(var32[0] > 1) {
            field_1264 = var3 - var8 - 8;
         }

         var7 = field_1264 + var8 + 4;
         var7 = (var7 = var3 - var7) < 0?0:var7 >> 1;
         method_1228(var0, 0, 19, var21 - (var3 >> 1) + var7, var11 + (var5 >> 1) - (method_1218(0, 19) >> 1));
         field_1261 = 0;
         if(field_1335) {
            field_1261 = 1;
         }

         if(var32[0] > 1) {
            var35 = -4;
            if(var1 == 320 || var2 == 320) {
               var35 = 4;
            }

            method_1197(method_1195(field_1215), var0, var3 - var8 + var35, var21 + (var8 >> 1), var22 - 2, 3, true);
         } else {
            method_1196(method_1195(field_1215), var0, var1, var21 - (var3 >> 1) + var7 + var8 + 2, var22 - 2, 6);
         }

         field_1261 = 0;
      } else {
         int var25 = method_1217(0, 19);
         int var26 = method_1217(0, 10);
         int var27 = method_1218(0, 10);
         if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
            var26 = method_1217(0, 35);
            var27 = method_1218(0, 35);
         }

         var28 = 15;
         byte var36 = 18;
         if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
            var28 = 31;
            var36 = 34;
         }

         method_1228(var0, 0, var28, var3, var5);
         method_1228(var0, 0, var36, var6, var7);
         var29 = 13;
         if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
            var29 = 37;
         }

         if(field_1335) {
            var29 = 11;
            if(var1 == 240 && (var2 == 320 || var2 == 400) || var1 == 360 && (var2 == 640 || var2 == 480)) {
               var29 = 36;
            }
         }

         method_1228(var0, 0, var29, var12, var13);
         field_1261 = 0;
         if(field_1335) {
            field_1261 = 1;
         }

         var10000 = field_1312;
         var10001 = method_1195(field_1215);
         var6 = var26 - var25 - 4;
         short[] var31;
         field_1264 = (var31 = var10000.method_965(var10001, var6, false))[2];
         if(var31[0] > 1) {
            field_1264 = var26 - var25 - 8;
         }

         var6 = field_1264 + var25 + 4;
         var7 = (var7 = var26 - var6) < 0?0:var7 >> 1;
         method_1228(var0, 0, 19, var23 - (var26 >> 1) + var7, var13 + (var27 >> 1) - (method_1218(0, 19) >> 1));
         if(var31[0] > 1) {
            var35 = -4;
            if(var1 == 320 || var2 == 320) {
               var35 = 4;
            }

            method_1197(method_1195(field_1215), var0, var26 - var25 + var35, var23 + (var25 >> 1), var24 - 2, 3, true);
         } else {
            method_1196(method_1195(field_1215), var0, var1, var23 - (var26 >> 1) + var7 + var25 + 2, var24 - 2, 6);
         }
      }

      field_1261 = 0;
      method_1196(method_1195(field_1212), var0, var1, var14, var15, 3);
      method_1196(method_1195(field_1213), var0, var1, var16, var17, 3);
      field_1264 = field_1312.method_965(method_1195(field_1213), var1, false)[2];
      method_1228(var0, 0, 29, var16 + (field_1264 >> 1) + 3, var19);
      if(var30) {
         var3 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4);
         byte var34 = 6;
         byte var33 = 4;
         var7 = var3 + 1;
         var8 = field_1295[field_1241][0];
         var9 = field_1295[field_1241][1];
         var10 = field_1295[field_1242][0];
         var11 = field_1295[field_1242][1];
         if(field_1293 || field_1333 == 23) {
            if(!field_1336) {
               var34 = 7;
            }

            ++field_1292;
         }

         if(field_1294 || field_1333 == 24) {
            if(!field_1336) {
               var33 = 5;
            }

            ++field_1292;
         }

         method_1228(var0, 0, var34, var8 + var7, var9);
         method_1228(var0, 0, var33, var10 - var7, var11);
         if(field_1292 > 4) {
            field_1293 = false;
            field_1294 = false;
            field_1292 = 0;
            field_1336 = false;
         }
      }

      method_1227(var0);
   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics) void
   private static void method_1227(Graphics var0) {
      int var1 = field_1295[field_1243][0];
      int var2 = field_1295[field_1243][1];
      byte var3 = 0;
      if(field_1338) {
         var3 = 1;
      }

      method_1228(var0, 0, var3, var1, var2);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void method_1228(Graphics var0, int var1, int var2, int var3, int var4) {
      field_1311[var1].method_980(var0, var2, var3, var4, 0);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int) void
   private static void method_1229(Graphics var0, int var1, int var2, int var3, int var4) {
      var1 = Math.max(0, 0);
      var2 = Math.max(0, 0);
      var3 = Math.min(var3, field_1329);
      var4 = Math.min(var4, field_1330);
      class_1.method_41(var0, var1, var2, var4, var3, true);
   }

   public final void run() {
      (new StringBuffer()).append("Thread.activeCount() = ").append(Thread.activeCount());

      while(field_1302) {
         try {
            if(field_1303 != null) {
               if((field_1192 = field_1303) != null && field_1192.length() > 0) {
                  field_1296 = false;
                  String var3 = field_1192;
                  field_1192 = null;
                  (new StringBuffer()).append("urlPlatformRequest = ").append(var3);

                  try {
                     field_1297.platformRequest(var3);
                     Thread.sleep(200L);
                  } catch (Exception var1) {
                     ;
                  }

                  field_1305 = 1;
               }

               field_1303 = null;
            }

            Thread.sleep(1000L);
         } catch (Exception var2) {
            ;
         }
      }

   }

   public final void commandAction(Command var1, Displayable var2) {}

   // $FF: renamed from: a (java.lang.String) java.io.InputStream
   private static InputStream method_1230(String var0) {
      return "a".getClass().getResourceAsStream(var0);
   }

   // $FF: renamed from: a (int, int, boolean, boolean) e
   private static ASprite method_1231(int var0, int var1, boolean var2, boolean var3) {
      ASprite var10000 = new ASprite();
      ASprite var4 = var10000;
      var10000.method_908(class_1.method_27(var0), 0);

      for(var0 = 0; var1 >> var0 != 0; ++var0) {
         if((var1 >> var0 & 1) != 0) {
            var4.method_974(var0, 0, -1, -1);
         }
      }

      if(var3) {
         var4.method_910();
      }

      return var4;
   }

   // $FF: renamed from: <clinit> () void
   class_12() {
	  super();
      field_1189 = "2.3";
      field_1190 = "IGP-Signature=" + field_1189;
      field_1191 = "";
      field_1194 = "URL";
      field_1195 = 2;
      field_1196 = new boolean[1];
      field_1197 = new int[1];
      field_1198 = -1;
      field_1199 = 8;
      field_1217 = "ZVIP";
      field_1218 = "SCFR";
      field_1219 = "GMCL";
      field_1220 = "CCTL";
      field_1221 = "TITLE-FREEMIUM";
      field_1222 = "TITLE-GLCLUB";
      field_1223 = "URL-OPERATOR";
      field_1224 = 1;
      field_1225 = 4;
      field_1226 = 8;
      field_1227 = 9;
      field_1228 = 10;
      field_1229 = 11;
      field_1230 = 12;
      field_1231 = 13;
      field_1232 = 14;
      field_1233 = 1;
      field_1234 = 2;
      field_1235 = 3;
      field_1236 = 4;
      field_1237 = 5;
      field_1238 = 6;
      field_1239 = 7;
      field_1240 = 8;
      field_1241 = 9;
      field_1242 = 10;
      field_1243 = 11;
      field_1244 = 12;
      field_1245 = 13;
      field_1246 = 14;
      field_1247 = 15;
      field_1248 = 16;
      field_1249 = 17;
      field_1250 = 18;
      field_1251 = 19;
      field_1252 = 20;
      field_1253 = 21;
      field_1254 = 22;
      field_1255 = 24;
      field_1256 = 25;
      field_1265 = "IGP-CATEGORIES";
      field_1266 = "IGP-PROMOS";
      field_1267 = "IGP-FREEMIUM";
      field_1268 = "URL-TEMPLATE-GAME";
      field_1269 = "more_games_url";
      field_1270 = "more_games_status";
      field_1271 = null;
      field_1272 = null;
      field_1273 = "on";
      field_1274 = "XXXX";
      field_1275 = "&ctg=" + field_1274;
      field_1276 = "&ctg=";
      field_1277 = "&lg=";
      field_1278 = "SC";
      field_1279 = "ingameads.gameloft.com/redir";
      field_1280 = ";";
      field_1285 = false;
      field_1286 = new String[0];
      field_1296 = false;
      field_1299 = false;
      field_1300 = null;
      field_1301 = null;
      field_1302 = false;
      field_1303 = null;
      field_1304 = false;
      field_1314 = new int[2];
      field_1318 = 0;
      field_1319 = 0;
      field_1325 = "";
      field_1328 = false;
      field_1333 = 0;
      field_1334 = false;
      field_1335 = false;
      field_1336 = false;
      field_1337 = false;
      field_1338 = false;
      field_1339 = -1;
      field_1340 = -1;
      new Hashtable();
   }
}
