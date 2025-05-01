import javax.microedition.lcdui.Graphics;

// $FF: renamed from: e
public final class ASprite {
   private static final int BS_MODULES = 1 << 0;
   private static final int BS_MODULES_IMG = 1 << 2;
   private static final int BS_MODULE_IMAGES_TC_BMP = 1 << 3;
   private static final int BS_MODULES_WH_SHORT = 1 << 4;
   private static final int BS_IMAGE_SIZE_INT = 1 << 7;
   private static final int BS_FM_OFF_SHORT = 1 << 10;
   private static final int BS_NFM_SHORT = 1 << 11;
   private static final int BS_SKIP_FRAME_RC = 1 << 12;
   private static final int BS_FRAME_RECTS = 1 << 15;
   private static final int BS_AF_OFF_SHORT = 1 << 18;
   private static final int BS_FM_INDEX_SHORT = 1 << 20;
   private static final int BS_MODULE_IMAGES = 1 << 24;
   private static final int BS_MULTIPLE_IMAGES = 1 << 30;

   // $FF: renamed from: a int[]
   static int[] field_925;
   // $FF: renamed from: c int[]
   private static int[] field_926;
   // $FF: renamed from: e int
   private int field_927;
   // $FF: renamed from: a short[]
   short[] field_928;
   // $FF: renamed from: b short[]
   short[] field_929;
   // $FF: renamed from: d short[]
   private short[] field_930;
   // $FF: renamed from: e short[]
   private short[] field_931;
   // $FF: renamed from: b byte[]
   private byte[] field_932;
   // $FF: renamed from: f short[]
   private short[] field_933;
   // $FF: renamed from: c short[]
   short[] field_934;
   // $FF: renamed from: c byte[]
   private byte[] field_935;
   // $FF: renamed from: g short[]
   private short[] field_936;
   // $FF: renamed from: d byte[]
   private byte[] field_937;
   // $FF: renamed from: h short[]
   private short[] field_938;
   // $FF: renamed from: i short[]
   private short[] field_939;
   // $FF: renamed from: e byte[]
   private byte[] field_940;
   // $FF: renamed from: j short[]
   private short[] field_941;
   // $FF: renamed from: f byte[]
   private byte[] field_942;
   // $FF: renamed from: k short[]
   private short[] field_943;
   // $FF: renamed from: l short[]
   private short[] field_944;
   // $FF: renamed from: g byte[]
   private byte[] field_945;
   // $FF: renamed from: m short[]
   private short[] field_946;
   // $FF: renamed from: h byte[]
   private byte[] field_947;
   // $FF: renamed from: i byte[]
   private byte[] field_948;
   // $FF: renamed from: n short[]
   private short[] field_949;
   // $FF: renamed from: o short[]
   private short[] field_950;
   // $FF: renamed from: j byte[]
   private byte[] field_951;
   // $FF: renamed from: k byte[]
   private byte[] field_952;
   // $FF: renamed from: l byte[]
   private byte[] field_953;
   // $FF: renamed from: a short[][]
   private short[][] field_954;
   // $FF: renamed from: f int
   private int field_955;
   // $FF: renamed from: a byte[]
   byte[] field_956;
   // $FF: renamed from: d int[]
   private int[] field_957;
   // $FF: renamed from: g int
   private int _bs_flags; // BSprite format flags
   // $FF: renamed from: a int[][][]
   private int[][][] field_959;
   // $FF: renamed from: a int
   int field_960;
   // $FF: renamed from: e int[]
   private int[] field_961;
   // $FF: renamed from: h int
   private int field_962;
   // $FF: renamed from: a boolean
   private boolean field_963;
   // $FF: renamed from: b boolean
   private boolean field_964;
   // $FF: renamed from: i int
   private int field_965;
   // $FF: renamed from: a short
   private short field_966;
   // $FF: renamed from: f int[]
   private int[] field_967;
   // $FF: renamed from: g int[]
   private int[] field_968;
   // $FF: renamed from: b int
   static int field_969 = 800;
   // $FF: renamed from: c int
   static int field_970 = 480;
   // $FF: renamed from: a l[][]
   class_11[][] field_971;
   // $FF: renamed from: a l[][][]
   private class_11[][][] field_972;
   // $FF: renamed from: c boolean
   private static boolean field_973;
   // $FF: renamed from: h int[]
   private static int[] field_974 = new int[]{0, 2, 1, 3, 5, 7, 4, 6};
   // $FF: renamed from: i int[]
   private static int[] field_975 = new int[]{1, 0, 3, 2, 6, 7, 4, 5};
   // $FF: renamed from: j int[]
   private static int[] field_976 = new int[]{2, 3, 0, 1, 5, 4, 7, 6};
   // $FF: renamed from: k int[]
   private static int[] field_977 = new int[]{4, 5, 6, 7, 3, 2, 1, 0};
   // $FF: renamed from: m byte[]
   private byte[] field_978;
   // $FF: renamed from: n byte[]
   private byte[] field_979;
   // $FF: renamed from: l int[]
   private int[] field_980;
   // $FF: renamed from: j int
   private static int field_981;
   // $FF: renamed from: k int
   private static int field_982;
   // $FF: renamed from: l int
   private static int field_983;
   // $FF: renamed from: m int
   private static int field_984;
   // $FF: renamed from: b int[]
   static int[] field_985 = new int[4];
   // $FF: renamed from: d boolean
   private static boolean field_986 = true;
   // $FF: renamed from: a char
   private static char field_987 = (char)124;
   // $FF: renamed from: b l[][]
   private class_11[][] field_988;
   // $FF: renamed from: a int[][]
   private int[][] field_989;
   // $FF: renamed from: n int
   private int field_990;
   // $FF: renamed from: b short[][]
   private static short[][] field_991;
   // $FF: renamed from: m int[]
   private static int[] field_992;
   // $FF: renamed from: n int[]
   private static int[] field_993;
   // $FF: renamed from: a e[][]
   private static ASprite[][] field_994;
   // $FF: renamed from: o int
   private static int field_995;
   // $FF: renamed from: d int
   static int field_996;
   // $FF: renamed from: p int
   private static int field_997;
   // $FF: renamed from: q int
   private int field_998;
   // $FF: renamed from: r int
   private int field_999;
   // $FF: renamed from: s int
   private int field_1000;
   // $FF: renamed from: t int
   private int field_1001;
   // $FF: renamed from: u int
   private int field_1002;
   // $FF: renamed from: e boolean
   private boolean field_1003;
   // $FF: renamed from: f boolean
   private boolean field_1004;
   // $FF: renamed from: c short[][]
   private short[][] field_1005;
   // $FF: renamed from: b short
   private short field_1006;
   // $FF: renamed from: v int
   private int field_1007;
   // $FF: renamed from: p short[]
   private static short[] field_1008;
   // $FF: renamed from: w int
   private static int field_1009 = -1;
   // $FF: renamed from: x int
   private static int field_1010 = -1;
   // $FF: renamed from: y int
   private static int field_1011 = -1;
   // $FF: renamed from: z int
   private static int field_1012 = 0;


   // $FF: renamed from: a () void
   final void method_907() {
      this.field_928 = null;
      this.field_929 = null;
      this.field_941 = null;
      this.field_940 = null;
      this.field_933 = null;
      this.field_932 = null;
      this.field_947 = null;
      this.field_945 = null;
      this.field_934 = null;
      this.field_935 = null;
      this.field_936 = null;
      this.field_937 = null;
      this.field_938 = null;
      this.field_939 = null;
      this.field_946 = null;
      int var1;
      if(this.field_954 != null) {
         for(var1 = 0; var1 < this.field_954.length; ++var1) {
            this.field_954[var1] = null;
         }

         this.field_954 = null;
      }

      if(this.field_959 != null) {
         for(var1 = 0; var1 < this.field_959.length; ++var1) {
            this.field_959[var1] = null;
         }

         this.field_959 = null;
      }

      if(field_971 != null) {
         for(var1 = 0; var1 < this.field_971.length; ++var1) {
            this.field_971[var1] = null;
         }

         this.field_971 = null;
      }

   }

