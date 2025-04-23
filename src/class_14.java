import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Random;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.wireless.messaging.MessageConnection;

// $FF: renamed from: o
public final class class_14 {

   // $FF: renamed from: a javax.microedition.midlet.MIDlet
   private static MIDlet field_1358;
   // $FF: renamed from: a int
   static int field_1359;
   // $FF: renamed from: a java.lang.String
   static String field_1360;
   // $FF: renamed from: b int
   static int field_1361;
   // $FF: renamed from: b java.lang.String
   private static String field_1362;
   // $FF: renamed from: c java.lang.String
   private static String field_1363;
   // $FF: renamed from: a d
   private static class_4 field_1364;
   // $FF: renamed from: c int
   private static int field_1365;
   // $FF: renamed from: c boolean
   private static boolean field_1366;
   // $FF: renamed from: a java.lang.String[][]
   private static String[][] field_1367;
   // $FF: renamed from: d boolean
   private static boolean field_1368;
   // $FF: renamed from: a java.util.Vector[]
   private static Vector[] field_1369;
   // $FF: renamed from: b java.lang.String[][]
   private static String[][] field_1370;
   // $FF: renamed from: c java.lang.String[][]
   private static String[][] field_1371;
   // $FF: renamed from: d int
   private static int field_1372;
   // $FF: renamed from: a java.util.Vector
   private static Vector field_1373;
   // $FF: renamed from: e int
   private static int field_1374;
   // $FF: renamed from: b java.lang.String[]
   private static String[] field_1375;
   // $FF: renamed from: f int
   private static int field_1376;
   // $FF: renamed from: d java.lang.String[][]
   private static String[][] field_1377;
   // $FF: renamed from: c java.lang.String[]
   private static String[] field_1378;
   // $FF: renamed from: d java.lang.String
   private static String field_1379;
   // $FF: renamed from: e java.lang.String
   private static String field_1380;
   // $FF: renamed from: f java.lang.String
   private static String field_1381;
   // $FF: renamed from: g java.lang.String
   private static String field_1382;
   // $FF: renamed from: h java.lang.String
   private static String field_1383;
   // $FF: renamed from: i java.lang.String
   private static String field_1384;
   // $FF: renamed from: j java.lang.String
   private static String field_1385;
   // $FF: renamed from: k java.lang.String
   private static String field_1386;
   // $FF: renamed from: l java.lang.String
   private static String field_1387;
   // $FF: renamed from: g int
   private static int field_1388;
   // $FF: renamed from: a long
   private static long field_1389;
   // $FF: renamed from: a java.lang.String[]
   public static String[] field_1390;
   // $FF: renamed from: e boolean
   private static boolean field_1391;
   // $FF: renamed from: f boolean
   private static boolean field_1392;
   // $FF: renamed from: g boolean
   private static boolean field_1393;
   // $FF: renamed from: h boolean
   private static boolean field_1394;
   // $FF: renamed from: i boolean
   private static boolean field_1395;
   // $FF: renamed from: m java.lang.String
   private static String field_1396;
   // $FF: renamed from: n java.lang.String
   private static String field_1397;
   // $FF: renamed from: o java.lang.String
   private static String field_1398;
   // $FF: renamed from: p java.lang.String
   private static String field_1399;
   // $FF: renamed from: q java.lang.String
   private static String field_1400;
   // $FF: renamed from: r java.lang.String
   private static String field_1401;
   // $FF: renamed from: s java.lang.String
   private static String field_1402;
   // $FF: renamed from: t java.lang.String
   private static String field_1403;
   // $FF: renamed from: u java.lang.String
   private static String field_1404;
   // $FF: renamed from: a java.util.Timer
   private static Timer field_1405;
   // $FF: renamed from: a javax.wireless.messaging.MessageConnection
   public static MessageConnection conn;
   // $FF: renamed from: a boolean
   public static boolean field_1407;
   // $FF: renamed from: b boolean
   public static boolean field_1408;
   // $FF: renamed from: h int
   private static int field_1409;
   // $FF: renamed from: i int
   private static int field_1410;
   // $FF: renamed from: v java.lang.String
   private static String field_1411;
   // $FF: renamed from: w java.lang.String
   private static String field_1412;
   // $FF: renamed from: x java.lang.String
   private static String field_1413;
   // $FF: renamed from: y java.lang.String
   private static String field_1414;
   // $FF: renamed from: z java.lang.String
   private static String field_1415;
   // $FF: renamed from: d java.lang.String[]
   private static String[] field_1416;
   // $FF: renamed from: b java.util.Vector
   private static Vector field_1417;
   // $FF: renamed from: c java.util.Vector
   private static Vector field_1418;
   // $FF: renamed from: d java.util.Vector
   private static Vector field_1419;
   // $FF: renamed from: e java.lang.String[]
   private static String[] field_1420;
   // $FF: renamed from: j boolean
   private static boolean field_1421;
   // $FF: renamed from: k boolean
   private static boolean field_1422;
   // $FF: renamed from: f java.lang.String[]
   private static String[] field_1423;
   // $FF: renamed from: g java.lang.String[]
   private static String[] field_1424;
   // $FF: renamed from: h java.lang.String[]
   private static String[] field_1425;
   // $FF: renamed from: a int[]
   private static int[] field_1426;
   // $FF: renamed from: b int[]
   private static int[] field_1427;
   // $FF: renamed from: j int
   private static int field_1428;
   // $FF: renamed from: a char
   private static char field_1429;

   // $FF: renamed from: a (java.lang.String, int, char) java.lang.String
   private static String method_1243(String var0, int var1, char var2) {
      int var7 = 0;
      int var3 = var1;

      int var4;
      for(var4 = var0.indexOf(124, 1); var1 > 0; --var1) {
         if(var7 == -1) {
            return null;
         }

         var7 = var4;
         var4 = var0.indexOf(124, var4 + 1);
      }

      if(var7 == -1) {
         return null;
      } else {
         if(var4 == -1) {
            var4 = var0.length();
         }

         if(var3 > 0) {
            ++var7;
         }

         if(var7 == var4) {
            return "";
         } else if(var7 > var4) {
            return null;
         } else {
            try {
               char[] var6 = new char[var4 - var7];
               var0.getChars(var7, var4, var6, 0);
               return new String(var6);
            } catch (IndexOutOfBoundsException var5) {
               return null;
            }
         }
      }
   }

   // $FF: renamed from: a (java.lang.String) void
   public static void method_1244(String var0) {
      field_1362 = var0;
      MIDlet var1 = class_1.field_11;
      field_1358 = class_1.field_11;
      field_1410 = 0;
      if(field_1373 == null) {
         field_1373 = new Vector();
      }

      if(field_1371 == null) {
         field_1371 = method_1275();
      }

      field_1377 = method_1283();
      field_1392 = method_1286();
      field_1394 = method_1287();
      if((field_1387 = method_1288()).equals("")) {
         field_1387 = method_1293();
         rmsSave(field_1390[1], field_1387);
      }

      field_1389 = method_1289();
      field_1366 = true;
      if(field_1363 != null) {
         field_1363 = field_1363 + "";
      }

      if(!method_1291() && method_1277() == 0 && field_1368 && method_1258()) {
         method_1257();
      }

      method_1269();
   }

   // $FF: renamed from: d () boolean
   private static boolean method_1245() {
      if(field_1364.field_920) {
         return false;
      } else if(field_1364.field_922) {
         return true;
      } else {
         if(field_1364.field_918 != null && field_1364.field_918 != "") {
            String var0 = method_1243(field_1364.field_918, 0, '|');

            try {
               if(var0.equals("FAILURE")) {
                  field_1365 = Integer.parseInt(method_1243(field_1364.field_918, 1, '|'));
                  return true;
               }
            } catch (NumberFormatException var2) {
               field_1365 = 40;
               if((var0 = method_1243(field_1364.field_918, 1, '|')).indexOf("PB") != -1) {
                  try {
                     field_1365 = Integer.parseInt(var0.substring(2, var0.length()));
                  } catch (NumberFormatException var1) {
                     ;
                  }
               }

               return true;
            }

            if(var0.equals("SUCCESS")) {
               field_1387 = method_1243(field_1364.field_918, 2, '|');
               field_1365 = 0;
               return true;
            }
         }

         field_1365 = 40;
         return true;
      }
   }

