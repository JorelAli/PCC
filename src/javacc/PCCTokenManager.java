/* PCCTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. PCCTokenManager.java */
package javacc;
import java.util.LinkedList;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.ByteArrayInputStream;
import java.nio.file.Files;
import java.io.InputStream;
import java.nio.charset.Charset;

/** Token Manager. */
@SuppressWarnings("unused")public class PCCTokenManager implements PCCConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 27);
      case 34:
         return jjStopAtPos(0, 1);
      case 43:
         return jjStopAtPos(0, 7);
      case 44:
         return jjStopAtPos(0, 6);
      case 45:
         return jjStopAtPos(0, 8);
      case 91:
         return jjStopAtPos(0, 4);
      case 93:
         return jjStopAtPos(0, 5);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 114;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  else if ((0x5000000000000000L & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                  }
                  else if (curChar == 33)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  else if (curChar == 61)
                  {
                     if (kind > 9)
                        kind = 9;
                  }
                  if (curChar == 62)
                     { jjCheckNAdd(2); }
                  else if (curChar == 60)
                     { jjCheckNAdd(2); }
                  break;
               case 1:
                  if ((0x5000000000000000L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 2:
                  if (curChar == 61 && kind > 10)
                     kind = 10;
                  break;
               case 3:
                  if (curChar == 60)
                     { jjCheckNAdd(2); }
                  break;
               case 4:
                  if (curChar == 62)
                     { jjCheckNAdd(2); }
                  break;
               case 23:
                  if (curChar == 33)
                     kind = 19;
                  break;
               case 32:
                  if ((0x3ff400000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAddTwoStates(32, 33); }
                  break;
               case 33:
                  if (curChar != 39)
                     break;
                  kind = 25;
                  { jjCheckNAdd(33); }
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 35:
                  if (curChar == 46)
                     { jjCheckNAdd(36); }
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  { jjCheckNAdd(36); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                     { jjCheckNAddTwoStates(32, 33); }
                  }
                  if (curChar == 65)
                     { jjAddStates(0, 3); }
                  else if (curChar == 73)
                     { jjCheckNAddStates(4, 7); }
                  else if (curChar == 69)
                     { jjAddStates(8, 11); }
                  else if (curChar == 105)
                     { jjCheckNAddTwoStates(85, 86); }
                  else if (curChar == 97)
                     { jjAddStates(12, 13); }
                  else if (curChar == 101)
                     { jjAddStates(14, 15); }
                  else if (curChar == 80)
                     { jjAddStates(16, 17); }
                  else if (curChar == 84)
                     { jjCheckNAddTwoStates(10, 60); }
                  else if (curChar == 83)
                     { jjAddStates(18, 19); }
                  else if (curChar == 76)
                     { jjAddStates(20, 21); }
                  else if (curChar == 66)
                     { jjCheckNAddTwoStates(18, 50); }
                  else if (curChar == 67)
                     { jjAddStates(22, 23); }
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 29;
                  else if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if (curChar == 98)
                     { jjCheckNAdd(18); }
                  else if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 116)
                     { jjCheckNAdd(10); }
                  else if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 5:
                  if (curChar == 116 && kind > 11)
                     kind = 11;
                  break;
               case 6:
               case 62:
                  if (curChar == 110)
                     { jjCheckNAdd(5); }
                  break;
               case 7:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 111 && kind > 13)
                     kind = 13;
                  break;
               case 11:
                  if (curChar == 116)
                     { jjCheckNAdd(10); }
                  break;
               case 12:
                  if (curChar == 116 && kind > 14)
                     kind = 14;
                  break;
               case 13:
               case 56:
                  if (curChar == 101)
                     { jjCheckNAdd(12); }
                  break;
               case 14:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 116 && kind > 15)
                     kind = 15;
                  break;
               case 16:
               case 52:
                  if (curChar == 101)
                     { jjCheckNAdd(15); }
                  break;
               case 17:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 101 && kind > 16)
                     kind = 16;
                  break;
               case 19:
                  if (curChar == 98)
                     { jjCheckNAdd(18); }
                  break;
               case 20:
                  if (curChar == 116 && kind > 19)
                     kind = 19;
                  break;
               case 21:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 22:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 24:
                  if (curChar == 116 && kind > 22)
                     kind = 22;
                  break;
               case 25:
               case 44:
                  if (curChar == 110)
                     { jjCheckNAdd(24); }
                  break;
               case 26:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
               case 32:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  { jjCheckNAddTwoStates(32, 33); }
                  break;
               case 37:
                  if (curChar == 67)
                     { jjAddStates(22, 23); }
                  break;
               case 38:
                  if (curChar == 84 && kind > 22)
                     kind = 22;
                  break;
               case 39:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 77)
                     jjstateSet[jjnewStateCnt++] = 40;
                  break;
               case 42:
                  if (curChar == 77)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 45:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 47:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 49:
                  if (curChar == 66)
                     { jjCheckNAddTwoStates(18, 50); }
                  break;
               case 50:
                  if (curChar == 69 && kind > 16)
                     kind = 16;
                  break;
               case 51:
                  if (curChar == 76)
                     { jjAddStates(20, 21); }
                  break;
               case 53:
                  if (curChar == 84 && kind > 15)
                     kind = 15;
                  break;
               case 54:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 55:
                  if (curChar == 83)
                     { jjAddStates(18, 19); }
                  break;
               case 57:
                  if (curChar == 84 && kind > 14)
                     kind = 14;
                  break;
               case 58:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 57;
                  break;
               case 59:
                  if (curChar == 84)
                     { jjCheckNAddTwoStates(10, 60); }
                  break;
               case 60:
                  if (curChar == 79 && kind > 13)
                     kind = 13;
                  break;
               case 61:
                  if (curChar == 80)
                     { jjAddStates(16, 17); }
                  break;
               case 63:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 62;
                  break;
               case 64:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if (curChar == 84 && kind > 11)
                     kind = 11;
                  break;
               case 66:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 65;
                  break;
               case 67:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 68:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if (curChar == 101)
                     { jjAddStates(14, 15); }
                  break;
               case 70:
                  if (curChar == 115 && kind > 9)
                     kind = 9;
                  break;
               case 71:
               case 88:
                  if (curChar == 108)
                     { jjCheckNAdd(70); }
                  break;
               case 72:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 71;
                  break;
               case 73:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 72;
                  break;
               case 74:
                  if (curChar == 113)
                     jjstateSet[jjnewStateCnt++] = 73;
                  break;
               case 75:
                  if (curChar == 102 && kind > 21)
                     kind = 21;
                  break;
               case 76:
               case 101:
                  if (curChar == 105)
                     { jjCheckNAdd(75); }
                  break;
               case 77:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 76;
                  break;
               case 78:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 77;
                  break;
               case 79:
                  if (curChar == 97)
                     { jjAddStates(12, 13); }
                  break;
               case 80:
                  if (curChar == 100 && kind > 12)
                     kind = 12;
                  break;
               case 81:
               case 110:
                  if (curChar == 100)
                     { jjCheckNAdd(80); }
                  break;
               case 82:
                  if (curChar == 100 && kind > 18)
                     kind = 18;
                  break;
               case 83:
               case 113:
                  if (curChar == 110)
                     { jjCheckNAdd(82); }
                  break;
               case 84:
                  if (curChar == 105)
                     { jjCheckNAddTwoStates(85, 86); }
                  break;
               case 85:
                  if (curChar == 115 && kind > 17)
                     kind = 17;
                  break;
               case 86:
                  if (curChar == 102 && kind > 20)
                     kind = 20;
                  break;
               case 87:
                  if (curChar == 69)
                     { jjAddStates(8, 11); }
                  break;
               case 89:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 88;
                  break;
               case 90:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 91:
                  if (curChar == 113)
                     jjstateSet[jjnewStateCnt++] = 90;
                  break;
               case 92:
                  if (curChar == 83 && kind > 9)
                     kind = 9;
                  break;
               case 93:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 92;
                  break;
               case 94:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 93;
                  break;
               case 95:
                  if (curChar == 85)
                     jjstateSet[jjnewStateCnt++] = 94;
                  break;
               case 96:
                  if (curChar == 81)
                     jjstateSet[jjnewStateCnt++] = 95;
                  break;
               case 97:
                  if (curChar == 70 && kind > 21)
                     kind = 21;
                  break;
               case 98:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 99:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 100:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 99;
                  break;
               case 102:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 101;
                  break;
               case 103:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 102;
                  break;
               case 104:
                  if (curChar == 73)
                     { jjCheckNAddStates(4, 7); }
                  break;
               case 105:
                  if (curChar == 83 && kind > 17)
                     kind = 17;
                  break;
               case 106:
                  if (curChar == 70 && kind > 20)
                     kind = 20;
                  break;
               case 107:
                  if (curChar == 65)
                     { jjAddStates(0, 3); }
                  break;
               case 108:
                  if (curChar == 68 && kind > 12)
                     kind = 12;
                  break;
               case 109:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 108;
                  break;
               case 111:
                  if (curChar == 68 && kind > 18)
                     kind = 18;
                  break;
               case 112:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 111;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 114 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_2()
{
   return jjMoveNfa_2(0, 0);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 2;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffffffffbffL & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                  }
                  else if (curChar == 10)
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  break;
               case 1:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     kind = 24;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 24;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 24)
                     kind = 24;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 2;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xfffffffbffffffffL & l) != 0L)
                  {
                     if (kind > 3)
                        kind = 3;
                  }
                  else if (curChar == 34)
                  {
                     if (kind > 2)
                        kind = 2;
                  }
                  break;
               case 1:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     kind = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 3)
                     kind = 3;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 2 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   109, 110, 112, 113, 85, 105, 106, 86, 91, 96, 100, 103, 81, 83, 74, 78, 
   64, 68, 56, 58, 52, 54, 43, 48, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\42", null, null, "\133", "\135", "\54", "\53", "\55", null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, "\12", null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public PCCTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public PCCTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream)
  {
	
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 114; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit( SimpleCharStream stream, int lexState)
  {
  
    ReInit( stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "STRING_STATE",
   "COMMENT_MODE",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2, 0, -1, 
   -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffffL, 
};
static final long[] jjtoSkip = {
   0x70000000L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[114];
    private final int[] jjstateSet = new int[2 * 114];

    
    protected int curChar;
}