   // $FF: renamed from: a (byte[], int) void
   // load sprite data (bsprite v5)
   final void method_908(byte[] var1, int var2) {
      if(var1 != null) {
         try {
            if(field_986) {
               System.gc();
            }

            this._bs_flags = (var1[2] & 255) + ((var1[3] & 255) << 8) + ((var1[4] & 255) << 16) + ((var1[5] & 255) << 24);
            byte[] var4 = var1;
            byte var3 = 6;
            ASprite var20 = this;
            int var21 = var3 + 1;
            int var10001 = var1[6] & 255;
            ++var21;
            this.field_927 = (short)(var10001 + ((var1[7] & 255) << 8));
            int var5;
            int var6;
            int var13;
            int var32;
            if(this.field_927 > 0) {
               this.field_928 = new short[this.field_927];
               this.field_929 = new short[this.field_927];
               var5 = 0;
               var6 = 0;
               short[][] var7 = null;
               if((this._bs_flags & BS_MODULES_IMG) != 0) {
                  this.field_979 = new byte[this.field_927];
               }

               boolean var8 = false;
               boolean var9 = false;

               for(var13 = 0; var13 < var20.field_927; ++var13) {
                  boolean var10 = false;
                  boolean var11 = false;
                  boolean var12 = false;
                  if((var4[var21] & 255) == 0) {
                     ++var21;
                     var8 = false;
                     var9 = true;
                     if((var20._bs_flags & BS_MODULES_IMG) != 0) {
                        var20.field_979[var13] = var4[var21++];
                     }
                  } else if((var4[var21] & 255) == 255) {
                     ++var21;
                     var20.method_909(var20.field_927);
                     var20.field_978[var13] = 1;
                     var8 = true;
                     var9 = true;
                  } else if((var4[var21] & 255) == 254) {
                     ++var21;
                     var20.method_909(var20.field_927);
                     var20.field_978[var13] = 2;
                     var8 = true;
                     var9 = true;
                  } else if((var4[var21] & 255) == 253) {
                     ++var21;
                     var20.method_909(var20.field_927);
                     var20.field_978[var13] = 5;
                     var8 = false;
                     var9 = true;
                  } else if((var4[var21] & 255) == 252) {
                     ++var21;
                     var20.method_909(var20.field_927);
                     var20.field_978[var13] = 3;
                     var8 = true;
                     var9 = true;
                     var10 = true;
                  } else if((var4[var21] & 255) == 251) {
                     ++var21;
                     var20.method_909(var20.field_927);
                     var20.field_978[var13] = 4;
                     var8 = true;
                     var9 = true;
                     var10 = true;
                  } else if((var4[var21] & 255) == 250) {
                     ++var21;
                     var20.method_909(var20.field_927);
                     var20.field_978[var13] = 6;
                     var8 = true;
                     var9 = false;
                     var11 = true;
                  } else if((var4[var21] & 255) == 249) {
                     ++var21;
                     var20.method_909(var20.field_927);
                     var20.field_978[var13] = 7;
                     var8 = true;
                     var9 = false;
                     var11 = true;
                  } else if((var4[var21] & 255) == 248) {
                     ++var21;
                     var20.method_909(var20.field_927);
                     var20.field_978[var13] = 8;
                     var8 = true;
                     var9 = true;
                     var11 = false;
                  } else if((var4[var21] & 255) == 247) {
                     ++var21;
                     var20.method_909(var20.field_927);
                     var20.field_978[var13] = 9;
                     var8 = true;
                     var12 = true;
                     var9 = true;
                     var11 = false;
                  }

                  if(var8) {
                     var20.field_980[var13] = (var4[var21++] & 255) + ((var4[var21++] & 255) << 8) + ((var4[var21++] & 255) << 16) + ((var4[var21++] & 255) << 24);
                  }

                  short[] var14;
                  if(var12) {
                     if(var7 == null) {
                        var7 = new short[var20.field_927][];
                     }

                     var14 = new short[3];
                     var32 = (var4[var21++] & 255) + ((var4[var21++] & 255) << 8) + ((var4[var21++] & 255) << 16) + ((var4[var21++] & 255) << 24);
                     var14[0] = (short)var32;
                     var14[1] = (short)(var32 >> 16);
                     var14[2] = (short)var4[var21++];
                     var7[var13] = var14;
                     ++var5;
                     var6 += 3;
                  }

                  if(var9) {
                     if((var20._bs_flags & BS_MODULES_WH_SHORT) == 0) {
                        var20.field_928[var13] = (short)(var4[var21++] & 255);
                        var20.field_929[var13] = (short)(var4[var21++] & 255);
                     } else {
                        var20.field_928[var13] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                        var20.field_929[var13] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     }
                  }

                  if(var10) {
                     if(var7 == null) {
                        var7 = new short[var20.field_927][];
                     }

                     (var14 = new short[2])[0] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     var14[1] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     var7[var13] = var14;
                     ++var5;
                     var6 += 2;
                  }

                  if(var11) {
                     if(var7 == null) {
                        var7 = new short[var20.field_927][];
                     }

                     (var14 = new short[4])[0] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     var14[1] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     var14[2] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     var14[3] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     var7[var13] = var14;
                     ++var5;
                     var6 += 4;
                  }
               }

               if(var5 > 0) {
                  var20.field_930 = new short[var6];
                  var20.field_931 = new short[var5 << 1];
                  var13 = 0;
                  short var37 = 0;

                  for(short var22 = 0; var22 < var20.field_927; ++var22) {
                     byte var33;
                     if(var20.field_978[var22] != 3 && var20.field_978[var22] != 4) {
                        if(var20.field_978[var22] != 6 && var20.field_978[var22] != 7) {
                           if(var20.field_978[var22] == 9) {
                              var33 = 3;
                           } else {
                              var33 = -1;
                           }
                        } else {
                           var33 = 4;
                        }
                     } else {
                        var33 = 2;
                     }

                     if(var33 > 0) {
                        var20.field_931[var13 << 1] = var22;
                        var20.field_931[(var13 << 1) + 1] = var37;

                        for(var5 = 0; var5 < var33; ++var5) {
                           var20.field_930[var37] = var7[var22][var5];
                           ++var37;
                        }

                        var7[var22] = null;
                        ++var13;
                     }
                  }
               }
            }

            var4 = var1;
            var20 = this;
            short var23;
            if((var23 = (short)((var1[var21++] & 255) + ((var1[var21++] & 255) << 8))) > 0) {
               if((this._bs_flags & BS_FM_INDEX_SHORT) != 0) {
                  this.field_941 = new short[var23];
               } else {
                  this.field_940 = new byte[var23];
               }

               this.field_943 = new short[var23];
               this.field_944 = new short[var23];
               this.field_942 = new byte[var23];

               for(var6 = 0; var6 < var23; ++var6) {
                  if((var20._bs_flags & BS_FM_INDEX_SHORT) != 0) {
                     var20.field_941[var6] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                  } else {
                     var20.field_940[var6] = var4[var21++];
                  }

                  if((var20._bs_flags & BS_FM_OFF_SHORT) != 0) {
                     var20.field_943[var6] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     var20.field_944[var6] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                  } else {
                     var20.field_943[var6] = (short)var4[var21++];
                     var20.field_944[var6] = (short)var4[var21++];
                  }

                  var20.field_942[var6] = var4[var21++];
               }
            }

            var4 = var1;
            var21 = var21;
            var20 = this;
            int var27;
            int var40;
            if((this._bs_flags & BS_FRAME_RECTS) != 0) {
               var23 = (short)((var1[var21++] & 255) + ((var1[var21++] & 255) << 8));
               if((this._bs_flags & BS_FM_OFF_SHORT) == 0) {
                  this.field_937 = new byte[var23 << 2];
                  System.arraycopy(var1, var21, this.field_937, 0, var23 << 2);
                  var21 += var23 << 2;
               } else {
                  this.field_938 = new short[var23 << 2];
                  var32 = var23 << 2;
                  short[] var30 = this.field_938;
                  var27 = var21;
                  byte[] var31 = var1;

                  for(var40 = 0; var40 < var32; ++var40) {
                     var30[var40] = (short)((var31[var27++] & 255) + ((var31[var27++] & 255) << 8));
                  }

                  var21 = var27;
               }
            }

            int var29;
            if((var23 = (short)((var1[var21++] & 255) + ((var1[var21++] & 255) << 8))) > 0) {
               if((this._bs_flags & BS_NFM_SHORT) != 0) {
                  this.field_933 = new short[var23];
               } else {
                  this.field_932 = new byte[var23];
               }

               this.field_934 = new short[var23];
               if((this._bs_flags & BS_FRAME_RECTS) != 0) {
                  this.field_939 = new short[var23 + 1];
               }

               short var25 = 0;

               for(var29 = 0; var29 < var23; ++var29) {
                  if((var20._bs_flags & BS_NFM_SHORT) != 0) {
                     var20.field_933[var29] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                  } else {
                     var20.field_932[var29] = var4[var21++];
                  }

                  var20.field_934[var29] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                  if((var20._bs_flags & BS_FRAME_RECTS) != 0 && (var20._bs_flags & BS_FRAME_RECTS) != 0) {
                     var20.field_939[var29] = var25;
                     var25 = (short)(var25 + var4[var21++]);
                  }
               }

               if((var20._bs_flags & BS_FRAME_RECTS) != 0) {
                  var20.field_939[var20.field_939.length - 1] = var25;
               }

               if((var20._bs_flags & BS_SKIP_FRAME_RC) == 0) {
                  var29 = var23 << 2;
                  if((var20._bs_flags & BS_FM_OFF_SHORT) == 0) {
                     var20.field_935 = new byte[var29];

                     for(var5 = 0; var5 < var29; ++var5) {
                        var20.field_935[var5] = var4[var21++];
                     }
                  } else {
                     var20.field_936 = new short[var29];

                     for(var5 = 0; var5 < var29; ++var5) {
                        var20.field_936[var5] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     }
                  }
               }
            }

            var4 = var1;
            var20 = this;
            if((var23 = (short)((var1[var21++] & 255) + ((var1[var21++] & 255) << 8))) > 0) {
               this.field_947 = new byte[var23];
               this.field_948 = new byte[var23];
               if((this._bs_flags & BS_AF_OFF_SHORT) != 0) {
                  this.field_949 = new short[var23];
                  this.field_950 = new short[var23];
               } else {
                  this.field_951 = new byte[var23];
                  this.field_952 = new byte[var23];
               }

               this.field_953 = new byte[var23];

               for(var6 = 0; var6 < var23; ++var6) {
                  var20.field_947[var6] = var4[var21++];
                  var20.field_948[var6] = var4[var21++];
                  if((var20._bs_flags & BS_AF_OFF_SHORT) != 0) {
                     var20.field_949[var6] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     var20.field_950[var6] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                  } else {
                     var20.field_951[var6] = var4[var21++];
                     var20.field_952[var6] = var4[var21++];
                  }

                  var20.field_953[var6] = var4[var21++];
               }
            }

            var4 = var1;
            var20 = this;
            if((var23 = (short)((var1[var21++] & 255) + ((var1[var21++] & 255) << 8))) > 0) {
               this.field_945 = new byte[var23];
               this.field_946 = new short[var23];

               for(int var26 = 0; var26 < var23; ++var26) {
                  var20.field_945[var26] = var4[var21++];
                  var20.field_946[var26] = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
               }
            }

            if(this.field_927 <= 0) {
               if(field_986) {
                  System.gc();
               }

            } else {
               if((this._bs_flags & BS_MODULE_IMAGES) != 0) {
                  var4 = var1;
                  var20 = this;
                  if((this._bs_flags & BS_MODULE_IMAGES) != 0 && var21 < var1.length) {
                     short var24 = (short)((var1[var21++] & 255) + ((var1[var21++] & 255) << 8));
                     byte var28 = 1;
                     if((this._bs_flags & BS_MULTIPLE_IMAGES) != 0) {
                        var28 = (byte)var1[var21++];
                     }

                     if(this.field_961 == null) {
                        this.field_961 = new int[var28];
                     }

                     int var34;
                     int var35;
                     for(var5 = 0; var5 < var28; ++var5) {
                        var29 = var4[var21++] & 255;
                        var20.field_960 = var29;
                        if((var34 = var4[var21++] & 255) == 0) {
                           var34 = 256;
                        }

                        var20.field_961[var5] = var34;
                        if(var20.field_959 == null) {
                           var20.field_959 = new int[var28][16][];
                        }

                        var35 = var5;
                        var27 = var34;
                        short var36 = var24;
                        byte[] var41 = var4;
                        var29 = var21;
                        ASprite var18 = var20;

                        for(var13 = 0; var13 < var18.field_960; ++var13) {
                           var18.field_959[var35][var13] = new int[var27];
                           int[] var38 = var18.field_959[var35][var13];
                           short var15;
                           int var16;
                           int var39;
                           if(var36 == 21781) {
                              for(var40 = 0; var40 < var27; ++var40) {
                                 var15 = (short)((var41[var29++] & 255) + ((var41[var29++] & 255) << 8));
                                 var16 = -16777216;
                                 if((var15 & '\u8000') != '\u8000') {
                                    var16 = 0;
                                    var18.field_963 = true;
                                 }

                                 if((var39 = var16 | (var15 & 31744) << 9 | (var15 & 992) << 6 | (var15 & 31) << 3) == 16253176) {
                                    var39 = 16711935;
                                 }

                                 var38[var40] = var39;
                              }
                           } else if(var36 == 25861) {
                              for(var40 = 0; var40 < var27; ++var40) {
                                 var15 = (short)((var41[var29++] & 255) + ((var41[var29++] & 255) << 8));
                                 var16 = -16777216;
                                 if((var15 & '\uffff') == '\uf81f') {
                                    var16 = 0;
                                    var18.field_963 = true;
                                 }

                                 if((var39 = var16 | (var15 & '\uf800') << 8 | (var15 & 2016) << 5 | (var15 & 31) << 3) == 16253176) {
                                    var39 = 16711935;
                                 }

                                 var38[var40] = var39;
                              }
                           } else if(var36 == -30712) {
                              var18.field_964 = false;

                              for(var40 = 0; var40 < var27; ++var40) {
                                 if((var39 = (var41[var29++] & 255) + ((var41[var29++] & 255) << 8) + ((var41[var29++] & 255) << 16)) == 16711935) {
                                    var18.field_963 = true;
                                 } else {
                                    var39 |= -16777216;
                                 }

                                 var38[var40] = var39;
                              }
                           }
                        }

                        var21 = var29;
                     }

                     var20.field_966 = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                     if(var20.field_966 == 25840 || var20.field_966 == -22976) {
                        if(var20.field_967 == null) {
                           var20.field_967 = new int[var28];
                           var20.field_968 = new int[var28];
                        }

                        for(var5 = 0; var5 < var28; ++var5) {
                           var34 = var20.field_961[var5] - 1;
                           var20.field_967[var5] = 1;

                           for(var20.field_968[var5] = 0; var34 != 0; ++var20.field_968[var5]) {
                              var34 >>= 1;
                              var20.field_967[var5] <<= 1;
                           }

                           --var20.field_967[var5];
                        }
                     }

                     if(var20.field_927 > 0) {
                        var20.field_957 = new int[var20.field_927];
                        var5 = 0;

                        for(var27 = 0; var27 < var20.field_927; ++var27) {
                           if((var20._bs_flags & BS_IMAGE_SIZE_INT) != 0) {
                              var35 = (var4[var21++] & 255) + ((var4[var21++] & 255) << 8) + ((var4[var21++] & 255) << 16) + ((var4[var21++] & 255) << 24);
                           } else {
                              var35 = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                           }

                           var20.field_957[var27] = var5;
                           var5 += var35;
                           var21 += var35;
                        }

                        var21 = var21;
                        var20.field_956 = new byte[var5];

                        for(var5 = 0; var5 < var20.field_927; ++var5) {
                           if((var20._bs_flags & BS_IMAGE_SIZE_INT) != 0) {
                              var34 = (var4[var21++] & 255) + ((var4[var21++] & 255) << 8) + ((var4[var21++] & 255) << 16) + ((var4[var21++] & 255) << 24);
                           } else {
                              var34 = (short)((var4[var21++] & 255) + ((var4[var21++] & 255) << 8));
                           }

                           System.arraycopy(var4, var21, var20.field_956, var20.method_936(var5), var34);
                           var21 += var34;
                        }
                     }
                  }
               }

               this.field_955 = -1;
               this.field_954 = new short[16][];
               if((this._bs_flags & BS_SKIP_FRAME_RC) != 0) {
                  int var19;
                  if((var19 = this.method_934()) > 0) {
                     var2 = 0;
                     int[] var43;
                     if((this._bs_flags & BS_FM_OFF_SHORT) == 0 && (this.field_965 & 4) == 0) {
                        this.field_935 = new byte[var19 << 2];

                        for(var21 = 0; var21 < var19; ++var21) {
                           var43 = field_985;
                           this.method_929(field_985, var21);
                           this.field_935[var2++] = (byte)field_985[0];
                           this.field_935[var2++] = (byte)field_985[1];
                           this.field_935[var2++] = (byte)(field_985[2] - field_985[0]);
                           this.field_935[var2++] = (byte)(field_985[3] - field_985[1]);
                        }
                     } else {
                        this.field_936 = new short[var19 << 2];

                        for(var21 = 0; var21 < var19; ++var21) {
                           var43 = field_985;
                           this.method_929(field_985, var21);
                           this.field_936[var2++] = (short)field_985[0];
                           this.field_936[var2++] = (short)field_985[1];
                           this.field_936[var2++] = (short)(field_985[2] - field_985[0]);
                           this.field_936[var2++] = (short)(field_985[3] - field_985[1]);
                        }
                     }
                  }
               } else if((this.field_965 & 4) != 0) {
                  this.field_965 &= -5;
               }

               if(field_986) {
                  System.gc();
               }

            }
         } catch (Exception var17) {
            ;
         }
      }
   }