   // $FF: renamed from: a () boolean
   public static boolean method_1246() {
      field_1428 = 6;
      String var0;
      boolean var4;
      if((var0 = method_1284(field_1390[6])) != null && !var0.equals("1") && var0.equals("0")) {
         var4 = false;
         field_1410 = -10;
      } else {
         field_1358 = class_1.field_11;
         if((field_1396 = method_1276("IAP-OverrideFromJad")).equals("1")) {
            if((field_1402 = method_1276("IAP-BillingType").toUpperCase()).equals("HTTP")) {
               if((field_1401 = method_1276("IAP-BillingURL")).equals("")) {
                  field_1396 = "0";
               }
            } else if(!field_1402.equals("SMS")) {
               field_1396 = "0";
            }
         }

         method_1276("IAP-Version");
         boolean var10000;
         if((field_1383 = method_1276("IAP-GameCodeIGP")).length() == 0) {
            var10000 = false;
         } else {
            if((field_1384 = method_1276("IAP-PhoneModel")).length() == 0) {
               field_1384 = "5477";
            }

            if((field_1414 = method_1276("IAP-Test")).length() == 0) {
               field_1414 = "0";
            }

            if(method_1277() != 0) {
               if(method_1277() == 1) {
                  field_1415 = field_1411;
               } else if(method_1277() == 2) {
                  field_1415 = field_1412;
               } else {
                  field_1414 = "0";
                  field_1415 = "";
               }
            }

            (new StringBuffer()).append("PaySMS.parseJadFields:iapTestField: ").append(field_1414).append(" useTestProfile: ").append(field_1415);
            field_1379 = method_1276("IAP-DebugNumber");
            if((var0 = System.getProperty("wireless.messaging.sms.smsc")) != null && var0.length() > 0) {
               field_1381 = var0;
            }

            var0 = method_1276("IAP-DebugSMSCenter");
            field_1380 = method_1276("IAP-DebugMNC");
            if(!var0.equals("")) {
               field_1381 = var0;
            }

            if(!field_1380.equals("")) {
               field_1382 = field_1380;
            }

            field_1385 = method_1276("Download-Code");
            if(method_1276("IAP-EnableCreditCard").equals("1")) {
               field_1421 = true;
            }

            field_1417 = new Vector();
            field_1418 = new Vector();
            field_1419 = new Vector();

            int var5;
            for(var5 = 0; var5 < field_1416.length; ++var5) {
               for(int var1 = 1; var1 <= field_1428; ++var1) {
                  String var2;
                  if((var2 = method_1276("IAP-ContentID-" + field_1416[var5] + "-" + var1)) != null && !var2.equals("")) {
                     field_1417.addElement(var2);
                  }
               }
            }

            (new StringBuffer()).append("PaySMS.parseJadFields: ValidContentIDs: ").append(field_1417);

            for(var5 = 0; var5 < field_1417.size(); ++var5) {
               String var6 = (String)field_1417.elementAt(var5);
               boolean var8 = false;

               for(int var3 = var5 + 1; var3 < field_1417.size(); ++var3) {
                  if(field_1417.elementAt(var3).equals(var6)) {
                     var8 = true;
                     field_1417.removeElementAt(var3);
                     --var3;
                  }
               }

               if(var8) {
                  field_1417.removeElementAt(var5);
                  --var5;
               }
            }

            if(field_1417.size() == 0) {
               var10000 = false;
            } else {
               (new StringBuffer()).append("PaySMS.parseJadFields: ValidContentIDs: ").append(field_1417);
               if((var0 = method_1276("IAP-Profiles")).equals("")) {
                  var10000 = false;
               } else {
                  if(var0.length() > 0 && var0.charAt(var0.length() - 1) != 59) {
                     var0 = var0 + ";";
                  }

                  String[] var7;
                  if((var7 = method_1281(var0)) == null) {
                     var10000 = false;
                  } else if(!method_1278((String[])null, var7, method_1282(field_1403))) {
                     var10000 = field_1421;
                  } else {
                     field_1368 = true;
                     var10000 = true;
                  }
               }
            }
         }

         var4 = var10000;
         (new StringBuffer()).append("PaySMS.checkAvailable:parseJadFields: ").append(var4?"true":"false");
         if(var4 && method_1247()) {
            var4 = true;
         } else {
            var4 = false;
         }
      }

      return var4;
   }

