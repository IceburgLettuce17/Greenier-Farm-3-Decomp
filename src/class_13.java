
// $FF: renamed from: n
final class class_13 {

   // $FF: renamed from: a int[]
   private static int[]  field_1341 = new int[]{0, -1, 0, 1, -1, 0, 1, 0, -1, -1, 1, -1, -1, 1, 1, 1};
   // $FF: renamed from: a short[]
   private short[] field_1342;
   // $FF: renamed from: b short[]
   private short[] field_1343;
   // $FF: renamed from: c short[]
   private short[] field_1344;
   // $FF: renamed from: d short[]
   private short[] field_1345;
   // $FF: renamed from: e short[]
   private short[] field_1346;
   // $FF: renamed from: a int
   private int field_1347;
   // $FF: renamed from: b int
   private int field_1348;
   // $FF: renamed from: c int
   private int field_1349;
   // $FF: renamed from: d int
   private int field_1350;
   // $FF: renamed from: e int
   private int field_1351;
   // $FF: renamed from: f int
   private int field_1352;
   // $FF: renamed from: a byte[]
   private byte[] field_1353;
   // $FF: renamed from: g int
   private int field_1354;
   // $FF: renamed from: f short[]
   private short[] field_1355;
   // $FF: renamed from: h int
   private int field_1356;
   // $FF: renamed from: i int
   private int field_1357;


   // $FF: renamed from: <init> () void
   public class_13() {
      super();
   }

   // $FF: renamed from: a (int, int, byte[], int, int, int, int) void
   public final void method_1234(int var1, int var2, byte[] var3, int var4, int var5, int var6, int var7) {
      this.field_1351 = 96;
      this.field_1352 = 96;
      this.field_1353 = var3;
      this.field_1354 = -1;
      this.field_1347 = 14;
      this.field_1348 = 10;
      this.field_1349 = 10;
      this.field_1350 = 8;
      this.field_1342 = new short[9216];
      this.field_1343 = new short[9216];
      this.field_1344 = new short[9216];
      this.field_1345 = new short[9216];
      this.field_1346 = new short[9216];
      this.field_1357 = -1;
      this.field_1355 = new short[9216];
      this.field_1356 = -1;
   }