   // $FF: renamed from: f (int) void
   private void method_909(int var1) {
      if(this.field_978 == null) {
         this.field_978 = new byte[var1];

         for(int var2 = 0; var2 < var1; ++var2) {
            this.field_978[var2] = 0;
         }
      }

      if(this.field_980 == null) {
         this.field_980 = new int[var1];
      }

   }

   // $FF: renamed from: b () void
   final void method_910() {
      this.field_959 = null;
      this.field_956 = null;
      this.field_957 = null;
      if(field_986) {
         System.gc();
      }

   }

   // $FF: renamed from: a (int, int) int
   final int method_911(int var1, int var2) {
      return this.field_948[this.field_946[var1] + var2] & 255;
   }

   // $FF: renamed from: a (int) int
   final int method_912(int var1) {
      return this.field_945[var1] & 255;
   }

   // $FF: renamed from: k (int) int
   private int method_913(int var1) {
      return (this._bs_flags & BS_NFM_SHORT) != 0?this.field_933[var1]:this.field_932[var1] & 255;
   }

   // $FF: renamed from: l (int) int
   private int method_914(int var1) {
      return (this._bs_flags & BS_AF_OFF_SHORT) != 0?this.field_949[var1]:this.field_951[var1];
   }

   // $FF: renamed from: m (int) int
   private int method_915(int var1) {
      return (this._bs_flags & BS_AF_OFF_SHORT) != 0?this.field_950[var1]:this.field_952[var1];
   }

   // $FF: renamed from: b (int) int
   final int method_916(int var1) {
      return this.field_943[var1];
   }

   // $FF: renamed from: c (int) int
   final int method_917(int var1) {
      return this.field_944[var1];
   }

   // $FF: renamed from: d (int) int
   final int method_918(int var1) {
      return (this._bs_flags & BS_FM_OFF_SHORT) == 0 && (this.field_965 & 4) == 0?this.field_935[(var1 << 2) + 2] & 255:this.field_936[(var1 << 2) + 2] & '\uffff';
   }

   // $FF: renamed from: e (int) int
   final int method_919(int var1) {
      return (this._bs_flags & BS_FM_OFF_SHORT) == 0 && (this.field_965 & 4) == 0?this.field_935[(var1 << 2) + 3] & 255:this.field_936[(var1 << 2) + 3] & '\uffff';
   }

   // $FF: renamed from: f (int) int
   final int method_920(int var1) {
      return (this._bs_flags & BS_FM_OFF_SHORT) == 0 && (this.field_965 & 4) == 0?this.field_935[var1 << 2]:this.field_936[var1 << 2];
   }

   // $FF: renamed from: g (int) int
   final int method_921(int var1) {
      return (this._bs_flags & BS_FM_OFF_SHORT) == 0 && (this.field_965 & 4) == 0?this.field_935[(var1 << 2) + 1]:this.field_936[(var1 << 2) + 1];
   }

   // $FF: renamed from: n (int) int
   private int method_922(int var1) {
      int var2;
      if((this._bs_flags & BS_FM_INDEX_SHORT) != 0) {
         var2 = this.field_941[var1];
      } else {
         var2 = this.field_940[var1] & 255;
      }

      return var2;
   }

   // $FF: renamed from: b (int, int) int
   final int method_923(int var1, int var2) {
      var1 = this.method_926(var1, var2);
      return this.method_922(var1);
   }

   // $FF: renamed from: o (int) int
   private int method_924(int var1) {
      return this.field_942[var1] & 255;
   }

   // $FF: renamed from: c (int, int) int
   final int method_925(int var1, int var2) {
      var1 = this.method_926(var1, var2);
      return this.method_924(var1);
   }

   // $FF: renamed from: e (int, int) int
   private int method_926(int var1, int var2) {
      return this.field_934[var1] + var2;
   }

   // $FF: renamed from: p (int) int
   private int method_927(int var1) {
      short var2 = this.field_934[var1];
      return this.field_943[var2];
   }

   // $FF: renamed from: d (int, int) int
   final int method_928(int var1, int var2) {
      var1 = this.field_934[var1] + var2;
      return this.field_944[var1];
   }

   // $FF: renamed from: a (int[], int) void
   private void method_929(int[] var1, int var2) {
      this.method_930(var1, var2, 0, 0, 0, false, true);
   }

   // $FF: renamed from: a (int[], int, int, int, int, boolean, boolean) void
   private void method_930(int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      if(!var7) {
         int var11 = this.method_920(var2);
         int var10 = this.method_921(var2);
         int var8 = this.method_918(var2);
         int var9 = this.method_919(var2);
         if((var5 & 1) != 0) {
            var11 = -var11 - var8;
         }

         if((var5 & 2) != 0) {
            var10 = -var10 - var9;
         }

         if((var5 & 4) != 0) {
            var2 = var11;
            var11 = -var10 - var9;
            var10 = var2;
            var2 = var8;
            var8 = var9;
            var9 = var2;
         }

         field_981 = var3 + var11;
         field_982 = var4 + var10;
         field_983 = field_981 + var8;
         field_984 = field_982 + var9;
      } else {
         field_981 = Integer.MAX_VALUE;
         field_982 = Integer.MAX_VALUE;
         field_983 = Integer.MIN_VALUE;
         field_984 = Integer.MIN_VALUE;
         field_1012 = 1;
         this.method_980((Graphics)null, var2, var3, var4, var5);
         field_1012 = 0;
      }

      var1[0] = field_981;
      var1[1] = field_982;
      var1[2] = field_983;
      var1[3] = field_984;
   }

   // $FF: renamed from: a (int[], int, int, int) void
   final void method_931(int[] var1, int var2, int var3, int var4) {
      this.method_930(var1, var2, var3, var4, 0, false, false);
   }

   // $FF: renamed from: a (int[], int, int, int, int, int) void
   final void method_932(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = this.field_953[this.field_946[var2] + var3] & 15;
      if((var6 & 1) != 0) {
         var8 = field_975[var8 & 7] | var8 & -8;
      }

      if((var6 & 2) != 0) {
         var8 = field_976[var8 & 7] | var8 & -8;
      }

      if((var6 & 4) != 0) {
         var8 = field_977[var8 & 7] | var8 & -8;
      }

      int var7 = var8;
      var8 = this.field_946[var2] + var3;
      var8 = this.field_947[var8] & 255;
      int var11 = this.field_946[var2] + var3;
      int var9 = this.method_914(var11);
      var11 = this.field_946[var2] + var3;
      var2 = this.method_915(var11);
      if((var6 & 1) != 0) {
         var9 = -var9;
      }

      if((var6 & 2) != 0) {
         var2 = -var2;
      }

      if((var6 & 4) != 0) {
         var3 = var9;
         var9 = -var2;
         var2 = var3;
      }

      this.method_930(var1, var8, var4 + var9, var5 + var2, var7, false, false);
   }

   // $FF: renamed from: a () int
   final int method_933() {
      return this.field_945 == null?0:this.field_945.length;
   }

   // $FF: renamed from: b () int
   final int method_934() {
      return (this._bs_flags & BS_NFM_SHORT) != 0?(this.field_933 == null?0:this.field_933.length):(this.field_932 == null?0:this.field_932.length);
   }

   // $FF: renamed from: h (int) int
   final int method_935(int var1) {
      int var2;
      int var3 = var2 = this.method_913(var1);

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5 = this.method_923(var1, var4);
         if((this.method_925(var1, var4) & 16) != 0) {
            var3 = var3 - 1 + this.method_935(var5);
         }
      }