   // $FF: renamed from: e () boolean
   private static boolean method_1247() {
      boolean var0;
      if(method_1277() != 0) {
         var0 = true;
      } else if(field_1421 && (field_1367 == null || field_1367.length == 0)) {
         var0 = true;
      } else if(field_1367.length == 1) {
         var0 = true;
      } else if(field_1367.length > 1) {
         String var1 = field_1367[0][2];
         String var2 = field_1367[0][3];
         var0 = true;

         for(int var3 = 1; var3 < field_1367.length; ++var3) {
            String var4 = field_1367[var3][2];
            String var5 = field_1367[var3][3];
            if(!var1.equals(var4) || !var2.equals(var5)) {
               var0 = false;
               break;
            }
         }
      } else {
         var0 = false;
      }

      (new StringBuffer()).append("PaySMS.checkAvailable:validProfiles: ").append(var0?"true":"false");
      return var0;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_1248() {
      field_1392 = method_1286();
      field_1394 = method_1287();
      return field_1392 || field_1394;
   }

   // $FF: renamed from: a (int, java.lang.String) void
   public static void method_1249(int var0, String var1) {
      (new StringBuffer()).append("PaySMS.sendRequest: start (PricePoint:").append(var0).append(") (Item Type: ").append(var1).append(")");
      field_1361 = var0;
      field_1359 = method_1271(var0, var1);
      field_1360 = var1;
      boolean var2 = false;
      String var3 = "";
      if(field_1396.equals("1")) {
         var3 = field_1402;
      } else {
         int var4;
         if(method_1277() != 0) {
            field_1367 = field_1370;
            if(method_1277() == 1) {
               var3 = "SMS";
            } else if(method_1277() == 2) {
               var3 = "HTTP";
            }

            for(var4 = 0; var4 < field_1367.length; ++var4) {
               if(field_1367[var4][0].equals(field_1415)) {
                  field_1388 = var4;
                  var2 = true;
                  break;
               }
            }
         } else {
            (new StringBuffer()).append("PaySMS.sendRequest: currentValidProfiles: ").append(field_1373 == null?"null":"Size: " + field_1373.size());
            if(field_1373 != null && field_1373.size() != 0) {
               field_1388 = 0;

               for(var4 = 0; var4 < field_1373.size(); ++var4) {
                  int var5 = ((Integer)field_1373.elementAt(var4)).intValue();

                  try {
                     if(Integer.parseInt(field_1367[var5][14]) == var0) {
                        field_1388 = var5;
                        var2 = true;
                        var3 = field_1367[field_1388][6];
                        break;
                     }
                  } catch (Exception var9) {
                     field_1388 = 0;
                  }
               }
            } else {
               field_1388 = -1;
            }
         }

         (new StringBuffer()).append("PaySMS.sendRequest: currentProfile: ").append(field_1388);
         if(var2 && field_1388 != -1) {
            (new StringBuffer()).append("PaySMS.sendRequest: Id: ").append(field_1367[field_1388][0]).append(" Billing: ").append(field_1367[field_1388][6]).append(" Region: ").append(field_1367[field_1388][2]).append(" Carrier: ").append(field_1367[field_1388][3]).append(" Pricepoint: ").append(field_1367[field_1388][14]);
         }
      }

      if(field_1366) {
         (new StringBuffer()).append("creditCardEnabled: ").append(field_1421);
         String var10;
         if(var2 && var3.equals("SMS")) {
            field_1391 = true;
            field_1392 = false;
            rmsSave(field_1390[0], "0");
            field_1386 = "";
            if(field_1396.equals("1")) {
               field_1399 = method_1276("IAP-Alias-PP" + field_1361);
            } else {
               field_1399 = "";
            }

            if(!field_1399.equals("")) {
               method_1260(field_1399);
            } else if(field_1388 != -1 && !field_1367[field_1388][10].equals("")) {
               method_1260(field_1367[field_1388][10]);
            }

            if(field_1367[field_1388][12].equals("7")) {
               method_1260("UNLOCK");
            } else {
               method_1260("INAPP");
            }

            method_1260("V009");
            method_1260(field_1383);
            method_1260(field_1387);
            method_1260(field_1384);
            if(field_1396.equals("1")) {
               field_1398 = method_1276("IAP-ProfileID-PP" + field_1361);
            } else {
               field_1398 = "";
            }

            if(!field_1398.equals("")) {
               method_1260(field_1398);
            } else {
               if(field_1388 == -1) {
                  field_1410 = 7;
                  return;
               }

               method_1260(field_1367[field_1388][0]);
            }

            if(!field_1362.equals("")) {
               method_1260(field_1362);
            } else {
               method_1260("EN");
            }

            if(field_1367[field_1388][12].equals("7")) {
               method_1260("7");
            } else {
               method_1260("1");
            }

            if(!(var10 = method_1276("IAP-ContentID-" + field_1360 + "-" + field_1361)).equals("")) {
               method_1260(var10);
               method_1260(field_1385);
               method_1260("ct" + field_1389);
               (new StringBuffer()).append("PaySMS.sendSMS: smsContent: ").append(field_1386);
               field_1393 = true;
               class_3 var14 = new class_3();
               var14.start();
            } else {
               (new StringBuffer()).append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(field_1360).append("-").append(field_1361).append(" missing in JAD");
               field_1410 = -2;
            }
         } else if(var2 && var3.equals("HTTP")) {
            class_4 var10000 = new class_4(false);
            field_1364 = var10000;
            if(field_1396.equals("1")) {
               var10 = field_1401;
               var1 = field_1398 = method_1276("IAP-ProfileID-PP" + field_1361);
            } else {
               if(field_1388 == -1) {
                  field_1410 = 7;
                  return;
               }

               var10 = field_1367[field_1388][11];
               var1 = field_1367[field_1388][0];
            }

            if(!var10.equals("") && !var1.equals("")) {
               (new StringBuffer()).append("PaySMS.sendHTTP: URL = ").append(var10);
               if(!var10.startsWith("http://")) {
                  var10 = "http://" + var10;
               }

               if(!var10.endsWith("?")) {
                  var10 = var10 + "?";
               }

               String var11;
               if((var11 = method_1276("IAP-ContentID-" + field_1360 + "-" + field_1361)).equals("")) {
                  (new StringBuffer()).append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(field_1360).append("-").append(field_1361).append(" missing in JAD");
                  field_1410 = -2;
               } else {
                  String var10001 = var11;
                  String var6 = field_1384;
                  String var12 = field_1385;
                  String var13 = field_1387;
                  var3 = field_1383;
                  var11 = var1;
                  var1 = var10001;
                  field_1364.reset();
                  String var7 = "%7C";
                  String var8 = var10;
                  var10 = "b=contentpurchase" + var7 + var3 + var7;
                  var10 = var10 + var1 + var7 + var11 + var7;
                  var10 = var10 + var13;
                  if(!var12.equals("")) {
                     var10 = var10 + "&d=" + var12;
                  }

                  var10 = var10 + "&phoneId=" + var6;
                  field_1365 = -100;
                  field_1364.method_906(var8, var10);
                  rmsSave(field_1390[1], field_1387);
                  rmsSave(field_1390[2], String.valueOf(field_1359));
                  rmsSave(field_1390[5], field_1360);
                  if(!field_1396.equals("1")) {
                     method_1292(field_1373);
                  }

                  field_1409 = 1;
               }
            } else {
               field_1410 = 4;
            }
         } else if(field_1421 && field_1388 == -1) {
            method_1259(var0, var1);
         } else if(field_1421) {
            method_1259(var0, var1);
         } else {
            field_1410 = -2;
         }
      }
   }

   // $FF: renamed from: a () void
   public static void method_1250() {
      field_1394 = true;
      rmsSave(field_1390[4], "1");
      int var0 = method_1253();
      String var1 = method_1290();
      method_1249(method_1270(var0, var1), var1);
   }

   // $FF: renamed from: a () int
   public static int method_1251() {
      if(field_1395) {
         field_1395 = false;
         return 7;
      } else if(!field_1366) {
         return 0;
      } else if(field_1392) {
         return 2;
      } else if(field_1393) {
         return 1;
      } else if(!field_1391 && !field_1394) {
         if(field_1409 == 1) {
            if(method_1245()) {
               field_1409 = 0;
               int var0;
               if((var0 = field_1364.field_920?-1:(field_1364.field_922?-2:field_1365)) == 0) {
                  if(method_1254(Integer.parseInt(field_1387))) {
                     field_1410 = 0;
                     method_1255();
                     return 7;
                  } else {
                     field_1410 = 1;
                     method_1255();
                     return 3;
                  }
               } else if(var0 == -2) {
                  field_1410 = -1;
                  method_1255();
                  return 3;
               } else {
                  field_1410 = var0;
                  method_1255();
                  return 3;
               }
            } else {
               return 1;
            }
         } else {
            if(!field_1396.equals("1") && method_1277() == 0) {
               if(field_1410 != 0) {
                  return 3;
               }

               if((field_1373 == null || field_1373.size() < 1) && (!field_1421 || field_1368)) {
                  if(field_1376 < 0) {
                     field_1410 = -3;
                     return 3;
                  }

                  if(field_1373.size() < 1) {
                     field_1410 = -3;
                     return 3;
                  }
               }
            }

            return 6;
         }
      } else if(field_1394) {
         field_1391 = false;
         field_1392 = true;
         rmsSave(field_1390[0], "1");
         return 8;
      } else {
         method_1255();
         return 3;
      }
   }

   // $FF: renamed from: b () int
   public static int method_1252() {
      return field_1410;
   }

   // $FF: renamed from: c () int
   public static int method_1253() {
      String var0;
      if((var0 = method_1284(field_1390[2])) != null && var0.length() != 0) {
         int var2;
         try {
            var2 = Integer.parseInt(var0);
         } catch (Exception var1) {
            var2 = -1;
         }

         return var2;
      } else {
         return -1;
      }
   }

   // $FF: renamed from: a (int) boolean
   public static boolean method_1254(int var0) {
      boolean var1 = false;
      String var2;
      if((field_1387 = method_1288()) != null && field_1387.length() > 0) {
         var2 = String.valueOf(var0);
         int var4 = Integer.parseInt(field_1387) ^ '\ud0a4';
         var1 = var2.equals(String.valueOf(var4));
      }

      (new StringBuffer()).append("PaySMS.verifyRequest: inputCode: ").append(var0).append(" ").append(var1?"Unlocked":"Still Locked");
      if(var1) {
         try {
            String var12 = method_1284(field_1390[7]);
            var2 = "0";
            if(var12 != null && !var12.equals("")) {
               var2 = var12.substring(0, var12.indexOf(95));
            }

            var0 = method_1253();
            String var3 = method_1290();
            var0 = method_1270(var0, var3);
            var3 = method_1265(0, var0);
            var12 = method_1265(9, var0);
            var2 = var2.replace(',', '.');
            String var14 = var12.replace(',', '.');
            long var5 = method_1300(var2);
            long var7 = method_1300(var14);
            char var13 = var2.indexOf(field_1429) == -1 && var14.indexOf(field_1429) == -1?32:field_1429;
            long var9 = var5 + var7;
            var2 = var13 == 32?var9 / 100000L + "":"" + var9 / 100000L + var13 + var9 % 100000L;
            (new StringBuffer()).append("totalMoneySpent : ").append(var2).append("  profileID: ").append(var3);
            rmsSave(field_1390[7], var2 + "_" + var3);
         } catch (Exception var11) {
            (new StringBuffer()).append("Exception : ").append(var11);
         }

         field_1410 = 0;
         if(!method_1266(method_1253()).equals("http_2d")) {
            field_1395 = true;
         }

         method_1255();
      }

      return var1;
   }

   // $FF: renamed from: c () void
   private static void method_1255() {
      field_1393 = false;
      field_1391 = false;
      field_1366 = false;
      rmsSave(field_1390[1], "");
      field_1392 = false;
      rmsSave(field_1390[0], "0");
      field_1394 = false;
      rmsSave(field_1390[4], "0");
      field_1422 = false;
   }

   // $FF: renamed from: b () void
   public static void method_1256() {
      field_1372 = -1;
      field_1376 = -1;
      field_1373 = null;
      field_1395 = false;
      rmsSave(field_1390[2], "");
      rmsSave(field_1390[5], "");
      rmsSave(field_1390[3], "");
      rmsSave(field_1390[8], "");
      rmsSave(field_1390[9], "");
      field_1382 = null;
      method_1255();
   }

   // $FF: renamed from: f () boolean
   private static boolean method_1257() {
      if(field_1373 == null) {
         field_1373 = new Vector();
      }

      if(field_1373.size() == 1) {
         field_1388 = ((Integer)field_1373.elementAt(0)).intValue();
         (new StringBuffer()).append("PaySMS.detectCarrier: Carrier selection skipped, detected profile: ").append(field_1388);
         return true;
      } else {
         field_1374 = -1;
         field_1388 = -1;
         field_1373.removeAllElements();
         String[][] var0;
         field_1375 = new String[(var0 = method_1261(field_1377[field_1376][0])).length];
         String[] var1 = new String[var0.length];

         int var2;
         for(var2 = 0; var2 < var0.length; ++var2) {
            field_1375[var2] = var0[var2][0];
            var1[var2] = var0[var2][1];
         }

         field_1375 = method_1296(field_1375);
         var1 = method_1296(var1);
         (new StringBuffer()).append("PaySMS.detectCarrier: currentIDS ").append(var1.length).append(", currentCarriers = ").append(field_1375.length);
         if(var1.length == 1) {
            field_1374 = 0;

            for(var2 = 0; var2 < field_1367.length; ++var2) {
               if(field_1367[var2][0].equals(var1[0])) {
                  field_1373.addElement(new Integer(var2));
               }
            }

            (new StringBuffer()).append("PaySMS.detectCarrier: Carrier selection skipped, only one profile. currentValidProfiles.size() ").append(field_1373.size());
            return true;
         } else {
            int var6;
            if(field_1375.length == 1) {
               field_1374 = 0;
               (new StringBuffer()).append("PaySMS.detectCarrier: Carrier selection skipped, only one carrier: ").append(field_1375[field_1374]);

               for(var2 = 0; var2 < field_1367.length; ++var2) {
                  if(field_1367[var2][2].indexOf(field_1377[field_1376][0]) != -1) {
                     for(var6 = 0; var6 < field_1369[var2].size(); ++var6) {
                        if(((String)field_1369[var2].elementAt(var6)).indexOf(field_1375[field_1374]) != -1) {
                           field_1373.addElement(new Integer(var2));
                        }
                     }
                  }
               }

               (new StringBuffer()).append("PaySMS.detectCarrier: currentValidProfiles.size =  ").append(field_1373.size());
               return true;
            } else {
               if(field_1375.length >= 1) {
                  String[][] var9 = new String[var1.length][2];
                  boolean var5 = true;

                  int var4;
                  for(int var3 = 0; var3 < var1.length; ++var3) {
                     (new StringBuffer()).append("PaySMS.detectCarrier: currentIDS[").append(var3).append("]= ").append(var1[var3]);

                     for(var4 = 0; var4 < field_1367.length; ++var4) {
                        if(field_1367[var4][0].equals(var1[var3])) {
                           var9[var3][0] = field_1367[var4][3];
                           var9[var3][1] = "" + var4;
                           (new StringBuffer()).append("PaySMS.detectCarrier: is Openmarket???? ").append(field_1367[var4][1]);
                           if(field_1367[var4][1].indexOf("Open Market") == -1) {
                              var5 = false;
                           }
                           break;
                        }
                     }
                  }

                  boolean var10 = true;

                  for(var4 = 1; var4 < var9.length; ++var4) {
                     if(!var9[var4][0].equals(var9[var4 - 1][0])) {
                        var10 = false;
                        (new StringBuffer()).append("PaySMS.detectCarrier: multiCarrierProfiles[i] ").append(var9[var4][0]);
                        (new StringBuffer()).append("PaySMS.detectCarrier: multiCarrierProfiles[i-1] ").append(var9[var4 - 1][0]);
                     }
                  }

                  (new StringBuffer()).append("PaySMS.detectCarrier: multiCarrierProfiles: ").append(var10).append(", isOpenMarket: ").append(var5);
                  if(var10) {
                     var4 = 0;

                     while(var4 < var1.length) {
                        var6 = 0;

                        while(true) {
                           if(var6 < field_1367.length) {
                              if(!field_1367[var6][0].equals(var1[var4])) {
                                 ++var6;
                                 continue;
                              }

                              field_1373.addElement(new Integer(var6));
                           }

                           ++var4;
                           break;
                        }
                     }

                     (new StringBuffer()).append("PaySMS.detectCarrier: Dont auto skip carrier selection(except OpenMarket). currentValidProfiles.size() ").append(field_1373.size());
                     (new StringBuffer()).append("PaySMS.detectCarrier: More than one carrier, but multicarrier profiles: ").append(var9[0][0]);
                     return true;
                  }

                  var4 = field_1375.length;

                  for(var6 = 0; var6 < var4; ++var6) {
                     field_1375[var6] = field_1375[var6].trim();
                  }

                  int[] var7 = new int[var4];

                  for(int var8 = 0; var8 < var4; ++var8) {
                     var7[var8] = var8;
                     (new StringBuffer()).append("PaySMS.detectCarrier: carrierNames[").append(var8).append("]: ").append(field_1375[var8]);
                  }
               }

               return false;
            }
         }
      }
   }

   // $FF: renamed from: g () boolean
   private static boolean method_1258() {
      if(field_1372 != -1) {
         field_1376 = field_1372;
         return true;
      } else {
         field_1376 = -1;
         field_1388 = -1;
         field_1373 = null;
         field_1378 = new String[field_1377.length];

         int var0;
         for(var0 = 0; var0 < field_1378.length; ++var0) {
            field_1378[var0] = field_1377[var0][0];
         }

         if(field_1378.length == 1 && (field_1381 == null || field_1372 == -1)) {
            field_1376 = 0;
            field_1372 = 0;
            (new StringBuffer()).append("PaySMS.detectRegion: Region selection skipped, only one region: ").append(field_1378[field_1376]);
            return true;
         } else if(field_1381 != null && field_1372 != -1) {
            field_1376 = field_1372;
            (new StringBuffer()).append("PaySMS.detectRegion: Region selection skipped, region auto-detected: ").append(field_1372);
            return true;
         } else {
            var0 = field_1378.length;

            for(int var1 = 0; var1 < var0 - 1; ++var1) {
               for(int var2 = var1 + 1; var2 < var0; ++var2) {
                  if(field_1378[var1].compareTo(field_1378[var2]) > 0) {
                     String var3 = field_1378[var1];
                     field_1378[var1] = field_1378[var2];
                     field_1378[var2] = var3;
                  }
               }
            }

            return false;
         }
      }
   }

   // $FF: renamed from: b (int, java.lang.String) void
   private static void method_1259(int var0, String var1) {
      (new StringBuffer()).append("PaySMS.sendRequest CREDIT CARD: Pricepoint:").append(var0).append(" Type:").append(var1);
      String var2 = field_1420[11];
      String var3;
      if((var3 = method_1276("IAP-ContentID-" + var1 + "-" + var0)).equals("")) {
         (new StringBuffer()).append("PaySMS.sendCCARD: Wrong Item. IAP-ContentID-").append(var1).append("-").append(var0).append(" missing in JAD");
         field_1410 = -2;
      } else {
         var1 = "";
         var1 = var1 + "?igpcode=" + field_1383;
         var1 = var1 + "&content_id=" + var3;
         var1 = var1 + "&tier=" + var0;
         var1 = var1 + "&code=" + field_1387;
         var1 = var1 + "&d=" + field_1385;
         String var4 = var2 + var1;
         (new StringBuffer()).append("PaySMS.sendRequest CREDIT CARD: ").append(var4);
         if(var4 != null) {
            class_1.method_8(var4);
         }

         rmsSave(field_1390[0], "1");
         rmsSave(field_1390[1], field_1387);
         rmsSave(field_1390[2], String.valueOf(field_1359));
         rmsSave(field_1390[5], field_1360);
      }
   }

   // $FF: renamed from: b (java.lang.String) void
   private static void method_1260(String var0) {
      if(var0 != null) {
         field_1386 = field_1386 + var0 + " ";
      }

   }

   // $FF: renamed from: a (java.lang.String) java.lang.String[][]
   private static String[][] method_1261(String var0) {
      Vector var2 = new Vector();

      for(int var3 = 0; var3 < field_1367.length; ++var3) {
         if(field_1367[var3][2].indexOf(var0) != -1) {
            for(int var4 = 0; var4 < field_1369[var3].size(); ++var4) {
               String var5 = (String)field_1369[var3].elementAt(var4);
               String var6 = field_1367[var3][0];
               if(var5 != null) {
                  int var1;
                  if((var1 = var5.indexOf(40)) == -1) {
                     var1 = var5.length();
                  }

                  (new StringBuffer()).append("PaySMS.getProfilesCarrierAndIds: regionName = ").append(var0).append(", carrierName = ").append(var5);
                  if((field_1382 == null || method_1295(var5, field_1382)) && !var2.contains(var5.substring(0, var1))) {
                     var2.addElement(new String[]{var5.substring(0, var1), var6});
                  }
               }
            }
         }
      }

      String[][] var7 = new String[var2.size()][2];
      var2.copyInto(var7);
      return var7;
   }

   // $FF: renamed from: a (int) java.lang.String
   public static String method_1262(int var0) {
      return method_1263(var0);
   }

   // $FF: renamed from: b (int) java.lang.String
   private static String method_1263(int var0) {
      (new StringBuffer()).append("PaySMS.getPrice: begin (").append(var0).append(")");
      if(field_1396.equals("1")) {
         return (field_1400 = method_1276("IAP-Price-PP" + var0)).equals("")?null:field_1400;
      } else {
         (new StringBuffer()).append("PaySMS.getPrice: currentValidProfiles: ").append(field_1373 == null?"NULL":"Size: " + field_1373.size());
         if(field_1373 == null) {
            return field_1421?" ":null;
         } else {
            int var1 = -1;
            int var2;
            if(method_1277() == 0) {
               for(var2 = 0; var2 < field_1373.size(); ++var2) {
                  int var3 = ((Integer)field_1373.elementAt(var2)).intValue();

                  try {
                     if(Integer.parseInt(field_1367[var3][14]) == var0) {
                        var1 = var3;
                        break;
                     }
                  } catch (Exception var4) {
                     ;
                  }
               }
            } else {
               for(var2 = 0; var2 < field_1370.length; ++var2) {
                  if(field_1370[var2][0].equals(field_1415)) {
                     return field_1370[var2][9];
                  }
               }
            }

            (new StringBuffer()).append("PaySMS.getPrice: profileIndex: ").append(var1);
            return var1 == -1?(field_1421?" ":null):field_1367[var1][4];
         }
      }
   }

   // $FF: renamed from: a (long, int) long
   public static long method_1264(long var0, int var2) {
      (new StringBuffer()).append("PaySMS.getVirtualCurrency: begin basecurrency ").append(var0).append(", pricepoint").append(var2);
      long var3 = 0L;
      long var5;
      int var7;
      int var10;
      if(method_1277() == 0 && field_1373 != null && field_1373.size() > 0) {
         for(var7 = 0; var7 < field_1373.size(); ++var7) {
            var10 = ((Integer)field_1373.elementAt(var7)).intValue();

            try {
               if(Integer.parseInt(field_1367[var10][14]) == var2) {
                  var3 = var0 * Long.parseLong(field_1367[var10][16]) / 10000000L;
                  var5 = var0 * Long.parseLong(field_1367[var10][16]) % 10000000L;
                  var3 += var5 / 5000000L;
                  break;
               }
            } catch (Exception var8) {
               ;
            }
         }
      } else {
         var3 = var0 * (long)field_1427[var2 - 1] * (long)field_1426[var2 - 1] / (long)(field_1427[0] * 100);
         var5 = var0 * (long)field_1427[var2 - 1] * (long)field_1426[var2 - 1] % (long)(field_1427[0] * 100);
         var3 += var5 / (long)(field_1427[0] * 100 >> 1);
      }

      var7 = ("" + var3).length();
      var10 = 1;
      if(var7 == 2) {
         var10 = 2;
      } else if(var7 > 2) {
         var10 = 5;

         for(int var9 = 0; var9 < var7 - 3; ++var9) {
            var10 *= 10;
         }
      }

      (new StringBuffer()).append("currency:\t").append(var3).append("\tRound Up:\t").append(var10);
      if(var3 % (long)var10 != 0L) {
         var3 = (var3 / (long)var10 + 1L) * (long)var10;
      }

      (new StringBuffer()).append("Rounded currency:\t").append(var3);
      return var3;
   }

   // $FF: renamed from: a (int, int) java.lang.String
   private static String method_1265(int var0, int var1) {
      int var2;
      if(method_1277() == 0) {
         for(var2 = 0; var2 < field_1373.size(); ++var2) {
            int var3 = ((Integer)field_1373.elementAt(var2)).intValue();
            if(field_1367[var3][14].equals(String.valueOf(var1))) {
               return field_1367[var3][var0];
            }
         }
      } else {
         for(var2 = 0; var2 < field_1370.length; ++var2) {
            if(field_1370[var2][0].equals(field_1415)) {
               return field_1370[var2][var0];
            }
         }
      }

      return "";
   }

   // $FF: renamed from: c (int) java.lang.String
   private static String method_1266(int var0) {
      if(method_1277() != 0) {
         if(method_1277() == 1) {
            return "sms_2d";
         }

         if(method_1277() == 2) {
            return "http_2d";
         }

         if(method_1277() == 3) {
            return "cc_2d";
         }
      }

      (new StringBuffer()).append("PaySMS.GetBillingType: currentValidProfiles: ").append(field_1373 == null?"NULL":"Size: " + field_1373.size());
      if(field_1373 == null) {
         return "cc_2d";
      } else {
         int var1 = 0;
         boolean var2 = false;

         for(int var3 = 0; var3 < field_1373.size(); ++var3) {
            int var4 = ((Integer)field_1373.elementAt(var3)).intValue();

            try {
               if(Integer.parseInt(field_1367[var4][14]) == var0) {
                  var1 = var4;
                  var2 = true;
                  break;
               }
            } catch (Exception var5) {
               ;
            }
         }

         return !var2?"cc_2d":(field_1367[var1][6].equals("SMS")?"sms_2d":(field_1367[var1][6].equals("HTTP")?"http_2d":null));
      }
   }

   // $FF: renamed from: a () java.lang.String
   public static String method_1267() {
      (new StringBuffer()).append("PaySMS.GetTermsAndConditions: currentValidProfiles: ").append(field_1373 == null?"NULL":"Size: " + field_1373.size());
      if(field_1373 == null) {
         return null;
      } else {
         String var0 = null;
         String var1 = null;
         int var2;
         if(method_1277() == 0) {
            if(field_1373.size() > 0) {
               var2 = ((Integer)field_1373.elementAt(0)).intValue();

               try {
                  var0 = field_1367[var2][13];
                  var1 = field_1367[var2][15];
               } catch (Exception var3) {
                  ;
               }
            }
         } else if(field_1370.length > 0) {
            for(var2 = 0; var2 < field_1370.length; ++var2) {
               if(field_1370[var2][0].equals(field_1415)) {
                  var0 = field_1370[var2][13];
                  break;
               }
            }
         }

         (new StringBuffer()).append("PaySMS.GetTermsAndConditions: tncID = \'").append(var0).append("\'");
         String var4 = method_1273(var0);
         (new StringBuffer()).append("PaySMS.GetTermsAndConditions: tnc = \'").append(var4).append("\'");
         (new StringBuffer()).append("PaySMS.GetTermsAndConditions: supportNumber = \'").append(var1).append("\'");
         var4 = method_1274(var4, var1);
         (new StringBuffer()).append("PaySMS.GetTermsAndConditions: tnc without phone number = \'").append(var4).append("\'");
         return var4;
      }
   }

   // $FF: renamed from: a (java.lang.String) int
   public static int method_1268(String var0) {
      return var0.equals("Cash")?field_1418.size():(var0.equals("Coin")?field_1419.size():-1);
   }

   // $FF: renamed from: d () void
   private static void method_1269() {
      field_1418.removeAllElements();
      field_1419.removeAllElements();
      int var0;
      int var1;
      int var2;
      if(method_1277() == 0 && field_1373 != null && field_1373.size() > 0) {
         for(var0 = 0; var0 < field_1373.size(); ++var0) {
            var1 = ((Integer)field_1373.elementAt(var0)).intValue();
            if(method_1272(var2 = Integer.parseInt(field_1367[var1][14]), "Cash")) {
               field_1418.addElement(new Integer(var2));
            }

            if(method_1272(var2, "Coin")) {
               field_1419.addElement(new Integer(var2));
            }
         }
      } else if(field_1421 || method_1277() != 0) {
         (new StringBuffer()).append("PaySMS.parseValidItems: IAP_TEST_FIELD or CC. creditCardEnabled = ").append(field_1421);

         for(var0 = 1; var0 <= field_1428; ++var0) {
            if(method_1272(var0, "Cash")) {
               field_1418.addElement(new Integer(var0));
            }

            if(method_1272(var0, "Coin")) {
               field_1419.addElement(new Integer(var0));
            }
         }
      }

      int var3;
      for(var0 = 0; var0 < field_1418.size() - 1; ++var0) {
         for(var1 = var0 + 1; var1 < field_1418.size(); ++var1) {
            var2 = ((Integer)field_1418.elementAt(var0)).intValue();
            var3 = ((Integer)field_1418.elementAt(var1)).intValue();
            if(var2 > var3) {
               field_1418.setElementAt(new Integer(var3), var0);
               field_1418.setElementAt(new Integer(var2), var1);
            }
         }
      }

      for(var0 = 0; var0 < field_1419.size() - 1; ++var0) {
         for(var1 = var0 + 1; var1 < field_1419.size(); ++var1) {
            var2 = ((Integer)field_1419.elementAt(var0)).intValue();
            var3 = ((Integer)field_1419.elementAt(var1)).intValue();
            if(var2 > var3) {
               field_1419.setElementAt(new Integer(var3), var0);
               field_1419.setElementAt(new Integer(var2), var1);
            }
         }
      }

      (new StringBuffer()).append("PaySMS.parseValidItems: number of cash: ").append(field_1418.size());
      (new StringBuffer()).append("PaySMS.parseValidItems: number of coin: ").append(field_1419.size());
   }

   // $FF: renamed from: a (int, java.lang.String) int
   public static int method_1270(int var0, String var1) {
      (new StringBuffer()).append("PaySMS.getPricePoint: itemIndex").append(var0).append(", itemType ").append(var1);
      return var1.equals("Cash") && var0 <= field_1418.size()?((Integer)field_1418.elementAt(var0)).intValue():(var1.equals("Coin") && var0 <= field_1419.size()?((Integer)field_1419.elementAt(var0)).intValue():-1);
   }

   // $FF: renamed from: b (int, java.lang.String) int
   private static int method_1271(int var0, String var1) {
      int var2 = -1;
      int var3;
      if(var1.equals("Cash")) {
         for(var3 = 0; var3 < field_1418.size(); ++var3) {
            if(((Integer)field_1418.elementAt(var3)).intValue() == var0) {
               var2 = var3;
               break;
            }
         }
      } else if(var1.equals("Coin")) {
         for(var3 = 0; var3 < field_1419.size(); ++var3) {
            if(((Integer)field_1419.elementAt(var3)).intValue() == var0) {
               var2 = var3;
               break;
            }
         }
      }

      return var2;
   }

   // $FF: renamed from: a (int, java.lang.String) boolean
   private static boolean method_1272(int var0, String var1) {
      String var2 = method_1276("IAP-ContentID-" + var1 + "-" + var0);
      boolean var3 = false;
      if(field_1417.contains(var2)) {
         var3 = true;
      }

      (new StringBuffer()).append("PaySMS.isValidContentID: IAP-ContentID-").append(var1).append("-").append(var0).append(": ").append(var2).append(var3?" - Valid":" - Invalid");
      return var3;
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   private static String method_1273(String var0) {
      (new StringBuffer()).append("PaySMS.retrieveTermsAndConditions: id = \'").append(var0).append("\'");
      if(var0 != null && var0.length() != 0) {
         for(int var1 = 0; var1 < field_1371.length; ++var1) {
            (new StringBuffer()).append("PaySMS.retrieveTermsAndConditions: profilesTexts[").append(var1).append("][TEXT_PROFILE_ID] = \'").append(field_1371[var1][0]).append("\'");
            if(method_1302(field_1371[var1][0], var0)) {
               return field_1371[var1][1];
            }
         }

         return "";
      } else {
         return "";
      }
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) java.lang.String
   private static String method_1274(String var0, String var1) {
      if(var0 != null && !var0.equals("")) {
         try {
            int var2 = var0.indexOf("<phone>");
            int var3 = var0.indexOf("</phone>", var2 + "<phone>".length());
            String var4 = var0.substring(0, var2);
            String var8 = var0.substring(var2 + "<phone>".length(), var3);
            String var9 = var0.substring(var3 + "</phone>".length(), var0.length());
            if(var1 != null && !var1.equals("")) {
               int var5 = var8.indexOf("<support_number>");
               int var6 = "<support_number>".length();
               var8 = var8.substring(0, var5) + var1 + var8.substring(var5 + var6, var8.length());
               var8 = var4 + var8 + var9;
            } else {
               var8 = var4 + var9;
            }

            return var8;
         } catch (Exception var7) {
            return var0;
         }
      } else {
         return null;
      }
   }

   // $FF: renamed from: b () java.lang.String[][]
   private static String[][] method_1275() {
      String[] var0;
      if((var0 = method_1282(field_1404)) == null) {
         return null;
      } else {
         String[][] var1 = new String[var0.length][2];

         int var2;
         for(var2 = 0; var2 < var0.length; ++var2) {
            int var3;
            if((var3 = var0[var2].indexOf(59)) != -1) {
               var1[var2][0] = var0[var2].substring(0, var3);
               var1[var2][1] = var0[var2].substring(var3 + 1, var0[var2].length());
            }
         }

         for(var2 = 0; var2 < var1.length; ++var2) {
            (new StringBuffer()).append("PaySMS.loadSpecificTextsFile: ID: ").append(var1[var2][0]).append(" TEXT: ").append(var1[var2][1]);
         }

         return var1;
      }
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   private static String method_1276(String var0) {
      if((var0 = field_1358.getAppProperty(var0)) == null) {
         var0 = "";
      }

      return var0;
   }

   // $FF: renamed from: f () int
   private static int method_1277() {
      return field_1414.equals("0")?0:(field_1414.equals("1")?1:(field_1414.equals("2")?2:0));
   }

   // $FF: renamed from: a (java.lang.String[], java.lang.String[], java.lang.String[]) boolean
   private static boolean method_1278(String[] var0, String[] var1, String[] var2) {
      if(var2 == null) {
         field_1410 = 8;
         return false;
      } else {
         for(int var12 = 0; var12 < var2.length; ++var12) {
            (new StringBuffer()).append("PaySMS.loadProfileConfiguration: profilesArgs[").append(var12).append("]: ").append(var2[var12]);
         }

         var0 = var1;
         int var3 = 0;
         int[] var4 = new int[var2.length];
         String[][] var5 = new String[var2.length][17];
         int var6 = 0;
         int[] var7 = new int[var2.length];

         int var8;
         int var13;
         for(var8 = 0; var8 < var2.length; ++var8) {
            var13 = 0;

            int var9;
            String var14;
            for(var9 = 0; var9 < 16; ++var9) {
               int var10 = var2[var8].indexOf(";", var13);
               var14 = var2[var8].substring(var13, var10);
               var5[var8][var9] = var14;
               var13 = var10 + 1;
            }

            if(method_1280(var5[var8][0])) {
               var7[var6++] = var8;
            }

            if(var5[var8][6].equals("CC")) {
               field_1420 = var5[var8];
            }

            for(var9 = 0; var9 < var0.length; ++var9) {
               if((var14 = var0[var9]) != null && var14.length() != 0 && var5[var8][0].equals(var14)) {
                  if(!method_1280(var5[var8][0]) && !var5[var8][6].equals("CC")) {
                     var4[var3++] = var8;
                     var0[var9] = null;
                  }
                  break;
               }
            }
         }

         if(var6 != 0) {
            field_1370 = new String[var6][];

            for(var8 = 0; var8 < field_1370.length; ++var8) {
               field_1370[var8] = var5[var7[var8]];
            }
         }

         if(var3 == 0) {
            return false;
         } else {
            field_1367 = new String[var3][];

            for(var8 = 0; var8 < field_1367.length; ++var8) {
               field_1367[var8] = var5[var4[var8]];
            }

            try {
               for(var8 = 0; var8 < var3; ++var8) {
                  String var15 = field_1367[var8][9];
                  String var16 = field_1367[var8][7];
                  var13 = Integer.parseInt(field_1367[var8][14]);
                  if(var16 != null) {
                     field_1367[var8][16] = "" + method_1300(var15) * (long)(100 + Integer.parseInt(field_1367[var8][5])) * 100000L / method_1300(var16);
                     (new StringBuffer()).append("bonus    ").append(100 + Integer.parseInt(field_1367[var8][5])).append(", tier ").append(var13);
                  }

                  (new StringBuffer()).append("profile Id :\t").append(field_1367[var8][0]).append("\tTier:\t").append(var13).append("\tRatios :\t").append(field_1367[var8][16]);
               }
            } catch (Exception var11) {
               ;
            }

            method_1279();
            return true;
         }
      }
   }

   // $FF: renamed from: e () void
   private static void method_1279() {
      int var0 = field_1367.length;
      if(field_1420 != null) {
         ++var0;
      }

      field_1369 = new Vector[var0];

      int var2;
      for(var0 = 0; var0 < field_1367.length; ++var0) {
         field_1369[var0] = new Vector();
         String var1 = field_1367[var0][3];
         (new StringBuffer()).append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(field_1367[var0][0]);
         var2 = 0;
         int var3;
         if((var3 = var1.indexOf("\u00ac", 0)) == -1) {
            field_1369[var0].addElement(var1);
            (new StringBuffer()).append("PaySMS.parseMultipleCarriers: \t\t").append(var1);
         } else {
            while(var3 != -1) {
               field_1369[var0].addElement(var1.substring(var2, var3));
               (new StringBuffer()).append("PaySMS.parseMultipleCarriers: \t\t").append(var1.substring(var2, var3));
               var2 = var3 + 1;
               var3 = var1.indexOf("\u00ac", var2);
            }

            field_1369[var0].addElement(var1.substring(var2, var1.length()));
            (new StringBuffer()).append("PaySMS.parseMultipleCarriers: \t\t").append(var1.substring(var2, var1.length()));
         }

         (new StringBuffer()).append("\tSize: ").append(field_1369[var0].size());
      }

      if(field_1420 != null) {
         field_1369[field_1367.length] = new Vector();
         String var5 = field_1420[3];
         (new StringBuffer()).append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(field_1420[0]);
         int var4 = 0;
         if((var2 = var5.indexOf("\u00ac", 0)) == -1) {
            field_1369[field_1367.length].addElement(var5);
            (new StringBuffer()).append("PaySMS.parseMultipleCarriers: \t\t").append(var5);
         } else {
            while(var2 != -1) {
               field_1369[field_1367.length].addElement(var5.substring(var4, var2));
               (new StringBuffer()).append("PaySMS.parseMultipleCarriers: \t\t").append(var5.substring(var4, var2));
               var4 = var2 + 1;
               var2 = var5.indexOf("\u00ac", var4);
            }

            field_1369[field_1367.length].addElement(var5.substring(var4, var5.length()));
            (new StringBuffer()).append("PaySMS.parseMultipleCarriers: \t\t").append(var5.substring(var4, var5.length()));
         }

         (new StringBuffer()).append("\tSize: ").append(field_1369[field_1367.length].size());
      }

   }

   // $FF: renamed from: a (java.lang.String) boolean
   private static boolean method_1280(String var0) {
      return var0.equals(field_1411) || var0.equals(field_1412) || var0.equals(field_1413);
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String[]
   private static String[] method_1281(String var0) {
      if(var0 == null) {
         return null;
      } else {
         Vector var1 = new Vector();
         int var2 = 0;

         while(var2 < var0.length()) {
            int var3;
            if((var3 = var0.indexOf(59, var2)) != -1) {
               var1.addElement(var0.substring(var2, var3));
               var2 = var3 + 1;
            } else {
               var2 = var0.length();
            }
         }

         String[] var4 = new String[var1.size()];
         var1.copyInto(var4);
         return var4;
      }
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String[]
   private static String[] method_1282(String var0) {
      InputStream var1 = "".getClass().getResourceAsStream(var0);
      ByteArrayOutputStream var2 = null;

      int var4;
      String var8;
      try {
         var2 = new ByteArrayOutputStream(2048);
         byte[] var3 = new byte[256];

         while(true) {
            if((var4 = var1.read(var3)) == -1) {
               var1.close();
               var3 = var2.toByteArray();
               var2.close();
               var8 = new String(var3, 0, var3.length, "UTF-8");
               break;
            }

            var2.write(var3, 0, var4);
         }
      } catch (Exception var5) {
         (new StringBuffer()).append("PaySMS.readFile: ").append(var0).append(" Exception: ").append(var5.toString());
         return null;
      }

      int var9 = 0;
      Vector var6 = new Vector();

      do {
         if((var4 = var8.indexOf(10, var9)) != -1) {
            var6.addElement(var8.substring(var9, var4));
            var9 = var4 + 1;
         }
      } while(var4 != -1);

      String[] var7 = new String[var6.size()];
      var6.copyInto(var7);
      return var7;
   }

   // $FF: renamed from: c () java.lang.String[][]
   private static String[][] method_1283() {
      if(field_1368 && method_1277() == 0) {
         Vector var0 = new Vector();

         int var4;
         for(int var1 = 0; var1 < field_1367.length; ++var1) {
            String var2 = field_1367[var1][2];
            boolean var3 = false;

            for(var4 = 0; !var3 && var4 < var0.size(); ++var4) {
               if(method_1302(var2, (String)var0.elementAt(var4))) {
                  var3 = true;
               }
            }

            if(!var3) {
               var2 = field_1367[var1][2];
               var0.addElement(var2);
            }
         }

         if(field_1420 != null && field_1421 && var0.size() > 1) {
            var0.addElement("Other");
         }

         String[] var9 = new String[var0.size()];
         var0.copyInto(var9);
         var0.removeAllElements();
         var0 = new Vector();
         String[][] var10 = new String[var9.length][2];
         int var11 = 0;
         var4 = 0;

         for(int var5 = 0; var5 < var9.length; ++var5) {
            String var6;
            int var7;
            if((var7 = (var6 = var9[var5]).indexOf(40)) != -1) {
               var10[var5][0] = var6.substring(0, var7);
               ++var7;
               int var8 = var6.indexOf(58, var7);
               method_1284(field_1390[8]);
               if(var8 != -1) {
                  var10[var5][1] = var6.substring(var7, var8);
                  if(field_1381 != null && field_1381.startsWith(var10[var5][1], 1) && var11 <= var8 - var7) {
                     var11 = var8 - var7;
                     field_1372 = var5;
                     (new StringBuffer()).append("currentAutoDetectedRegion ").append(field_1372);
                     String[] var12;
                     (var12 = new String[2])[0] = var10[var5][0];
                     var12[1] = var10[var5][1];
                     var0.addElement(var12);
                     ++var4;
                  }
               }
            } else {
               var10[var5][0] = var6;
               var10[var5][1] = "";
            }

            (new StringBuffer()).append("PaySMS.getProfilesRegions:          regionsConfig[").append(var5).append("][REGION_NAME]: ").append(var10[var5][0]);
            (new StringBuffer()).append("PaySMS.getProfilesRegions:          regionsConfig[").append(var5).append("][REGION_CODE]: ").append(var10[var5][1]);
         }

         if(var4 > 1) {
            field_1372 = -1;
            var10 = new String[var0.size()][2];
            var0.copyInto(var10);
         }

         (new StringBuffer()).append("PaySMS.getProfilesRegions: Auto-detected: ").append(field_1372 == -1?"NONE":var10[field_1372][0]);
         return var10;
      } else {
         return null;
      }
   }

   // $FF: renamed from: e (java.lang.String) java.lang.String
   private static String method_1284(String var0) {
      RecordStore var1 = null;
      String var2 = null;

      try {
         byte[] var3;
         if((var1 = RecordStore.openRecordStore(var0, true)).getNumRecords() >= 1 && (var3 = var1.getRecord(1)) != null) {
            var2 = new String(var3);
         }
      } catch (Exception var5) {
         (new StringBuffer()).append("PaySMS.rmsLoad: Exception: ").append(var0).append(" ").append(var5.toString());
      }

      try {
         var1.closeRecordStore();
      } catch (Exception var4) {
         (new StringBuffer()).append("PaySMS.rmsLoad: Exception: ").append(var0).append(" ").append(var4.toString());
      }

      return var2;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public static void rmsSave(String var0, String var1) {
      RecordStore record = null;

      try {
         record = RecordStore.openRecordStore(var0, true);
         byte[] var5 = var1.getBytes();
         if(record.getNumRecords() >= 1) {
            record.setRecord(1, var5, 0, var5.length);
         } else {
            record.addRecord(var5, 0, var5.length);
         }
      } catch (Exception var3) {
         (new StringBuffer()).append("PaySMS.rmsSave: Exception: ").append(var3.toString());
      }

      if(record != null) {
         try {
            record.closeRecordStore();
            return;
         } catch (Exception var4) {
            (new StringBuffer()).append("PaySMS.rmsSave: Exception: ").append(var4.toString());
         }
      }

   }

   // $FF: renamed from: h () boolean
   private static boolean method_1286() {
      String var0;
      return (var0 = method_1284(field_1390[0])) != null && var0.equals("1");
   }

   // $FF: renamed from: i () boolean
   private static boolean method_1287() {
      String var0;
      return (var0 = method_1284(field_1390[4])) != null && var0.equals("1");
   }

   // $FF: renamed from: i () java.lang.String
   private static String method_1288() {
      String var0;
      return (var0 = method_1284(field_1390[1])) != null?var0:"";
   }

   // $FF: renamed from: c () long
   private static long method_1289() {
      try {
         String var0;
         if((var0 = method_1284(field_1390[11])) != null) {
            return Long.parseLong(var0);
         }
      } catch (Exception var1) {
         ;
      }

      return 1L;
   }

   // $FF: renamed from: b () java.lang.String
   public static String method_1290() {
      String var0;
      return (var0 = method_1284(field_1390[5])) != null?var0:"";
   }

   // $FF: renamed from: j () boolean
   private static boolean method_1291() {
      String var0;
      if((var0 = method_1284(field_1390[3])) != null && var0.length() != 0) {
         Vector var1 = new Vector();
         int var2 = 0;

         for(int var3 = var0.indexOf(";"); var3 != -1; var3 = var0.indexOf(";", var2)) {
            String var4 = var0.substring(var2, var3);
            var1.addElement(new Integer(Integer.parseInt(var4)));
            var2 = var3 + 1;
         }

         field_1373 = var1;
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: b (java.util.Vector) void
   private static void method_1292(Vector var0) {
      String var1 = "";

      for(int var2 = 0; var2 < var0.size(); ++var2) {
         var1 = var1 + var0.elementAt(var2) + ";";
      }

      (new StringBuffer()).append("PaySMS.storeProfileID: ").append(var1);
      rmsSave(field_1390[3], String.valueOf(var1));
   }

   // $FF: renamed from: j () java.lang.String
   private static String method_1293() {
      int var0 = Math.abs((new Random()).nextInt() % 9999);

      while(var0 < 1000) {
         if(var0 < 1000) {
            var0 += 1000;
         }
      }

      return String.valueOf(var0);
   }

   // $FF: renamed from: b (java.lang.String) boolean
   private static boolean method_1294(String var0) {
      return var0 == null || var0.length() == 0 || var0.equals("null");
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) boolean
   private static boolean method_1295(String var0, String var1) {
      if(!method_1294(var0) && !method_1294(var1)) {
         int var2 = var1.length();

         for(int var3 = 0; var3 <= var0.length() - var2; ++var3) {
            if(method_1302(var0.substring(var3, var3 + var2), var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (java.lang.String[]) java.lang.String[]
   private static String[] method_1296(String[] var0) {
      Vector var1 = new Vector();
      int var2 = 0;

      while(var2 < var0.length) {
         boolean var3 = false;
         int var4 = 0;

         while(true) {
            if(var4 < var2) {
               if(!var0[var2].equals(var0[var4])) {
                  ++var4;
                  continue;
               }

               var3 = true;
            }

            if(!var3) {
               var1.addElement(var0[var2]);
            }

            ++var2;
            break;
         }
      }

      String[] var5 = new String[var1.size()];
      var1.copyInto(var5);
      return var5;
   }

   // $FF: renamed from: d () int
   public static int method_1297() {
      if(field_1373 != null && field_1373.size() > 0) {
         if(method_1277() != 0) {
            return 8;
         } else {
            try {
               int var0 = ((Integer)field_1373.elementAt(0)).intValue();
               String var1 = field_1367[var0][0];
               (new StringBuffer()).append("profileID : ").append(var1);

               int var2;
               for(var2 = 0; var2 < field_1423.length; ++var2) {
                  if(var1 != null && var1.equals(field_1423[var2])) {
                     (new StringBuffer()).append("PaySMS. Found valid the Turkey profile: ").append(field_1367[var0][0]);
                     return 3;
                  }
               }

               for(var2 = 0; var2 < field_1424.length; ++var2) {
                  if(var1 != null && var1.equals(field_1424[var2])) {
                     (new StringBuffer()).append("PaySMS. Found valid the FR Open Market profile: ").append(field_1367[var0][0]);
                     return 6;
                  }
               }

               for(var2 = 0; var2 < field_1425.length; ++var2) {
                  if(var1 != null && var1.equals(field_1425[var2])) {
                     (new StringBuffer()).append("PaySMS. Found valid the Indonesia Telkomsel profile: ").append(field_1367[var0][0]);
                     return 11;
                  }
               }

               String var4;
               if((var4 = field_1367[var0][2]) == null) {
                  return 8;
               }

               var4 = var4.substring(var4.indexOf(40) + 1, var4.lastIndexOf(58)).trim();
               (new StringBuffer()).append("PaySMS. Country code ").append(var4);
               if(field_1367[var0][6].equals("SMS")) {
                  if(var4.equals("49:DE")) {
                     return 2;
                  }

                  if(var4.equals("45:DK")) {
                     return 4;
                  }

                  if(var4.equals("43:AT")) {
                     return 5;
                  }

                  if(var4.equals("91:IN")) {
                     return 7;
                  }

                  if(var4.equals("34:ES")) {
                     return 0;
                  }

                  if(var4.equals("44:GB")) {
                     return 10;
                  }

                  if(var4.equals("58:VE")) {
                     return 12;
                  }
               }

               if(var4.equals("34:ES") && field_1367[var0][6].equals("HTTP")) {
                  return 9;
               }
            } catch (Exception var3) {
               (new StringBuffer()).append("PaySMS. GetSpecialFlow,  Exception: ").append(var3);
            }

            return 8;
         }
      } else {
         return 0;
      }
   }

   // $FF: renamed from: a (int) int
   public static int method_1298(int var0) {
      if(method_1297() == 6) {
         if(field_1373 == null) {
            return 0;
         }

         for(int var1 = 0; var1 < field_1373.size(); ++var1) {
            int var2 = ((Integer)field_1373.elementAt(var1)).intValue();

            try {
               if(Integer.parseInt(field_1367[var2][14]) == var0) {
                  long var3 = method_1300(field_1367[var2][9]);
                  (new StringBuffer()).append("Fixed price : ").append(field_1367[var2][9]);
                  if(var3 > 500000L) {
                     (new StringBuffer()).append("Found Price greater than 5 Euros : ").append(field_1367[var2][9]);
                     return 1;
                  }
                  break;
               }
            } catch (Exception var5) {
               ;
            }
         }
      }

      return 0;
   }

   // $FF: renamed from: c () java.lang.String
   public static String method_1299() {
      try {
         String var0;
         if((var0 = class_1.field_11.getAppProperty("URL-SUPPORT")) == null) {
            return null;
         } else {
            String var1;
            if((var1 = method_1284(field_1390[7])) != null && !var1.equals("")) {
               String var2 = var1.substring(0, var1.indexOf(95));
               var1 = var1.substring(var1.indexOf(95) + 1);
               byte[] var4 = class_1.method_69(var2.getBytes(), "a8bc1a23a89", true);
               return var0 + "&extra_1=" + class_1.method_67(var4) + "&extra_2=" + var1;
            } else {
               return var0;
            }
         }
      } catch (Exception var3) {
         return null;
      }
   }

   // $FF: renamed from: a (java.lang.String) long
   private static long method_1300(String var0) {
      int var1;
      if((var1 = (var0 = var0.replace(',', '.')).indexOf(field_1429)) == -1) {
         return (long)method_1301(var0) * 100000L;
      } else {
         long var2 = (long)method_1301(var0.substring(0, var1)) * 100000L;

         for(var0 = var0.substring(var1 + 1); var0.length() < "100000".length() - 1; var0 = var0 + "0") {
            ;
         }

         return var2 + (long)method_1301(var0);
      }
   }

   // $FF: renamed from: b (java.lang.String) int
   private static int method_1301(String var0) {
      try {
         return Integer.parseInt(var0);
      } catch (Exception var1) {
         return -1;
      }
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) boolean
   private static boolean method_1302(String var0, String var1) {
      if(var0 != null && var1 != null) {
         return var0.toUpperCase().equals(var1.toUpperCase());
      } else {
         (new StringBuffer()).append("PaySMS.equalsIgnoreCase: s1 = \'").append(var0).append("\', s2 = \'").append(var1).append("\'");
         return false;
      }
   }

   // $FF: renamed from: d () java.lang.String
   static String method_1303() {
      return field_1379;
   }

   // $FF: renamed from: e () java.lang.String
   static String method_1304() {
      return field_1396;
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   static String method_1305(String var0) {
      field_1397 = var0;
      return var0;
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   static String method_1306(String var0) {
      return method_1276(var0);
   }

   // $FF: renamed from: f () java.lang.String
   static String method_1307() {
      return field_1397;
   }

   // $FF: renamed from: e () int
   static int method_1308() {
      return field_1388;
   }

   // $FF: renamed from: a () java.lang.String[][]
   static String[][] method_1309() {
      return field_1367;
   }

   // $FF: renamed from: a (boolean) boolean
   static boolean method_1310(boolean var0) {
      field_1392 = var0;
      return var0;
   }

   // $FF: renamed from: c () boolean
   static boolean method_1311() {
      field_1393 = false;
      return false;
   }

   // $FF: renamed from: b (int) int
   static int method_1312(int var0) {
      field_1410 = var0;
      return var0;
   }

   // $FF: renamed from: g () java.lang.String
   static String method_1313() {
      return field_1386;
   }

   // $FF: renamed from: a (java.util.Timer) java.util.Timer
   static Timer method_1314(Timer var0) {
      field_1405 = var0;
      return var0;
   }

   // $FF: renamed from: a () java.util.Timer
   static Timer method_1315() {
      return field_1405;
   }

   // $FF: renamed from: h () java.lang.String
   static String method_1316() {
      return field_1387;
   }

   // $FF: renamed from: a () long
   static long method_1317() {
      return (long)(field_1389++);
   }

   // $FF: renamed from: b () long
   static long method_1318() {
      return field_1389;
   }

   // $FF: renamed from: a () java.util.Vector
   static Vector method_1319() {
      return field_1373;
   }

   // $FF: renamed from: a (java.util.Vector) void
   static void method_1320(Vector var0) {
      method_1292(var0);
   }

   // $FF: renamed from: <clinit> () void
   class_14() {
	  super();
      field_1358 = null;
      field_1359 = -1;
      field_1360 = "";
      field_1361 = -1;
      field_1362 = "";
      field_1363 = "PaySMS.IAP.Version:1.1.8";
      field_1366 = false;
      field_1367 = null;
      field_1368 = false;
      field_1369 = null;
      field_1370 = null;
      field_1371 = null;
      field_1372 = -1;
      field_1373 = null;
      field_1374 = -1;
      field_1375 = null;
      field_1376 = -1;
      field_1377 = null;
      field_1378 = null;
      field_1379 = null;
      field_1380 = null;
      field_1381 = null;
      field_1382 = null;
      field_1383 = null;
      field_1384 = null;
      field_1385 = null;
      field_1386 = "";
      field_1387 = "";
      field_1388 = -1;
      field_1389 = 1L;
      field_1390 = new String[]{"rmsSMS", "Cm1zY2", "rmsPackageId", "rmsAvailableProfiles", "rmsRedeemUnlocked", "rmsItemType", "rmsUnlocked", "rmsMoneySpent", "rmsCurrentRegion", "rmsCurrentCarrier", "Cm1zY1", "rmsSMSCnt"};
      field_1391 = false;
      field_1392 = false;
      field_1393 = false;
      field_1394 = false;
      field_1395 = false;
      field_1396 = "";
      field_1397 = "";
      field_1398 = "";
      field_1399 = "";
      field_1400 = "";
      field_1401 = "";
      field_1402 = "";
      field_1403 = "/IAP_profiles";
      field_1404 = "/IAP_texts";
      field_1405 = null;
      conn = null;
      field_1407 = false;
      field_1408 = false;
      field_1409 = 0;
      field_1410 = 0;
      field_1411 = "933";
      field_1412 = "5023";
      field_1413 = "5025";
      field_1414 = "";
      field_1415 = "";
      field_1416 = new String[]{"Cash", "Coin"};
      field_1417 = null;
      field_1418 = null;
      field_1419 = null;
      field_1420 = null;
      field_1421 = false;
      field_1422 = false;
      field_1423 = new String[]{"2124", "2126", "2128", "2130", "3501", "3503", "3505", "3507", "3509", "3511"};
      field_1424 = new String[]{"1152", "1154", "1049", "1156", "2741", "2743", "2745", "2878"};
      field_1425 = new String[]{"1104", "1106", "1108", "1110"};
      field_1426 = new int[]{100, 110, 120, 130, 140, 150};
      field_1427 = new int[]{199, 399, 999, 1999, 2999, 3999};
      int[] var10000 = new int[]{25, 50, 100, 150};
      field_1428 = 4;
      field_1429 = 46;
   }
}
