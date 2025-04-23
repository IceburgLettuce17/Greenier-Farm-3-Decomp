import java.util.Timer;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

// $FF: renamed from: c
final class class_3 extends Thread {

   // $FF: renamed from: <init> () void
   class_3() {
      super();
   }

   public final void run() {
      try {
         String smsAdress = "sms://";
         if(!class_14.method_1303().equals("")) {
            smsAdress = smsAdress + class_14.method_1303();
         } else {
            if(class_14.method_1304().equals("1")) {
               class_14.method_1305(class_14.method_1306("IAP-ShortCode-PP" + class_14.field_1361));
            } else {
               class_14.method_1305("");
            }

            if(!class_14.method_1307().equals("")) {
               smsAdress = smsAdress + class_14.method_1307();
            } else {
               if(class_14.method_1308() == -1) {
                  class_14.method_1310(false);
                  class_14.rmsSave(class_14.field_1390[0], "0");
                  class_14.method_1311();
                  class_14.method_1312(-1);
                  return;
               }

               smsAdress = smsAdress + class_14.method_1309()[class_14.method_1308()][11];
            }
         }

         new StringBuffer().append("PaySMS.buy: smsAdress: ").append(smsAdress);
         class_14.conn = (MessageConnection)Connector.open(smsAdress);
         (new StringBuffer()).append("PaySMS.buy: Connection opened - conn: ").append(class_14.conn);
         TextMessage msg = (TextMessage)class_14.conn.newMessage("text");
         (new StringBuffer()).append("PaySMS.buy: TextMessage created - msg: ").append(msg);
         msg.setPayloadText(class_14.method_1313());

         try {
            Thread.sleep(200L);
         } catch (Exception var4) {
            (new StringBuffer()).append("PaySMS.buy: Exception trying to sleep: ").append(var4.toString());
         }

         class_14.method_1314(new Timer());
         Timer var10000 = class_14.method_1315();
         class_8 var10001 = new class_8();
         var10000.schedule(var10001, (long)30000);
         class_14.conn.send(msg);
         class_14.field_1408 = true;
         class_14.method_1310(true);
         class_14.rmsSave(class_14.field_1390[0], "1");
         class_14.rmsSave(class_14.field_1390[1], class_14.method_1316());
         class_14.rmsSave(class_14.field_1390[2], String.valueOf(class_14.field_1359));
         class_14.rmsSave(class_14.field_1390[5], class_14.field_1360);
         class_14.method_1317();
         class_14.rmsSave(class_14.field_1390[11], "" + class_14.method_1318());
         if(!class_14.method_1304().equals("1")) {
            class_14.method_1320(class_14.method_1319());
         }

         try {
            Thread.sleep(100L);
         } catch (Exception var3) {
            (new StringBuffer()).append("PaySMS.buy: Exception trying to sleep: ").append(var3.toString());
         }
      } catch (SecurityException var5) {
         class_14.method_1310(false);
         class_14.rmsSave(class_14.field_1390[0], "0");
         class_14.method_1312(-9);
         (new StringBuffer()).append("PaySMS.buy: SMS sent failed! Security Exception: ").append(var5.toString());
      } catch (Throwable var6) {
         class_14.method_1310(false);
         class_14.rmsSave(class_14.field_1390[0], "0");
         if(class_14.field_1407) {
            class_14.method_1312(-4);
         } else {
            class_14.method_1312(-1);
         }

         (new StringBuffer()).append("PaySMS.buy: SMS sent failed! Exception: ").append(var6.toString());
      }

      try {
         if(class_14.conn != null) {
            class_14.conn.close();
         }
      } catch (Exception var2) {
         (new StringBuffer()).append("PaySMS.buy: Failed to close connection! Exception: ").append(var2.toString());
      }

      class_14.method_1311();
   }
}