   // $FF: renamed from: a (int, int, int, int, int) void
   final void method_1235(int var1, int var2, int var3, int var4, int var5) {
      int var7 = this.field_1352;
      int var6 = this.field_1351;
      byte var21 = 0;

      int var8;
      for(var8 = 0; var8 < 9216; ++var8) {
         this.field_1342[var8] = -1;
         this.field_1343[var8] = -1;
         this.field_1344[var8] = -1;
         this.field_1345[var8] = 0;
         this.field_1346[var8] = 0;
         this.field_1355[var8] = 0;
      }

      this.field_1357 = -1;
      var1 += var2 * var6;
      int var11 = var4;
      int var12 = var5;

      int var15;
      while(var1 != -1) {
         this.method_1240(var1);
         short var14 = this.field_1345[var1];
         this.field_1345[var1] = -1;
         this.field_1346[var1] = -1;
         var2 = var1 % var6;
         var4 = var1 / var6;
         if(var2 == var11 && var4 == var12) {
            break;
         }

         for(var15 = 0; var15 < this.field_1350; ++var15) {
            var5 = var2 + field_1341[var15 << 1];
            int var9 = var4 + field_1341[(var15 << 1) + 1];
            if(var5 >= 0 && var5 < var6 && var9 >= 0 && var9 < var7) {
               var8 = var9 * var6 + var5;
               if(this.field_1345[var8] != -1) {
                  int var10 = this.field_1347;
                  int var13;
                  if(var15 >= 4) {
                     var10 = this.field_1348;
                     var13 = var1 % var6;
                     int var16 = var1 / var6;
                     int var17;
                     int var18;
                     if(var15 == 4) {
                        var18 = var13 - 1;
                        if((this.field_1353[var16 * this.field_1351 + var18] & this.field_1354) != 0) {
                           continue;
                        }

                        var17 = var16 - 1;
                        if((this.field_1353[var17 * this.field_1351 + var13] & this.field_1354) != 0) {
                           continue;
                        }
                     } else if(var15 == 5) {
                        var18 = var13 + 1;
                        if((this.field_1353[var16 * this.field_1351 + var18] & this.field_1354) != 0) {
                           continue;
                        }

                        var17 = var16 - 1;
                        if((this.field_1353[var17 * this.field_1351 + var13] & this.field_1354) != 0) {
                           continue;
                        }
                     } else if(var15 == 6) {
                        var18 = var13 - 1;
                        if((this.field_1353[var16 * this.field_1351 + var18] & this.field_1354) != 0) {
                           continue;
                        }

                        var17 = var16 + 1;
                        if((this.field_1353[var17 * this.field_1351 + var13] & this.field_1354) != 0) {
                           continue;
                        }
                     } else if(var15 == 7) {
                        var18 = var13 + 1;
                        if((this.field_1353[var16 * this.field_1351 + var18] & this.field_1354) != 0) {
                           continue;
                        }

                        var17 = var16 + 1;
                        if((this.field_1353[var17 * this.field_1351 + var13] & this.field_1354) != 0) {
                           continue;
                        }
                     }
                  }

                  if((this.field_1353[var9 * this.field_1351 + var5] & this.field_1354) == 0) {
                     var13 = var21 == var15?0:this.field_1349;
                     var10 = var14 + var10 + var13;
                     var5 = Math.abs(var5 - var11);
                     var9 = Math.abs(var9 - var12);
                     if(this.field_1350 == 4) {
                        var5 = this.field_1347 * (var5 + var9);
                     } else if(var5 > var9) {
                        var5 = this.field_1348 * var9 + this.field_1347 * (var5 - var9);
                     } else {
                        var5 = this.field_1348 * var5 + this.field_1347 * (var9 - var5);
                     }

                     if(this.field_1343[var8] == -1 && this.field_1344[var8] == -1 && this.field_1357 != var8) {
                        this.field_1342[var8] = (short)var1;
                        this.field_1345[var8] = (short)var10;
                        this.field_1346[var8] = (short)var5;
                        this.method_1239(var8);
                     } else if(this.field_1345[var8] > var10) {
                        this.field_1342[var8] = (short)var1;
                        this.field_1345[var8] = (short)var10;
                        this.method_1240(var8);
                        this.method_1239(var8);
                     }
                  }
               }
            }
         }

         var1 = this.field_1357;
         if(this.field_1357 != -1) {
            short var20 = this.field_1342[var1];
            if(var1 % var6 != var20 % var6) {
               if(var1 % var6 > var20 % var6) {
                  var21 = 3;
               } else {
                  var21 = 2;
               }
            } else if(var1 / var6 != var20 / var6) {
               var21 = 1;
            } else {
               var21 = 0;
            }
         }
      }

      if(var1 == -1) {
         this.field_1356 = -1;
      } else {
         for(this.field_1356 = 0; var1 != -1; var1 = this.field_1342[var1]) {
            int var22 = var1 % var6;
            var15 = var1 / var6;
            this.field_1355[this.field_1356++] = (short)(var15 * this.field_1351 + var22);
         }

         --this.field_1356;
      }
   }

   // $FF: renamed from: a () int
   final int method_1236() {
      return this.field_1356 + 1;
   }

   // $FF: renamed from: a (int) int
   final int method_1237(int var1) {
      short var2 = this.field_1355[var1];
      return var2 % this.field_1351;
   }

   // $FF: renamed from: b (int) int
   final int method_1238(int var1) {
      short var2 = this.field_1355[var1];
      return var2 / this.field_1351;
   }

   // $FF: renamed from: a (int) void
   private void method_1239(int var1) {
      if(this.field_1357 == -1) {
         this.field_1357 = var1;
      } else {
         int var2 = this.field_1345[var1] + this.field_1346[var1];

         for(int var3 = this.field_1357; var3 != -1; var3 = this.field_1344[var3]) {
            int var4 = this.field_1345[var3] + this.field_1346[var3];
            if(var2 < var4) {
               if(this.field_1343[var3] == -1) {
                  this.field_1357 = var1;
               } else {
                  short var5 = this.field_1343[var3];
                  this.field_1344[var5] = (short)var1;
               }

               this.field_1343[var1] = this.field_1343[var3];
               this.field_1344[var1] = (short)var3;
               this.field_1343[var3] = (short)var1;
               return;
            }

            if(this.field_1344[var3] == -1) {
               this.field_1344[var3] = (short)var1;
               this.field_1343[var1] = (short)var3;
               return;
            }
         }

      }
   }

   // $FF: renamed from: b (int) void
   private void method_1240(int var1) {
      short var2;
      if(this.field_1344[var1] != -1) {
         var2 = this.field_1344[var1];
         this.field_1343[var2] = this.field_1343[var1];
      }

      if(this.field_1357 == var1) {
         this.field_1357 = this.field_1344[var1];
      } else if(this.field_1343[var1] != -1) {
         var2 = this.field_1343[var1];
         this.field_1344[var2] = this.field_1344[var1];
      }

      this.field_1343[var1] = -1;
      this.field_1344[var1] = -1;
   }
}
