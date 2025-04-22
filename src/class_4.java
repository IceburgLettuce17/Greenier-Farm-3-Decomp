import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

// $FF: renamed from: d
public final class class_4 implements Runnable {

   // $FF: renamed from: c boolean
   private boolean field_912;
   // $FF: renamed from: a java.lang.Thread
   private Thread field_913;
   // $FF: renamed from: b java.lang.String
   private String field_914;
   // $FF: renamed from: a javax.microedition.io.HttpConnection
   private HttpConnection field_915;
   // $FF: renamed from: a java.io.InputStream
   private InputStream field_916;
   // $FF: renamed from: a java.io.OutputStream
   private OutputStream field_917;
   // $FF: renamed from: a java.lang.String
   public String field_918;
   // $FF: renamed from: d boolean
   private boolean field_919;
   // $FF: renamed from: a boolean
   boolean field_920;
   // $FF: renamed from: e boolean
   private boolean field_921;
   // $FF: renamed from: b boolean
   public boolean field_922;
   // $FF: renamed from: a int
   private int field_923;
   // $FF: renamed from: c java.lang.String
   private String field_924;

   // $FF: renamed from: <init> (boolean) void
   public class_4(boolean var1) {
      super();
      this.field_912 = var1;
      String var2 = "application/x-www-form-urlencoded";
      this.field_924 = "application/x-www-form-urlencoded";
   }

   // $FF: renamed from: a () void
   public final synchronized void method_905() {
      if(!this.field_921) {
         this.field_921 = true;
         if(this.field_915 != null) {
            HttpConnection var1;
            if(this.field_916 != null) {
               try {
                  var1 = this.field_915;
                  synchronized(this.field_915) {
                     this.field_916.close();
                  }
               } catch (Exception var8) {
                  ;
               }
            }

            if(this.field_915 != null) {
               try {
                  var1 = this.field_915;
                  synchronized(this.field_915) {
                     this.field_915.close();
                  }
               } catch (Exception var6) {
                  ;
               }
            }

            if(this.field_917 != null) {
               try {
                  OutputStream var9 = this.field_917;
                  synchronized(this.field_917) {
                     this.field_917.close();
                  }
               } catch (Exception var4) {
                  ;
               }
            }

            this.field_917 = null;
         }

         this.field_916 = null;
         this.field_915 = null;
         this.field_920 = false;
         this.field_913 = null;
         System.gc();
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public final void method_906(String var1, String var2) {
      this.field_919 = false;
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

      this.method_905();
      this.field_922 = false;
      this.field_918 = null;
      this.field_920 = true;
      this.field_921 = false;
      this.field_914 = var1 + var2;
      this.field_922 = false;
      this.field_913 = new Thread(this);
      this.field_913.start();
   }

   public final void run() {
      if(this.field_914 == null) {
         this.method_905();
         this.field_922 = true;
         this.field_920 = false;
      } else {
         try {
            this.field_922 = false;
            if(this.field_921) {
               this.field_920 = false;
               return;
            }

            this.field_915 = (HttpConnection)Connector.open(this.field_914, 3);
            this.field_915.setRequestMethod("GET");
            this.field_915.setRequestProperty("Connection", "close");
            this.field_923 = this.field_915.getResponseCode();
            this.field_915.getResponseMessage();
            this.field_915.getDate();
            if(this.field_923 != 200 && this.field_923 != 202) {
               this.method_905();
               this.field_922 = true;
               this.field_920 = false;
               return;
            }

            if(!this.field_921) {
               HttpConnection var1 = this.field_915;
               synchronized(this.field_915) {
                  this.field_916 = this.field_915.openInputStream();
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

                     if(this.field_916.read(var2, 0, 256) != -1) {
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
            this.method_905();
         }

      }
   }

   public final String toString() {
      return null + ": " + this.field_914;
   }
}
