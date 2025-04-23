import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

// $FF: renamed from: d
public final class class_4 implements Runnable {

   // $FF: renamed from: a java.lang.Thread
   private Thread thread;
   // $FF: renamed from: b java.lang.String
   private String url;
   // $FF: renamed from: a javax.microedition.io.HttpConnection
   private HttpConnection conn;
   // $FF: renamed from: a java.io.InputStream
   private InputStream reqStream;
   // $FF: renamed from: a java.io.OutputStream
   private OutputStream outStream;
   // $FF: renamed from: a java.lang.String
   public String field_918;
   // $FF: renamed from: a boolean
   boolean field_920;
   // $FF: renamed from: e boolean
   private boolean field_921;
   // $FF: renamed from: b boolean
   public boolean field_922;
   // $FF: renamed from: a int
   private int responseCode;
   
   // $FF: renamed from: <init> (boolean) void
   public class_4(boolean unused) {
      super();
   }

   // $FF: renamed from: a () void
   public final synchronized void reset() {
      if(!this.field_921) {
         this.field_921 = true;
         if(this.conn != null) {
            if(this.reqStream != null) {
               try {
                  synchronized(this.conn) {
                     this.reqStream.close();
                  }
               } catch (Exception e) {
               }
            }

            if(this.conn != null) {
               try {
                  synchronized(this.conn) {
                     this.conn.close();
                  }
               } catch (Exception e2) {
               }
            }

            if(this.outStream != null) {
               try {
                  synchronized(this.outStream) {
                     this.outStream.close();
                  }
               } catch (Exception e3) {
                  ;
               }
            }

            this.outStream = null;
         }

         this.reqStream = null;
         this.conn = null;
         this.field_920 = false;
         this.thread = null;
         System.gc();
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public final void method_906(String var1, String var2) {
      System.gc();

      while(this.field_920) {
         try {
            synchronized(this) {
               this.wait(50L);
            }
         } catch (Exception var6) {
            ;
         }
      }

      this.reset();
      this.field_922 = false;
      this.field_918 = null;
      this.field_920 = true;
      this.field_921 = false;
      this.url = var1 + var2;
      this.field_922 = false;
      this.thread = new Thread(this);
      this.thread.start();
   }

   public final void run() {
      if(this.url == null) {
         this.reset();
         this.field_922 = true;
         this.field_920 = false;
      } else {
         try {
            this.field_922 = false;
            if(this.field_921) {
               this.field_920 = false;
               return;
            }

            this.conn = (HttpConnection)Connector.open(this.url, 3);
            this.conn.setRequestMethod("GET");
            this.conn.setRequestProperty("Connection", "close");
            this.responseCode = this.conn.getResponseCode();
            this.conn.getResponseMessage();
            this.conn.getDate();
         
            if(this.responseCode != 200 && this.responseCode != 202) {
               this.reset();
               this.field_922 = true;
               this.field_920 = false;
               return;
            }

            if(!this.field_921) {
               synchronized(this.conn) {
                  this.reqStream = this.conn.openInputStream();
               }

               Thread.yield();
               ByteArrayOutputStream var10 = new ByteArrayOutputStream();
               byte[] var2 = new byte[256];
               int var3 = 0;

               while(true) {
                  if(var3 != -1) {
                     if(this.field_921) {
                        this.field_920 = false;
                        return;
                     }

                     for(var3 = 0; var3 < 256; ++var3) {
                        var2[var3] = 0;
                     }

                     if(this.reqStream.read(var2, 0, 256) != -1) {
                        for(var3 = 255; var3 >= 0 && var2[var3] == 0; --var3) {
                           ;
                        }

                        ++var3;
                        var10.write(var2, 0, var3);
                        continue;
                     }
                  }

                  this.field_918 = var10.toString();
                  var10.toByteArray();
                  return;
               }
            }

            this.field_920 = false;
         } catch (Exception var8) {
            this.field_922 = true;
            this.field_920 = false;
            return;
         } finally {
            this.reset();
         }

      }
   }

   public final String toString() {
      return null + ": " + this.url;
   }
}
