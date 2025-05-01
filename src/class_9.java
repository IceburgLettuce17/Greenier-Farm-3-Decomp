
// $FF: renamed from: j
final class class_9 implements Runnable {

   // $FF: renamed from: <init> () void
   class_9() {
      super();
   }

   public final void run() {
      while(GLLib.field_20) {
         GLLib.method_9();

         try {
            Thread.sleep(1000L);
         } catch (Exception var1) {
            ;
         }
      }

   }
}
