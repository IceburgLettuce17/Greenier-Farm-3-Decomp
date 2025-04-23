import java.util.TimerTask;

// $FF: renamed from: i
final class class_8 extends TimerTask {

   // $FF: renamed from: <init> () void
   class_8() {
      super();
   }

   public final void run() {
      if(!class_14.field_1408) {
         try {
            class_14.field_1407 = true;
            class_14.conn.close();
            return;
         } catch (Exception var1) {
            (new StringBuffer()).append("PaySMS.buy: Failed to close connection in timer. Exception: ").append(var1.toString());
         }
      }

   }
}
