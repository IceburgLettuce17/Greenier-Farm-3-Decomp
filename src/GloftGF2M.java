import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class GloftGF2M extends MIDlet {

   // $FF: renamed from: a a
   public static cGame game;
   // $FF: renamed from: a GloftGF2M
   public static GloftGF2M instance;

   public GloftGF2M()
   {
	  super();
	  instance = this;
   }

   public final void startApp() {
      if(game == null) {
         game = new cGame(this, Display.getDisplay(this));
         game.initValues();
      }

   }

   public final void pauseApp() {
      game.method_5();
   }

   // Override: javax.microedition.lcdui.midlet.MIDlet.destroyApp(boolean)
   public final void destroyApp(boolean unconditional) {
      if(game != null) {
         if(cGame.method_136() == 31) {
            if(cGame.field_680 > 0) {
               cGame.method_682(cGame.field_680);
            }

            if(cGame.field_681 > 0) {
               cGame.method_688(cGame.field_681);
            }
         }

         cGame.method_901();
         cGame.method_175();
         GLLib.field_4 = -1;
      }

   }
}
