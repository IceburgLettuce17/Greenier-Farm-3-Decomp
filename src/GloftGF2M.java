import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class GloftGF2M extends MIDlet {

   // $FF: renamed from: a a
   public static class_2 game;
   // $FF: renamed from: a GloftGF2M
   public static GloftGF2M instance;

   public GloftGF2M()
   {
	  super();
	  instance = this;
   }

   public final void startApp() {
      if(game == null) {
         game = new class_2(this, Display.getDisplay(this));
         game.initValues();
      }

   }

   public final void pauseApp() {
      game.method_5();
   }

   // Override: javax.microedition.lcdui.midlet.MIDlet.destroyApp(boolean)
   public final void destroyApp(boolean unconditional) {
      if(game != null) {
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
