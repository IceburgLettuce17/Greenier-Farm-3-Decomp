import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class GloftGF2M extends MIDlet {

   // $FF: renamed from: a a
   public static class_2 field_1187;
   // $FF: renamed from: a GloftGF2M
   public static GloftGF2M instance;

   public GloftGF2M()
   {
	  super();
	  instance = this;
   }

   public final void startApp() {
      if(field_1187 == null) {
         field_1187 = new class_2(this, Display.getDisplay(this));
         field_1187.method_3();
      }

   }

   public final void pauseApp() {
      field_1187.method_5();
   }

   public final void destroyApp(boolean var1) {
      if(field_1187 != null) {
         if(class_2.method_136() == 31) {
            if(class_2.field_680 > 0) {
               class_2.method_682(class_2.field_680);
            }

            if(class_2.field_681 > 0) {
               class_2.method_688(class_2.field_681);
            }
         }

         class_2.method_901();
         class_2.method_175();
         class_1.field_4 = -1;
      }

   }
}