      return var3;
   }

   // $FF: renamed from: q (int) int
   private int method_936(int var1) {
      return this.field_957 != null?this.field_957[var1]:-1;
   }

   // $FF: renamed from: i (int) int
   final int method_937(int var1) {
      return this.field_939 != null?this.field_939[var1 + 1] - this.field_939[var1]:0;
   }

   // $FF: renamed from: a (int, int, int[], int) void
   final void method_938(int var1, int var2, int[] var3, int var4) {
      if(this.field_939 != null && var3 != null) {
         short var5 = this.field_939[var1];
         if((var1 = this.field_939[var1 + 1] - var5) > 0 && var2 < var1) {
            var4 = var5 + var2 << 2;
            if((this._bs_flags & BS_FM_OFF_SHORT) != 0) {
               if(this.field_938 != null) {
                  var3[0] = this.field_938[var4];
                  var3[1] = this.field_938[var4 + 1];
                  var3[2] = this.field_938[var4 + 2] & '\uffff';
                  var3[3] = this.field_938[var4 + 3] & '\uffff';
                  return;
               }
            } else if(this.field_937 != null) {
               var3[0] = this.field_937[var4];
               var3[1] = this.field_937[var4 + 1];
               var3[2] = this.field_937[var4 + 2] & 255;
               var3[3] = this.field_937[var4 + 3] & 255;
            }

            return;
         }

         var3[0] = 0;
         var3[1] = 0;
         var3[2] = 0;
         var3[3] = 0;
      }

   }

   // $FF: renamed from: a (int[]) int[]
   static int[] method_939(int[] var0) {
      if(var0 != null && var0 == field_925) {
         if(var0 != null && var0 == field_926) {
            return null;
         } else {
            if(field_926 == null) {
               field_926 = new int[27832];
            }

            return field_926;
         }
      } else {
         if(field_925 == null) {
            field_925 = new int[27832];
         }

         return field_925;
      }
   }

   // $FF: renamed from: a (int) boolean
   final boolean method_940(int var1) {
      return var1 < 0?false:(this.field_971 == null?false:(var1 >= this.field_971.length?false:this.field_971[var1] != null));
   }

   // $FF: renamed from: a (int, int) void
   final void method_941(int var1, int var2) {
      this.field_943[var1] = (short)var2;
   }

   // $FF: renamed from: b (int, int) void
   final void method_942(int var1, int var2) {
      this.field_944[var1] = (short)var2;
   }

   // $FF: renamed from: c () void
   public final void method_943() {
      this.field_988 = new class_11[this.field_960][this.field_927];
      this.field_989 = new int[this.field_960][this.field_927];
   }

   // $FF: renamed from: a () boolean
   public final boolean method_944() {
      return this.field_988 != null;
   }

   // $FF: renamed from: a (int[], int) int
   private static int method_945(int[] var0, int var1) {
      return GLLib.method_68(var0, 0, var0.length, var1);
   }

   // $FF: renamed from: a (int, int, int, int) boolean
   private boolean method_946(int var1, int var2, int var3, int var4) {
      if(this.method_944()) {
         int var5;
         int[] var6 = GLLib.method_88(var5 = GLLib.method_89());
         if(this.field_988 != null && this.field_988[this.field_962][var1] != null?method_945(var6, var5) == this.field_989[this.field_962][var1]:false) {
            class_11 var8;
            class_11 var10000 = var8 = this.field_988[this.field_962][var1];
            int var10001 = var10000.field_1186.getWidth();
            int var10002 = var8.field_1186.getHeight();
            var5 = field_974[var4];
            var4 = var10002;
            var1 = var10001;
            var8 = var10000;
            GLLib.method_49(GLLib.field_1, var8, 0, 0, var1, var4, var5, var2, var3, 20, false);
            return true;
         }
      }

      return false;
   }

   // $FF: renamed from: a (int, int, int, int[], int) boolean
   private boolean method_947(int var1, int var2, int var3, int[] var4, int var5) {
      if(this.method_944() && var4 != null) {
         int var6;
         int[] var7 = GLLib.method_88(var6 = GLLib.method_89());
         class_11 var10 = class_11.method_1185(var4, GLLib.field_79, GLLib.field_80, true);
         this.field_988[this.field_962][var1] = var10;
         this.field_989[this.field_962][var1] = method_945(var7, var6);
         class_11 var10000 = var10;
         int var10001 = var10.field_1186.getWidth();
         int var10002 = var10.field_1186.getHeight();
         var5 = field_974[var5];
         int var11 = var10002;
         var1 = var10001;
         class_11 var9 = var10000;
         GLLib.method_49(GLLib.field_1, var9, 0, 0, var1, var11, var5, var2, var3, 20, false);
         return true;
      } else {
         return false;
      }
   }

   // $FF: renamed from: a (int) void
   static void method_948(int var0) {
      field_991 = new short[var0][];
      field_994 = new ASprite[var0][];
      field_992 = new int[var0];
      field_993 = new int[var0];
   }

   // $FF: renamed from: c (int, int) void
   static void method_949(int var0, int var1) {
      field_993[var0] = var1;
      field_991[var0] = new short[var1];
      field_994[var0] = new ASprite[var1];

      for(var1 = 0; var1 < field_991[var0].length; ++var1) {
         field_991[var0][var1] = -1;
      }

   }

   // $FF: renamed from: b (int) void
   final void method_950(int var1) {
      this.field_990 = var1;
      if(this.field_971 == null) {
         this.field_971 = new class_11[this.field_960][];

         for(var1 = 0; var1 < this.field_960; ++var1) {
            this.field_971[var1] = new class_11[this.field_927];
         }
      }

   }

   // $FF: renamed from: d () void
   final void method_951() {
      if(this.field_990 >= 0) {
         for(int var1 = 0; var1 < field_993[this.field_990]; ++var1) {
            if(field_994[this.field_990][var1] == this) {
               short var2;
               int var3 = (var2 = field_991[this.field_990][var1]) >> 10;
               int var4 = var2 & 1023;
               field_994[this.field_990][var1] = null;
               this.field_971[var3][var4] = null;
            }
         }
      }

   }

   // $FF: renamed from: a (int, java.lang.Object) void
   private final void method_952(int var1, Object var2) {
      if(field_990 >= 0 && this.field_971[this.field_962][var1] == null) {
         int var3 = field_992[this.field_990];
         short var4;
         int var5 = (var4 = field_991[this.field_990][var3]) >> 10;
         int var6 = var4 & 1023;
         ASprite var7;
         if(var4 >= 0 && (var7 = field_994[this.field_990][var3]) != null) {
            var7.field_971[var5][var6] = null;
         }

         var4 = (short)((var1 & 1023) + (this.field_962 << 10));
         field_991[this.field_990][var3] = var4;
         field_994[this.field_990][var3] = this;
         field_992[this.field_990] = (field_992[this.field_990] + 1) % field_993[this.field_990];
         this.field_971[this.field_962][var1] = (class_11)var2;
      }

   }

   // $FF: renamed from: a (int) java.lang.Object
   final Object method_953(int var1) {
      return this.method_954(var1);
   }

   // $FF: renamed from: a (int) int[]
   private int[] method_954(int var1) {
      if(this.field_957 == null?false:this.field_956 != null) {
         byte var2 = this.field_979 == null?0:this.field_979[var1];
         byte[] var10002 = this.field_956;
         int var10003 = this.method_936(var1);
         int var10004 = this.field_928[var1] & '\uffff';
         int var5 = this.field_929[var1] & '\uffff';
         int var4 = var10004;
         var1 = var10003;
         byte[] var9 = var10002;
         byte var3 = var2;
         ASprite var10 = this;
         int var6 = 0;
         var4 *= var5;
         if(field_925 == null) {
            field_925 = new int[27832];
         }

         int var8 = this.field_962;
         int[] var12;
         boolean var14;
         if((var12 = (int[])(var8 >= 0 && var8 < this.field_960 && this.field_959 != null && var8 < this.field_959[var2].length?this.field_959[var2][var8]:null)) == null) {
            var14 = false;
         } else {
            int var7;
            if(this.field_966 == 25840) {
               while(var6 < var4) {
                  var8 = var9[var1++] & 255;
                  var7 = var12[var8 & var10.field_967[var3]];

                  for(var8 >>= var10.field_968[var3]; var8-- >= 0; field_925[var6++] = var7) {
                     ;
                  }
               }
            } else if(this.field_966 == 10225) {
               while(var6 < var4) {
                  if((var8 = var9[var1++] & 255) > 127) {
                     int var11 = var9[var1++] & 255;
                     var7 = var12[var11];

                     for(var8 -= 128; var8-- > 0; field_925[var6++] = var7) {
                        ;
                     }
                  } else {
                     field_925[var6++] = var12[var8];
                  }
               }
            } else if(this.field_966 == 22258) {
               --var1;
               --var6;
               --var4;

               while(var6 < var4) {
                  ++var1;
                  if((var8 = var9[var1]) < 0) {
                     var8 += 128;

                     while(true) {
                        ++var6;
                        ++var1;
                        field_925[var6] = var12[var9[var1] & 255];
                        --var8;
                        if(var8 <= 0) {
                           break;
                        }
                     }
                  } else {
                     ++var1;
                     var7 = var12[var9[var1] & 255];

                     while(true) {
                        ++var6;
                        field_925[var6] = var7;
                        --var8;
                        if(var8 <= 0) {
                           break;
                        }
                     }
                  }
               }
            } else {
               byte var13;
               if(this.field_966 == 5632) {
                  var4 = var4 + ((var4 & 1) == 0?0:2) >> 1;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        break;
                     }

                     var13 = var9[var1++];
                     field_925[var6++] = var12[var13 >> 4 & 15];
                     field_925[var6++] = var12[var13 & 15];
                  }
               } else if(this.field_966 == 1024) {
                  var4 = var4 + ((var4 & 3) == 0?0:4) >> 2;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        break;
                     }

                     var13 = var9[var1++];
                     field_925[var6++] = var12[var13 >> 6 & 3];
                     field_925[var6++] = var12[var13 >> 4 & 3];
                     field_925[var6++] = var12[var13 >> 2 & 3];
                     field_925[var6++] = var12[var13 & 3];
                  }
               } else if(this.field_966 == 512) {
                  var4 = var4 + ((var4 & 7) == 0?0:8) >> 3;

                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        break;
                     }

                     var13 = var9[var1++];
                     field_925[var6++] = var12[var13 >> 7 & 1];
                     field_925[var6++] = var12[var13 >> 6 & 1];
                     field_925[var6++] = var12[var13 >> 5 & 1];
                     field_925[var6++] = var12[var13 >> 4 & 1];
                     field_925[var6++] = var12[var13 >> 3 & 1];
                     field_925[var6++] = var12[var13 >> 2 & 1];
                     field_925[var6++] = var12[var13 >> 1 & 1];
                     field_925[var6++] = var12[var13 & 1];
                  }
               } else if(this.field_966 == 22018) {
                  while(true) {
                     --var4;
                     if(var4 < 0) {
                        break;
                     }

                     field_925[var6++] = var12[var9[var1++] & 255];
                  }
               }
            }

            var14 = true;
         }

         if(var14) {
            return field_925;
         }
      }

      return null;
   }

   // $FF: renamed from: a (short[]) void
   final void method_955(short[] var1) {
      this.field_1006 = var1[0];
      this.field_1005 = new short[this.field_1006][];
      int var2 = 1;

      int var3;
      for(var3 = 0; var3 < this.field_1006; ++var3) {
         this.field_1005[var3] = new short[2];
         this.field_1005[var3][0] = var1[var2++];
         this.field_1005[var3][1] = var1[var2++];
      }

      short[] var5;
      short var8;
      for(var3 = var2; var3 < var1.length; this.field_1005[var8] = var5) {
         var8 = var1[var3++];
         short var4;
         (var5 = new short[((var4 = var1[var3++]) << 1) + 2])[0] = this.field_1005[var8][0];
         var5[1] = this.field_1005[var8][1];

         for(int var6 = 0; var6 < var4; ++var6) {
            var5[(var6 << 1) + 2] = var1[var3++];
            var5[(var6 << 1) + 3] = var1[var3++];
         }
      }

      this.field_1002 = -this.method_928(0, 0);
      int var7 = this.method_928(0, 1);
      this.field_998 = this.field_1002 + var7;
      this.field_999 = this.method_928(0, 2) - this.method_928(0, 1);
      this.field_1001 = this.method_927(this.method_956(32));
   }

   // $FF: renamed from: r (int) int
   private int method_956(int var1) {
      if(this.field_1005 == null) {
         return 0;
      } else {
         int var2 = var1 % this.field_1006;
         if(this.field_1005[var2][0] == var1) {
            return this.field_1005[var2][1];
         } else {
            int var3 = 2;

            int var4;
            for(var4 = this.field_1005[var2].length; var3 < var4 && this.field_1005[var2][var3] != var1; var3 += 2) {
               ;
            }

            return var3 >= var4?1:this.field_1005[var2][var3 + 1];
         }
      }
   }

   // $FF: renamed from: c () int
   final int method_957() {
      return this.field_1007 >= 0?this.field_999 * this.field_1007 >> 8:this.field_999;
   }

   // $FF: renamed from: d () int
   final int method_958() {
      return this.field_1007 >= 0?this.field_998 * this.field_1007 >> 8:this.field_998;
   }

   // $FF: renamed from: g () int
   private int method_959() {
      return this.field_1007 >= 0?this.field_1001 * this.field_1007 >> 8:this.field_1001;
   }

   // $FF: renamed from: h () int
   private int method_960() {
      return this.field_1007 >= 0?this.field_1000 * this.field_1007 >> 8:this.field_1000;
   }

   // $FF: renamed from: c (int) void
   final void method_961(int var1) {
      this.field_1000 = var1;
   }

   // $FF: renamed from: e () int
   final int method_962() {
      return this.field_1007 >= 0?this.field_998 * this.field_1007 >> 8:this.field_998;
   }

   // $FF: renamed from: a (short[], int) int
   private static final int method_963(short[] var0, int var1) {
      var1 = var1 * 3 + 1;
      return var0[var1];
   }

   // $FF: renamed from: b (short[], int) int
   private static final int method_964(short[] var0, int var1) {
      var1 = var1 * 3 + 2;
      return var0[var1];
   }

   // $FF: renamed from: a (java.lang.String, int, boolean) short[]
   final short[] method_965(String var1, int var2, boolean var3) {
      if(field_1008 == null) {
         field_1008 = new short[1100];
      }

      int var19 = var1.length();
      short var4 = 0;
      short var5 = 1;
      short var7 = 0;
      boolean var8 = this.field_1004;
      boolean var9 = this.field_1003;
      int var10 = this.field_962;
      boolean var11 = false;
      short var12 = 0;
      boolean var13 = this.field_1004;
      boolean var14 = this.field_1003;
      int var15 = this.field_962;
      int var16 = this.field_962 & 4095 | (var13?4096:0) | (var14?8192:0);

      for(int var17 = 0; var17 < var19; ++var17) {
         char var18 = var1.charAt(var17);
         int var6 = this.method_970(this.method_956(var18));
         if(var18 != 32 && var18 != field_987) {
            if(var18 == 92) {
               ++var17;
               char var20;
               if((var20 = var1.charAt(var17)) == 94) {
                  var13 = !var13;
               } else if(var20 == 95) {
                  var14 = !var14;
               } else {
                  int var22 = var20 & 255;
                  var22 -= 48;
                  if(var22 < this.field_960) {
                     var15 = var22;
                  }
               }
            } else if(var18 == 10) {
               field_1008[var5++] = (short)var17;
               field_1008[var5++] = var4;
               var7 = (short)var17;
               var4 = 0;
               var12 = 0;
               field_1008[var5++] = (short)var16;
               var16 = var15 & 4095 | (var13?4096:0) | (var14?8192:0);
            } else {
               if(var18 < 32) {
                  if(var18 == 1) {
                     ++var17;
                     continue;
                  }

                  if(var18 != 2) {
                     continue;
                  }

                  ++var17;
               }

               var6 += this.method_960();
               if(var13) {
                  ++var6;
               }

               var12 += (short)var6;
               if((var4 += (short)var6) > var2) {
                  boolean var21;
                  if(var21 = !var11) {
                     var4 -= (short)var6;
                     var7 = (short)(var17 - 1);
                  }

                  var11 = false;

                  for(var6 = var7; var6 >= 0 && (var1.charAt(var6) == 32 || var1.charAt(var6) == 10 || var1.charAt(var6) == field_987); --var6) {
                     if(var1.charAt(var6) == 32) {
                        var4 -= (short)this.method_959();
                     }
                  }

                  if(var21) {
                     var8 = var13;
                     var9 = var14;
                     var10 = var15;
                     var12 = 0;
                  }

                  if(var1.charAt(var7) != 10) {
                     field_1008[var5++] = (short)(var7 + 1);
                     field_1008[var5++] = (short)(var4 - var12);
                  }

                  field_1008[var5++] = (short)var16;
                  var14 = var9;
                  var15 = var10;
                  var16 = var10 & 4095 | (var8?4096:0) | (var9?8192:0);
                  var4 = 0;
                  var17 = var7;
                  var13 = var8;
               }
            }
         } else {
            if(var18 == 32) {
               var4 += (short)this.method_959();
            }

            var7 = (short)var17;
            var8 = var13;
            var11 = true;
            var12 = 0;
            var9 = var14;
            var10 = var15;
            if(var4 > var2) {
               var11 = false;

               for(var6 = var7; var6 >= 0 && (var1.charAt(var6) == 32 || var1.charAt(var6) == field_987); --var6) {
                  if(var1.charAt(var6) == 32) {
                     var4 -= (short)this.method_959();
                  }
               }

               while(var7 < var19 && (var1.charAt(var7) == 32 || var1.charAt(var7) == field_987)) {
                  ++var7;
               }

               var17 = --var7;
               var13 = var13;
               field_1008[var5++] = (short)(var7 + 1);
               field_1008[var5++] = (short)var4;
               field_1008[var5++] = (short)var16;
               var14 = var14;
               var15 = var15;
               var16 = var10 & 4095 | (var8?4096:0) | (var9?8192:0);
               var4 = 0;
            }
         }
      }

      field_1008[var5++] = (short)var19;
      field_1008[var5++] = var4;
      field_1008[var5++] = (short)var16;
      field_1008[0] = (short)(var5 / 3);
      return field_1008;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, short[], int, int, int, int, int, int, boolean) void
   final void method_966(Graphics var1, String var2, short[] var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      short var20 = var3[0];
      var9 = this.method_962();
      if(var7 == -1) {
         var7 = var20;
      }

      if(var7 > var20) {
         var7 = var20;
      }

      var9 += this.method_957();
      if((var8 & 32) != 0) {
         var5 -= var9 * (var7 - 1);
      } else if((var8 & 2) != 0) {
         var5 -= var9 * (var7 - 1) >> 1;
      }

      field_995 = this.field_962;
      boolean var11 = this.field_1004;
      boolean var12 = this.field_1003;
      int var13;
      int var14 = (var13 = GLLib.method_37(var1, true)) + GLLib.method_39(var1, true);
      var13 -= var9;
      var14 += var9;
      int var15 = 0;

      for(int var21 = 0; var21 < var20 && var15 <= var7 - 1; ++var15) {
         field_1009 = var21 > 0?method_963(var3, var21 - 1):0;
         field_1010 = method_963(var3, var21);
         if(field_1009 < var2.length() && var2.charAt(field_1009) == 10) {
            ++field_1009;
         }

         int var16 = var4;
         int var17;
         if((var17 = var5 + var15 * var9) >= var13) {
            if(var17 > var14) {
               break;
            }

            if((var8 & 43) != 0) {
               if(this.field_1007 >= 0) {
                  if((var8 & 8) != 0) {
                     var16 = var4 - (method_964(var3, var21) * this.field_1007 >> 8);
                  } else if((var8 & 1) != 0) {
                     var16 = var4 - (method_964(var3, var21) * this.field_1007 >> 9);
                  }
               } else if((var8 & 8) != 0) {
                  var16 = var4 - method_964(var3, var21);
               } else if((var8 & 1) != 0) {
                  var16 = var4 - (method_964(var3, var21) >> 1);
               }

               if((var8 & 32) != 0) {
                  var17 -= this.method_962();
               } else if((var8 & 2) != 0) {
                  var17 -= this.method_962() >> 1;
               }
            }

            int var19 = var21 * 3 + 3;
            short var18 = var3[var19];
            this.field_1004 = (var18 & 4096) != 0;
            this.field_1003 = (var18 & 8192) != 0;
            this.method_971(var18 & 4095);
            this.method_969(var1, var2, var16, var17, 0, false);
         }

         ++var21;
      }

      field_1009 = -1;
      field_1010 = -1;
      field_1011 = -1;
      this.field_962 = field_995;
      this.field_1004 = var11;
      this.field_1003 = var12;
   }

   // $FF: renamed from: a (java.lang.String, char[]) void
   final void method_967(String var1, char[] var2) {
      if(var1 != null) {
         field_996 = 0;
         field_997 = this.method_962();
         int var8 = 0;
         boolean var3 = var1 != null;
         int var4 = field_1009 >= 0?field_1009:0;
         int var5;
         if(var3) {
            var5 = field_1010 >= 0?field_1010:var1.length();
         } else {
            var5 = field_1010 >= 0?field_1010:((Object[])null).length;
         }

         for(boolean var6 = this.field_1004; var4 < var5; ++var4) {
            char var7;
            if((var7 = var3?var1.charAt(var4):(char)var4) == 92) {
               ++var4;
               if((var3?var1.charAt(var4):(char)var4) == 94) {
                  var6 = !var6;
               }
            } else {
               int var10000;
               if(var7 > 32) {
                  var10000 = this.method_956(var7);
               } else {
                  if(var7 == 32 || var7 == field_987) {
                     if(var7 == 32) {
                        var8 += this.method_959();
                     }
                     continue;
                  }

                  if(var7 == 32) {
                     var8 += this.method_959();
                     continue;
                  }

                  if(var7 == 10) {
                     if(var8 > field_996) {
                        field_996 = var8;
                     }

                     var8 = 0;
                     field_997 += this.method_957() + this.method_962();
                     continue;
                  }

                  if(var7 == 1) {
                     ++var4;
                     continue;
                  }

                  if(var7 != 2) {
                     continue;
                  }

                  ++var4;
                  var10000 = var3?var1.charAt(var4):(char)var4;
               }

               int var9 = var10000;
               var8 += this.method_970(var9) + this.method_960();
               if(var6) {
                  ++var8;
               }
            }
         }

         if(var8 > field_996) {
            field_996 = var8;
         }

         if(field_996 > 0) {
            field_996 -= this.method_960();
         }

      }
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int) void
   final void method_968(Graphics var1, String var2, int var3, int var4, int var5) {
      this.method_969(var1, var2, var3, var4, var5, true);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, java.lang.String, int, int, int, boolean) void
   private void method_969(Graphics var1, String var2, int var3, int var4, int var5, boolean var6) {
      var3 = var3;
      var2 = var2;
      var1 = var1;
      
      if(var2 != null) {
         if(this.field_1007 >= 0) {
            var4 += this.field_1002 * this.field_1007 >> 8;
         } else {
            var4 += this.field_1002;
         }

         boolean var7 = var2 != null;
         this.method_967(var2, (char[])null);
         if((var5 & 43) != 0) {
            if((var5 & 8) != 0) {
               var3 -= field_996;
            } else if((var5 & 1) != 0) {
               var3 -= field_996 >> 1;
            }

            if((var5 & 32) != 0) {
               var4 -= field_997;
            } else if((var5 & 2) != 0) {
               var4 -= field_997 >> 1;
            }
         }

         var5 = var3;
         if(var6) {
            field_995 = this.field_962;
         }

         int var8 = field_1009 >= 0?field_1009:0;
         int var10;
         if(var7) {
            var10 = field_1010 >= 0?field_1010:var2.length();
         } else {
            var10 = field_1010 >= 0?field_1010:((Object[])null).length;
         }

         if(field_1011 >= 0 && var10 > field_1011) {
            var10 = field_1011;
         }

         for(int var11 = var8; var11 < var10; ++var11) {
            char var12;
            char var13;
            int var14;
            if((var12 = var7?var2.charAt(var11):(char)var11) == 92) {
               ++var11;
               if((var13 = var7?var2.charAt(var11):(char)var11) == 95) {
                  this.field_1003 = !this.field_1003;
               } else if(var13 == 94) {
                  this.field_1004 = !this.field_1004;
               } else {
                  var14 = var13 & 255;
                  this.method_971(var14 - 48);
               }
            } else if(var12 != field_987) {
               int var9;
               int var10000;
               if(var12 > 32) {
                  var10000 = this.method_956(var12);
               } else {
                  if(var12 == 32) {
                     if(this.field_1003) {
                        var9 = this.method_956(95);
                        var8 = var5 + (this.method_959() - this.method_970(var9) >> 1);
                        this.method_980(var1, var9, var8, var4, 0);
                     }

                     var5 += this.method_959();
                     continue;
                  }

                  if(var12 == 10) {
                     var5 = var3;
                     var4 += this.method_957() + this.method_962();
                     continue;
                  }

                  if(var12 == 1) {
                     ++var11;
                     if((var13 = var7?var2.charAt(var11):(char)var11) < this.field_960) {
                        this.method_971(var13);
                     }

                     if(var13 == 255) {
                        this.field_962 = field_995;
                     }
                     continue;
                  }

                  if(var12 != 2) {
                     continue;
                  }

                  ++var11;
                  var10000 = var7?var2.charAt(var11):(char)var11;
               }

               var14 = var10000;
               this.method_980(var1, var14, var5, var4, 0);
               if(this.field_1003) {
                  var9 = this.method_956(95);
                  var8 = var5 + (this.method_970(var14) - this.method_970(var9) >> 1);
                  this.method_980(var1, var9, var8, var4, 0);
               }

               if(this.field_1004) {
                  ++var5;
                  this.method_980(var1, var14, var5, var4, 0);
               }

               var5 += this.method_970(var14) + this.method_960();
            }
         }

         if(var6) {
            this.field_962 = field_995;
         }
      }

   }

   // $FF: renamed from: s (int) int
   private final int method_970(int var1) {
      return this.field_1007 >= 0?this.method_927(var1) * this.field_1007 >> 8:this.method_927(var1);
   }

   // $FF: renamed from: d (int) void
   final void method_971(int var1) {
      if(var1 < this.field_960 && var1 >= 0) {
         this.field_962 = var1;
      }
   }

   // $FF: renamed from: f () int
   final int method_972() {
      return this.field_962;
   }

   // $FF: renamed from: j (int) int
   final int method_973(int var1) {
      return (this._bs_flags & BS_FM_INDEX_SHORT) != 0?this.field_933[var1]:this.field_932[var1];
   }

   // $FF: renamed from: a (int, int, int, int) void
   final void method_974(int var1, int var2, int var3, int var4) {
      if(this.field_971 == null) {
         this.field_971 = new class_11[this.field_960][];
      }

      if(this.field_971[var1] == null) {
         this.field_971[var1] = new class_11[this.field_927];
      }

      if(this.field_927 != 0) {
         if(var3 == -1) {
            var3 = this.field_927 - 1;
         }

         if((this._bs_flags & (BS_MODULE_IMAGES_TC_BMP|BS_MODULE_IMAGES)) != 0) {
            var4 = this.field_962;
            this.field_962 = var1;
            if(field_986) {
               System.gc();
            }

            for(; var2 <= var3; ++var2) {
               if((this.field_978 != null?this.field_978[var2]:0) == 0) {
                  int var5 = this.field_928[var2] & '\uffff';
                  int var6 = this.field_929[var2] & '\uffff';
                  int[] var7;
                  if(var5 > 0 && var6 > 0 && (var7 = this.method_954(var2)) != null) {
                     if(GLLib.field_71 && (GLLib.field_72 & 1046496) != 0) {
                        boolean var8 = this.field_963;
                        var7 = GLLib.method_100((Graphics)null, var7, 0, 0, var5, var6, 0, var8, false, false);
                        var5 = GLLib.field_79;
                        var6 = GLLib.field_80;
                     }

                     int[] var13 = var7;
                     int var10 = var5 * var6;
                     boolean var11 = false;

                     for(int var12 = 0; var12 < var10; ++var12) {
                        if((var13[var12] & -16777216) != -16777216) {
                           var11 = true;
                           break;
                        }
                     }

                     this.field_971[var1][var2] = class_11.method_1185(method_985(var13, var6, var5, 4, (int[])null), var6, var5, var11);
                  }
               }
            }

            if(field_986) {
               System.gc();
            }

            this.field_962 = var4;
         }

         if(field_986) {
            System.gc();
         }

      }
   }

   // $FF: renamed from: a (int, int, int) void
   final void method_975(int var1, int var2, int var3) {
      boolean var9 = field_986;
      if(field_986) {
         System.gc();
         field_986 = false;
      }

      int var4 = this.method_913(var2);

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = this.method_923(var2, var5);
         if((this.field_971 != null && var1 >= 0 && var1 < this.field_971.length && this.field_971[var1] != null && var6 >= 0 && var6 < this.field_971[var1].length?this.field_971[var1][var6]:null) == null) {
            this.method_974(var1, var6, var6, -1);
         }
      }

      field_986 = var9;
      if(var9) {
         System.gc();
      }

   }

   // $FF: renamed from: e (int) void
   final void method_976(int var1) {
      if(this.field_971 != null && var1 < this.field_971.length) {
         this.field_971[var1] = null;
      }

   }

   // $FF: renamed from: b (int, int, int) void
   final void method_977(int var1, int var2, int var3) {
      ASprite var10000 = this;
      var1 = var1;
      
      int var4 = var10000.method_934();
      if(var3 == -1 || var3 >= var4) {
         var3 = var4 - 1;
      }

      if(this.field_972 == null) {
         this.field_972 = new class_11[this.field_960][][];
      }

      int var5 = this.field_955 + 1;
      int var6;
      int var8;
      if(this.field_972[var1] == null) {
         int var25;
         label111: {
            ASprite var7 = this;
            var8 = 0;
            if(this.field_954 != null) {
               if(this.field_954.length != 16) {
                  var25 = this.field_954.length;
                  break label111;
               }

               for(var8 = 15; var8 >= 0 && var7.field_954[var8] == null; --var8) {
                  ;
               }

               ++var8;
            }

            var25 = var8;
         }

         var6 = var25 + 1;
         this.field_972[var1] = new class_11[var6][];
      }

      if(this.field_972[var1][var5] == null) {
         this.field_972[var1][var5] = new class_11[var4];
      }

      for(var6 = var2; var6 <= var3; ++var6) {
         class_11[] var26 = this.field_972[var1][var5];
         var2 = this.method_918(var6);
         int var9 = this.method_919(var6);
         if((GLLib.field_72 & 8192) != 0) {
            int var10 = GLLib.method_94();
            var4 = GLLib.method_95();
            var2 = var2 * var10 / 100;
            var9 = var9 * var4 / 100;
         }

         class_11 var10002;
         if(var2 != 0 && var9 != 0) {
            boolean var22 = false;
            boolean var11 = true;
            Object var23 = null;
            var11 = false;
            int var12 = this.method_918(var6);
            int var13 = this.method_919(var6);
            int var14 = this.method_920(var6);
            int var15 = this.method_921(var6);
            var14 = -var14;
            var15 = -var15;
            int var16;
            int var17;
            if((GLLib.field_72 & 8192) != 0) {
               var16 = GLLib.method_94();
               var17 = GLLib.method_95();
               var12 = var12 * var16 / 100;
               var13 = var13 * var17 / 100;
               var14 = var14 * var16 / 100;
               var15 = var15 * var17 / 100;
            }

            var16 = var12 * var13;
            int[] var24;
            int[] var27;
            if(var12 != 0 && var13 != 0) {
               var24 = new int[var16];
               var17 = this.field_962;
               this.field_962 = var1;
               if(((var8 = field_977[0]) & 4) != 0) {
                  int var18 = var12;
                  var12 = var13;
                  var13 = var18;
               }

               Graphics var19;
               class_11 var28;
               (var19 = (var28 = class_11.method_1184(var12, var13)).field_1186.getGraphics()).setColor(-65281);
               var19.fillRect(0, 0, var12, var13);
               if((var8 & 4) != 0) {
                  field_969 = var13;
                  field_970 = var12;
               }

               this.method_980(var19, var6, var14, var15, 0);
               if((var8 & 4) != 0) {
                  var8 = GLLib.height;
                  field_969 = GLLib.width;
                  field_970 = var8;
               }

               GLLib.method_52(var28, var24, 0, var12, 0, 0, var12, var13);
               int var21 = 16711935;
               var21 = GLLib.field_1.getDisplayColor(var21);

               while(var16 > 0) {
                  --var16;
                  if((var24[var16] & 16777215) == var21) {
                     var24[var16] = 16711935;
                     var11 = true;
                  }
               }

               field_973 = var11;
               this.field_962 = var17;
               var27 = var24;
            } else {
               var27 = null;
            }

            var24 = var27;
            var4 = field_977[0];
            if(var24 == null) {
               var10002 = null;
            } else if((var4 & 4) != 0) {
               var22 = field_973;
               var10002 = class_11.method_1185(var24, var9, var2, var22);
            } else {
               var22 = field_973;
               var10002 = class_11.method_1185(var24, var2, var9, var22);
            }
         } else {
            var10002 = null;
         }

         var26[var6] = var10002;
      }

   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) boolean
   private static boolean method_978(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = GLLib.method_36(var0, true);
      int var6 = GLLib.method_37(var0, true);
      int var7 = GLLib.method_38(var0, true);
      int var10 = GLLib.method_39(var0, true);
      if((GLLib.field_72 & 8192) != 0) {
         int var8 = GLLib.method_94();
         int var9 = GLLib.method_95();
         var3 = var3 * var8 / 100;
         var4 = var4 * var9 / 100;
      } else if((GLLib.field_72 & 1 << 15) != 0) {
         return true;
      }

      return var1 + var3 >= var5 && var2 + var4 >= var6 && var1 < var5 + var7 && var2 < var6 + var10;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int) void
   final void method_979(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      var2 = this.field_946[var2] + var3;
      var3 = this.field_947[var2] & 255;
      int var7 = this.method_914(var2);
      int var8 = this.method_915(var2);
      int var9 = this.field_953[var2] & 15;
      if((var6 & 1) != 0) {
         var9 = field_975[var9 & 7] | var9 & -8;
         var7 = -var7;
      }

      if((var6 & 2) != 0) {
         var9 = field_976[var9 & 7] | var9 & -8;
         var8 = -var8;
      }

      if((var6 & 4) != 0) {
         var9 = field_977[var9 & 7] | var9 & -8;
         var2 = var7;
         var7 = -var8;
         var8 = var2;
      }

      if((GLLib.field_72 & 8192) != 0 && GLLib.field_73[13][5] == 0) {
         var2 = GLLib.method_94();
         var6 = GLLib.method_95();
         var7 = var2 * var7 / 100;
         var8 = var6 * var8 / 100;
      }

      this.method_980(var1, var3, var4 + var7, var5 + var8, var9);
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int) void
   final void method_980(Graphics var1, int var2, int var3, int var4, int var5) {
      this.method_981(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: b (javax.microedition.lcdui.Graphics, int, int, int, int) void
   final void method_981(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6;
      int var7;
      int var10;
      int var11;
      int var12;
      int var13;
      int var15;
      int var16;
      int var17;
      int var18;
      int var19;
      label191: {
         var6 = -1;
         if(field_1012 == 0) {
            var10 = this.field_962;
            var11 = this.field_955 + 1;
            if(this.field_972 != null && this.field_972[var10] != null && this.field_972[var10][var11][var2] != null) {
               var13 = var5;
               boolean var14 = false;
               var15 = this.method_918(var2);
               var16 = this.method_919(var2);
               var17 = this.method_920(var2);
               var18 = this.method_921(var2);
               if((var5 & 4) != 0) {
                  var19 = var17;
                  var17 = var18;
                  var18 = var19;
               }

               if((var5 & 1) != 0) {
                  var17 = -var17 - var15;
               }

               if((var5 & 2) != 0) {
                  var18 = -var18 - var16;
               }

               if((var5 & 4) != 0) {
                  var19 = var17;
                  var17 = -var18 - var16;
                  var18 = var19;
               }

               var11 = var3 + var17;
               var12 = var4 + var18;
               if((GLLib.field_72 & 8192) != 0) {
                  var19 = GLLib.method_94();
                  var7 = GLLib.method_95();
                  var17 -= var19 * var17 / 100;
                  var18 -= var7 * var18 / 100;
                  var11 -= var17;
                  var12 -= var18;
               }

               if((GLLib.field_72 & 1 << 15) != 0) {
                  var11 -= var17;
                  var12 -= var18;
               }

               boolean var27;
               if(var1 != null && !method_978(var1, var11, var12, var15, var16)) {
                  var27 = true;
               } else {
                  if((var5 & 1) == 0 || (var5 & 2) == 0) {
                     if((var5 & 1) != 0) {
                        var13 = var5 & -2 | 2;
                     } else if((var5 & 2) != 0) {
                        var13 = var5 & -3 | 1;
                     }
                  }

                  var7 = var16;
                  if((GLLib.field_72 & 8192) != 0) {
                     var7 = var16 * GLLib.method_95() / 100;
                  }

                  var17 = var11;
                  var11 = field_970 - var12 - var7;
                  var19 = var15;
                  var18 = this.field_962;
                  class_11 var10000;
                  if(this.field_972 != null && this.field_972[var18] != null) {
                     var19 = this.field_955 + 1;
                     var10000 = this.field_972[var18][var19][var2];
                  } else {
                     var10000 = null;
                  }

                  class_11 var24 = var10000;
                  if(var10000 != null) {
                     label140: {
                        if(GLLib.field_71 && (GLLib.field_72 & 1046496) != 0) {
                           int var20 = var19;
                           var19 = var16;
                           var18 = var17;
                           var17 = var11;
                           Object var8 = null;
                           if(var24 != null) {
                              boolean var22 = this.field_963;
                              int[] var23 = method_939((int[])null);
                              GLLib.method_52(var24, var23, 0, var16, 0, 0, var16, var20);
                              int[] var25 = GLLib.method_100(var1, var23, var11, var18, var16, var20, var13, var22, false, true);
                              if(var25 != null) {
                                 GLLib.method_51(var1, var25, 0, GLLib.field_79, var11, var18, GLLib.field_79, GLLib.field_80, GLLib.field_74, true, 0, -1, false);
                              }

                              var27 = true;
                           } else {
                              var27 = false;
                           }

                           if(var27) {
                              break label140;
                           }
                        }

                        if(var13 == 0) {
                           GLLib.method_48(var1, var24, var11, var17, 20, false);
                        } else {
                           GLLib.method_49(var1, var24, 0, 0, var16, var19, field_974[var13 & 7], var11, var17, 20, false);
                        }
                     }

                     var14 = true;
                  }

                  var27 = var14;
               }

               if(var27) {
                  break label191;
               }
            }
         }

         var6 = this.method_913(var2);
      }

      if(var6 > 0) {
         for(var7 = 0; var7 < var6; ++var7) {
            var15 = this.method_926(var2, var7);
            var16 = this.method_924(var15);
            var18 = var17 = this.method_922(var15);
            if(this.field_955 >= 0) {
               var17 = this.field_954[this.field_955][var17];
            }

            var11 = this.field_928[var17] & '\uffff';
            var12 = this.field_929[var17] & '\uffff';
            int var21 = var12;
            var17 = 0 + this.field_943[var15];
            var10 = 0 + this.field_944[var15];
            if((var16 & 4) != 0) {
               var19 = var11;
               var11 = var12;
               var12 = var19;
            }

            if((var5 & 1) != 0) {
               var16 = field_975[var16 & 7] | var16 & -8;
               var17 = -var17 - var11;
            }

            if((var5 & 2) != 0) {
               var16 = field_976[var16 & 7] | var16 & -8;
               var10 = -var10 - var12;
            }

            if((var5 & 4) != 0) {
               var16 = field_977[var16 & 7] | var16 & -8;
               var19 = var17;
               var17 = -var10 - var12;
               var10 = var19;
            }

            if((GLLib.field_72 & 8192) != 0 && GLLib.field_73[13][5] == 0) {
               var11 = GLLib.method_94();
               int var26 = GLLib.method_95();
               if(GLLib.field_73[13][6] % GLLib.field_31 != 0) {
                  var15 = -var17;
                  GLLib.field_73[16][1] = var15;
                  var15 = -var10;
                  GLLib.field_73[16][2] = var15;
               }

               var17 = var11 * var17 / 100;
               var10 = var26 * var10 / 100;
            }

            var12 = var3 + var17;
            var13 = var4 + var10;
            this.method_984(var1, var18, var12, var13, var16 & 15, var11, var21);
         }
      }

   }

   // $FF: renamed from: c (javax.microedition.lcdui.Graphics, int, int, int, int) void
   final void method_982(Graphics var1, int var2, int var3, int var4, int var5) {
      GLLib.method_92();
      GLLib.method_96(var5);
      this.method_980(var1, var2, var3, var4, 0);
      GLLib.method_93();
   }

   // $FF: renamed from: t (int) int
   private int method_983(int var1) {
      if(this.field_931 != null) {
         for(int var2 = 0; var2 < this.field_931.length; var2 += 2) {
            if(this.field_931[var2] == var1) {
               return this.field_931[var2 + 1];
            }
         }
      }

      return -1;
   }

   // $FF: renamed from: a (javax.microedition.lcdui.Graphics, int, int, int, int, int, int) void
   final void method_984(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      field_985[0] = var6;
      field_985[1] = var7;
      int[] var103 = field_985;
      var5 = var5;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      
      int var9 = var5;
      if(this.field_955 >= 0) {
         var2 = this.field_954[this.field_955][var2];
      }

      int var10;
      int var11;
      if((GLLib.field_72 & 8192) != 0 && GLLib.field_73[13][5] != 0) {
         var10 = GLLib.method_94();
         var11 = GLLib.method_95();
         var3 = var3 * var10 / 100;
         var4 = var4 * var11 / 100;
      }

      int var12;
      int var13;
      if((this.field_978 != null?this.field_978[var2]:0) == 0) {
         if((var5 & 1) == 0 || (var5 & 2) == 0) {
            if((var5 & 1) != 0) {
               var5 = var5 & -2 | 2;
            } else if((var5 & 2) != 0) {
               var5 = var5 & -3 | 1;
            }
         }

         var10 = var3;
         int var10000 = field_970 - var4;
         var12 = this.field_929[var2];
         if((var5 & 4) != 0) {
            var12 = this.field_928[var2];
         }

         if(var12 < 0) {
            var12 += 255;
         }

         if((GLLib.field_72 & 8192) != 0) {
            var13 = GLLib.method_95();
            var12 = var12 * var13 / 100;
         }

         var3 = var10000 - var12;
         var4 = var10;
      }

      var10 = var103[0];
      var6 = var11 = var103[1];
      var12 = var10;
      var13 = var6;
      int var14 = var10;
      int var15;
      if((var5 & 4) != 0) {
         var15 = var6;
         var6 = var10;
         var12 = var15;
      }

      int var8;
      int var10001;
      int var10002;
      if((this.field_978 != null?this.field_978[var2]:0) != 0 && var1 != null) {
         int var102 = var4;
         int var101 = var3;
         var13 = var6;
         var11 = var2;
         var2 = this.field_980[var2];
         var1.setColor(var2);
         int var64;
         int var68;
         switch(this.field_978[var11]) {
         case 1:
            --var12;
            var13 = var6 - 1;
            GLLib.method_44(var1, var3, var4, var12, var13, true);
            return;
         case 2:
            if((var2 & -16777216) != -16777216 && (var2 & -16777216) != 0) {
               GLLib.method_86(var2);
               GLLib.method_87(var1, var3, var4, var12, var6);
               return;
            }

            GLLib.method_43(var1, var3, var4, var12, var6, true);
            return;
         case 3:
         case 4:
            if((var5 = this.method_983(var11)) != -1) {
               var6 = this.field_930[var5];
               var7 = this.field_930[var5 + 1];
               if((var9 & 1) != 0) {
                  var6 = 90 - var6;
               }

               if((var9 & 2) != 0) {
                  var6 = -var6;
                  var7 = -var7;
               }

               if((var9 & 4) != 0) {
                  var6 -= 90;
               }

               if(this.field_978[var11] == 3) {
                  GLLib.method_46(var1, var3, var4, var12, var13, var6, var7, true);
                  break;
               }

               GLLib.method_45(var1, var3, var4, var12, var13, var6, var7, true);
            }

            return;
         case 6:
         case 7:
            if((var5 = this.method_983(var11)) != -1) {
               var6 = this.field_930[var5];
               var7 = this.field_930[var5 + 1];
               var8 = this.field_930[var5 + 2];
               var64 = this.field_930[var5 + 3];
               if((var9 & 1) != 0) {
                  var6 = -var6;
                  var8 = -var8;
                  var101 = var3 + (Math.abs(var6) > Math.abs(var8)?Math.abs(var6):Math.abs(var8));
               }

               if((var9 & 2) != 0) {
                  var7 = -var7;
                  var64 = -var64;
                  var102 = var4 + (Math.abs(var7) > Math.abs(var64)?Math.abs(var7):Math.abs(var64));
               }

               if((var9 & 4) != 0) {
                  int var67 = Math.abs(var7) > Math.abs(var64)?Math.abs(var7):Math.abs(var64);
                  var68 = var102 - var4;
                  var102 = var4 + (var101 - var3);
                  var101 = var3 - var68 + var67;
                  int var69 = var6;
                  var6 = -var7;
                  var7 = var69;
                  var69 = var8;
                  var8 = -var64;
                  var64 = var69;
               }

               int var10003;
               if(this.field_978[var11] == 6) {
                  var10003 = var101 + var6;
                  int var77 = var102 + var7;
                  int var76 = var10003;
                  GLLib.method_42(var1, var101, var102, var76, var77, true);
                  var10001 = var101 + var6;
                  var10002 = var102 + var7;
                  var10003 = var101 + var8;
                  int var81 = var102 + var64;
                  int var80 = var10003;
                  int var79 = var10002;
                  GLLib.method_42(var1, var10001, var79, var80, var81, true);
                  var10003 = var101 + var8;
                  int var85 = var102 + var64;
                  int var84 = var10003;
                  GLLib.method_42(var1, var101, var102, var84, var85, true);
                  break;
               }

               var10003 = var101 + var6;
               int var10004 = var102 + var7;
               int var10005 = var101 + var8;
               int var99 = var102 + var64;
               int var98 = var10005;
               int var97 = var10004;
               int var96 = var10003;
               GLLib.method_50(var1, var101, var102, var96, var97, var98, var99, true);
            }

            return;
         case 8:
            var5 = var3;
            var6 = var3 + var12;
            var7 = var4;
            var8 = var4 + var13;
            if((var9 & 1) != 0) {
               var5 = var6;
               var6 = var3;
            }

            if((var9 & 2) != 0) {
               var7 = var8;
               var8 = var4;
            }

            if((var9 & 4) != 0) {
               var64 = var5;
               var5 = var6;
               var6 = var64;
            }

            GLLib.method_42(var1, var5, var7, var6, var8, true);
            return;
         case 9:
            if((var5 = this.method_983(var11)) != -1) {
               var6 = var2;
               var7 = this.field_930[var5] & '\uffff' | this.field_930[var5 + 1] << 16 & -65536;
               short var105 = this.field_930[var5 + 2];
               if((var9 & 1) != 0 && var105 < 2) {
                  var6 = var7;
                  var7 = var2;
               }

               if((var9 & 2) != 0 && var105 > 1) {
                  var68 = var6;
                  var6 = var7;
                  var7 = var68;
               }

               byte var107;
               if(var105 == 0) {
                  var107 = 4;
               } else if(var105 == 1) {
                  var107 = 8;
               } else if(var105 == 2) {
                  var107 = 16;
               } else {
                  var107 = 32;
               }

               if((var9 & 4) != 0) {
                  if(var107 == 4) {
                     var107 = 16;
                  } else if(var107 == 8) {
                     var107 = 32;
                  } else if(var107 == 16) {
                     var107 = 8;
                  } else if(var107 == 32) {
                     var107 = 4;
                  }
               }

               if(var6 >>> 24 != 255 || var7 >>> 24 != 255) {
                  GLLib.method_103(var1, var3, var4, var12, var13, var6, var7, var107);
                  return;
               }

               GLLib.method_101(var1, var3, var4, var12, var13, var6, var7, var107);
            }
         case 5:
         default:
            return;
         }
      } else {
         if((GLLib.field_72 & 8192) != 0 && GLLib.field_73[13][6] % 360 != 0) {
            var15 = (GLLib.field_72 & 8192) != 0?GLLib.field_73[13][6]:GLLib.field_73[16][0];
            if((var5 & 4) != 0) {
               var5 &= -5;
               var15 += 90 * GLLib.field_38 / 360;
            }

            int var16 = GLLib.method_17(GLLib.field_39 - var15);
            int var17 = GLLib.method_17(var15);
            GLLib.method_99(var16, var17, var6, var12, field_985);
            var17 = field_985[0];
            int var18 = field_985[1];
            var16 = var6 - GLLib.field_73[16][2];
            int var19 = GLLib.field_73[16][1];
            if((GLLib.field_72 & 8192) != 0) {
               var16 = var16 * GLLib.method_94() / 100;
               var19 = var19 * GLLib.method_95() / 100;
               var6 = var6 * GLLib.method_94() / 100;
               var12 = var12 * GLLib.method_95() / 100;
               var17 = var17 * GLLib.method_94() / 100;
               var18 = var18 * GLLib.method_94() / 100;
            }

            var10001 = (var6 >> 1) - var16;
            var10002 = (var12 >> 1) - var19;
            int[] var22 = field_985;
            int var21 = var10002;
            int var20 = var10001;
            int var23 = GLLib.method_17(GLLib.field_39 - var15);
            var15 = GLLib.method_17(var15);
            GLLib.method_98(var23, var15, var20, var21, var22);
            var3 += field_985[0] - var17 / 2 + var16;
            var4 += field_985[1] - var18 / 2 + var19;
         }

         if(var6 <= 0 || var12 <= 0) {
            return;
         }

         if(var1 == null || method_978(var1, var3, var4, var12, var6)) {
            class_11 var112 = null;
            if((this._bs_flags & (BS_MODULE_IMAGES_TC_BMP|BS_MODULE_IMAGES)) != 0) {
               if(this.field_971 != null && this.field_971[this.field_962] != null) {
                  var112 = this.field_971[this.field_962][var2];
               }

               boolean var113 = this.field_963;
               if(var112 == null) {
                  int[] var114;
                  if(GLLib.field_71 && (GLLib.field_72 & 1046496) != 0 && this.method_944()) {
                     if(this.method_946(var2, var3, var4, var5)) {
                        return;
                     }

                     var114 = this.method_954(var2);
                  } else {
                     var114 = this.method_954(var2);
                  }

                  if(var114 != null) {
                     boolean var116 = false;
                     boolean var108;
                     if(GLLib.field_71 && (GLLib.field_72 & 1046496) != 0) {
                        if(this.method_946(var2, var3, var4, var5)) {
                           return;
                        }

                        if(!(var108 = this.method_944())) {
                           var5 = field_977[var9 & 7] | var9 & -8;
                        }

                        var114 = GLLib.method_100(var1, var114, var3, var4, var10, var13, var108?4:var5, var113, false, !var108);
                        if(this.method_947(var2, var3, var4, var114, var5) || var114 == null) {
                           return;
                        }

                        var113 = GLLib.field_74;
                        var5 = 0;
                        var3 = GLLib.field_77;
                        var4 = GLLib.field_78;
                        var6 = GLLib.field_79;
                        var12 = GLLib.field_80;
                        var13 = var6;
                        var14 = var12;
                        GLLib.method_51(var1, var114, 0, var6, var3, var4, var6, var12, var113, var113, 0, -1, false);
                        var116 = true;
                     }

                     if(this.field_990 >= 0) {
                        if(this.field_971 == null) {
                           this.field_971 = new class_11[this.field_960][];

                           for(var10 = 0; var10 < this.field_960; ++var10) {
                              this.field_971[var10] = new class_11[this.field_927];
                           }
                        }

                        if(!var116) {
                           int[] var109 = new int[var6 * var12];
                           var7 = var12;
                           var11 = var6;
                           if((var5 & 4) != 0) {
                              var7 = var6;
                              var11 = var12;
                           }

                           for(var8 = 0; var8 < var7; ++var8) {
                              for(var9 = 0; var9 < var11; ++var9) {
                                 var109[var11 - var9 - 1 + var8 * var11] = var114[var8 + var7 * var9];
                              }
                           }

                           if((var5 & 4) != 0) {
                              var108 = this.field_963;
                              var112 = class_11.method_1185(var109, var12, var6, var108);
                           } else {
                              var108 = this.field_963;
                              var112 = class_11.method_1185(var109, var6, var12, var108);
                           }
                        } else if((var5 & 4) != 0) {
                           var108 = this.field_963;
                           var112 = class_11.method_1185(var114, var12, var6, var108);
                        } else {
                           var108 = this.field_963;
                           var112 = class_11.method_1185(var114, var6, var12, var108);
                        }

                        this.method_952(var2, var112);
                        if(!var116) {
                           if(var112 != null) {
                              if(field_974[var5 & 7] == 0) {
                                 GLLib.method_48(var1, var112, var3, var4, 20, false);
                                 return;
                              }

                              if((var5 & 4) != 0) {
                                 GLLib.method_49(var1, var112, 0, 0, var12, var6, field_974[var5 & 7], var3, var4, 20, false);
                                 return;
                              }

                              GLLib.method_49(var1, var112, 0, 0, var6, var12, field_974[var5 & 7], var3, var4, 20, false);
                           }

                           return;
                        }
                     } else if(!var116) {
                        GLLib.method_51(var1, var114, 0, var14, var3, var4, var14, var13, var113, var113, var9, -1, true);
                        return;
                     }
                  }
               } else if(GLLib.field_71 && (GLLib.field_72 & 1046496) != 0) {
                  if(!this.method_946(var2, var3, var4, var5)) {
                     boolean var117 = this.method_944();
                     int var10006 = var117?0:var5;
                     boolean var110 = !var117;
                     var12 = var10006;
                     int[] var111 = method_939((int[])null);
                     GLLib.method_52(var112, var111, 0, var13, 0, 0, var13, var10);
                     int[] var115 = GLLib.method_100(var1, var111, var3, var4, var13, var10, var12, var113, false, var110);
                     if(!this.method_947(var2, var3, var4, var115, var5) && var115 != null) {
                        var113 = GLLib.field_74;
                        var3 = GLLib.field_77;
                        var4 = GLLib.field_78;
                        var6 = GLLib.field_79;
                        var12 = GLLib.field_80;
                        GLLib.method_51(var1, var115, 0, var6, var3, var4, var6, var12, var113, true, 0, -1, false);
                        return;
                     }
                  }
               } else {
                  this.method_952(var2, var112);
                  if(var112 != null) {
                     if(field_974[var5 & 7] == 0) {
                        GLLib.method_48(var1, var112, var3, var4, 20, false);
                        return;
                     }

                     GLLib.method_49(var1, var112, 0, 0, var11, var10, field_974[var5 & 7], var3, var4, 20, false);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: a (int[], int, int, int, int[]) int[]
   static final int[] method_985(int[] var0, int var1, int var2, int var3, int[] var4) {
      if((var3 & 7) == 0) {
         return var0;
      } else {
         var4 = method_939(var0);
         int var5 = 0;
         int var6 = 0;
         int var7;
         int var8;
         switch(var3 & 7) {
         case 1:
            var5 = var1 * var2;
            var6 = var1 * (var2 - 1);
            var7 = var2;

            while(true) {
               --var7;
               if(var7 < 0) {
                  return var4;
               }

               var3 = var1;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     var6 -= var1 << 1;
                     break;
                  }

                  --var5;
                  var4[var5] = var0[var6++];
               }
            }
         case 2:
            var5 = (var2 - 1) * var1;
            var7 = var2;

            while(true) {
               --var7;
               if(var7 < 0) {
                  return var4;
               }

               System.arraycopy(var0, var6, var4, var5, var1);
               var5 -= var1;
               var6 += var1;
            }
         case 3:
            for(var6 = var1 * var2 - 1; var6 >= 0; var4[var5++] = var0[var6--]) {
               ;
            }

            return var4;
         case 4:
            var5 = var1 * var2;
            var7 = var2;

            while(true) {
               --var7;
               if(var7 < 0) {
                  return var4;
               }

               var6 = var7;
               var3 = var1;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     break;
                  }

                  --var5;
                  var4[var5] = var0[var6];
                  var6 += var2;
               }
            }
         case 5:
            var5 = var1 * var2;
            var7 = var2;

            while(true) {
               --var7;
               if(var7 < 0) {
                  return var4;
               }

               var6 = var2 - 1 - var7;
               var3 = var1;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     break;
                  }

                  --var5;
                  var4[var5] = var0[var6];
                  var6 += var2;
               }
            }
         case 6:
            var8 = (var5 = var1 * var2) - 1;
            var7 = var2;

            while(true) {
               --var7;
               if(var7 < 0) {
                  return var4;
               }

               var6 = var8--;
               var3 = var1;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     break;
                  }

                  --var5;
                  var4[var5] = var0[var6];
                  var6 -= var2;
               }
            }
         case 7:
            var8 = (var5 = var1 * var2) - var2;
            var7 = var2;

            while(true) {
               --var7;
               if(var7 < 0) {
                  break;
               }

               var6 = var8++;
               var3 = var1;

               while(true) {
                  --var3;
                  if(var3 < 0) {
                     break;
                  }

                  --var5;
                  var4[var5] = var0[var6];
                  var6 -= var2;
               }
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: b (int[]) int[]
   static final int[] method_986(int[] var0) {
      return method_939(var0);
   }

   // $FF: renamed from: <init> () void
   public ASprite() {
      super();
      this.field_990 = -1;
      this.field_1003 = false;
      this.field_1004 = false;
      this.field_1007 = -1;
   }
}
