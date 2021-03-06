/*
 * Copyright 2006 - 2013
 *     Stefan Balev     <stefan.balev@graphstream-project.org>
 *     Julien Baudry    <julien.baudry@graphstream-project.org>
 *     Antoine Dutot    <antoine.dutot@graphstream-project.org>
 *     Yoann Pigné      <yoann.pigne@graphstream-project.org>
 *     Guilhelm Savin   <guilhelm.savin@graphstream-project.org>
 * 
 * This file is part of GraphStream <http://graphstream-project.org>.
 * 
 * GraphStream is a library whose purpose is to handle static or dynamic
 * graph, create them from scratch, file or any source and display them.
 * 
 * This program is free software distributed under the terms of two licenses, the
 * CeCILL-C license that fits European law, and the GNU Lesser General Public
 * License. You can  use, modify and/ or redistribute the software under the terms
 * of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
 * URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
 */
package org.graphstream.stream.file.pajek;

import org.graphstream.util.parser.SimpleCharStream;
import org.graphstream.util.parser.Token;
import org.graphstream.util.parser.TokenMgrError;

/** Token Manager. */
public class PajekParserTokenManager implements PajekParserConstants {

	/** Debug output. */
	public java.io.PrintStream debugStream = System.out;

	/** Set debug output. */
	public void setDebugStream(java.io.PrintStream ds) {
		debugStream = ds;
	}

	private final int jjStopStringLiteralDfa_0(int pos, long active0) {
		switch (pos) {
		case 0:
			if ((active0 & 0x3c03023660000L) != 0L) {
				jjmatchedKind = 53;
				return 11;
			}
			if ((active0 & 0x20000000000L) != 0L)
				return 17;
			if ((active0 & 0x1c3dcfdc180000L) != 0L)
				return 11;
			return -1;
		case 1:
			if ((active0 & 0x30077e0000L) != 0L) {
				if (jjmatchedPos != 1) {
					jjmatchedKind = 53;
					jjmatchedPos = 1;
				}
				return 11;
			}
			if ((active0 & 0xfe80fe0000000L) != 0L)
				return 11;
			return -1;
		case 2:
			if ((active0 & 0x1004100000L) != 0L)
				return 11;
			if ((active0 & 0x28036e0000L) != 0L) {
				jjmatchedKind = 53;
				jjmatchedPos = 2;
				return 11;
			}
			return -1;
		case 3:
			if ((active0 & 0x36e0000L) != 0L) {
				jjmatchedKind = 53;
				jjmatchedPos = 3;
				return 11;
			}
			if ((active0 & 0x2800000000L) != 0L)
				return 11;
			return -1;
		case 4:
			if ((active0 & 0x3260000L) != 0L) {
				if (jjmatchedPos != 4) {
					jjmatchedKind = 53;
					jjmatchedPos = 4;
				}
				return 11;
			}
			if ((active0 & 0x480000L) != 0L)
				return 11;
			return -1;
		case 5:
			if ((active0 & 0x3000000L) != 0L)
				return 11;
			if ((active0 & 0x260000L) != 0L) {
				if (jjmatchedPos != 5) {
					jjmatchedKind = 53;
					jjmatchedPos = 5;
				}
				return 11;
			}
			return -1;
		case 6:
			if ((active0 & 0x60000L) != 0L)
				return 11;
			if ((active0 & 0x200000L) != 0L) {
				jjmatchedKind = 53;
				jjmatchedPos = 6;
				return 11;
			}
			return -1;
		case 7:
			if ((active0 & 0x200000L) != 0L)
				return 11;
			return -1;
		default:
			return -1;
		}
	}

	private final int jjStartNfa_0(int pos, long active0) {
		return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
	}

	private int jjStopAtPos(int pos, int kind) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		return pos + 1;
	}

	private int jjMoveStringLiteralDfa0_0() {
		switch (curChar) {
		case 42:
			return jjMoveStringLiteralDfa1_0(0xfe00L);
		case 65:
		case 97:
			jjmatchedKind = 42;
			return jjMoveStringLiteralDfa1_0(0xc080000000000L);
		case 66:
		case 98:
			jjmatchedKind = 52;
			return jjMoveStringLiteralDfa1_0(0xc0100000L);
		case 67:
		case 99:
			jjmatchedKind = 38;
			return jjMoveStringLiteralDfa1_0(0x80000L);
		case 68:
		case 100:
			return jjMoveStringLiteralDfa1_0(0x40000L);
		case 69:
		case 101:
			return jjMoveStringLiteralDfa1_0(0x420000L);
		case 70:
		case 102:
			return jjMoveStringLiteralDfa1_0(0x3000000000L);
		case 72:
		case 104:
			return jjMoveStringLiteralDfa1_0(0xc00000000000L);
		case 73:
		case 105:
			return jjMoveStringLiteralDfa1_0(0x20000000L);
		case 75:
		case 107:
			return jjMoveStringLiteralDfa1_0(0x3000000000000L);
		case 76:
		case 108:
			jjmatchedKind = 44;
			return jjMoveStringLiteralDfa1_0(0x200f00000000L);
		case 80:
		case 112:
			jjmatchedKind = 39;
			return jjMoveStringLiteralDfa1_0(0x4000000L);
		case 81:
		case 113:
			return jjStartNfaWithStates_0(0, 28, 11);
		case 82:
		case 114:
			return jjStartNfaWithStates_0(0, 27, 11);
		case 83:
		case 115:
			return jjStartNfaWithStates_0(0, 41, 17);
		case 84:
		case 116:
			return jjMoveStringLiteralDfa1_0(0x200000L);
		case 87:
		case 119:
			return jjStartNfaWithStates_0(0, 40, 11);
		case 88:
		case 120:
			return jjMoveStringLiteralDfa1_0(0x1000000L);
		case 89:
		case 121:
			return jjMoveStringLiteralDfa1_0(0x2000000L);
		default:
			return jjMoveNfa_0(0, 0);
		}
	}

	private int jjMoveStringLiteralDfa1_0(long active0) {
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(0, active0);
			return 1;
		}
		switch (curChar) {
		case 49:
			if ((active0 & 0x400000000000L) != 0L)
				return jjStartNfaWithStates_0(1, 46, 11);
			else if ((active0 & 0x1000000000000L) != 0L)
				return jjStartNfaWithStates_0(1, 48, 11);
			else if ((active0 & 0x4000000000000L) != 0L)
				return jjStartNfaWithStates_0(1, 50, 11);
			break;
		case 50:
			if ((active0 & 0x800000000000L) != 0L)
				return jjStartNfaWithStates_0(1, 47, 11);
			else if ((active0 & 0x2000000000000L) != 0L)
				return jjStartNfaWithStates_0(1, 49, 11);
			else if ((active0 & 0x8000000000000L) != 0L)
				return jjStartNfaWithStates_0(1, 51, 11);
			break;
		case 95:
			return jjMoveStringLiteralDfa2_0(active0, 0x3000000L);
		case 65:
		case 97:
			if ((active0 & 0x200000000L) != 0L)
				return jjStartNfaWithStates_0(1, 33, 11);
			return jjMoveStringLiteralDfa2_0(active0, 0x4800L);
		case 67:
		case 99:
			if ((active0 & 0x20000000L) != 0L)
				return jjStartNfaWithStates_0(1, 29, 11);
			else if ((active0 & 0x40000000L) != 0L)
				return jjStartNfaWithStates_0(1, 30, 11);
			else if ((active0 & 0x100000000L) != 0L)
				return jjStartNfaWithStates_0(1, 32, 11);
			break;
		case 69:
		case 101:
			return jjMoveStringLiteralDfa2_0(active0, 0x3000L);
		case 72:
		case 104:
			return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
		case 73:
		case 105:
			return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
		case 76:
		case 108:
			return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
		case 77:
		case 109:
			return jjMoveStringLiteralDfa2_0(active0, 0x408000L);
		case 78:
		case 110:
			return jjMoveStringLiteralDfa2_0(active0, 0x200L);
		case 79:
		case 111:
			return jjMoveStringLiteralDfa2_0(active0, 0x3000100000L);
		case 80:
		case 112:
			if ((active0 & 0x80000000000L) != 0L)
				return jjStartNfaWithStates_0(1, 43, 11);
			else if ((active0 & 0x200000000000L) != 0L) {
				jjmatchedKind = 45;
				jjmatchedPos = 1;
			}
			return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
		case 82:
		case 114:
			if ((active0 & 0x400000000L) != 0L)
				return jjStartNfaWithStates_0(1, 34, 11);
			return jjMoveStringLiteralDfa2_0(active0, 0x280000L);
		case 86:
		case 118:
			return jjMoveStringLiteralDfa2_0(active0, 0x400L);
		case 87:
		case 119:
			if ((active0 & 0x80000000L) != 0L)
				return jjStartNfaWithStates_0(1, 31, 11);
			break;
		default:
			break;
		}
		return jjStartNfa_0(0, active0);
	}

	private int jjMoveStringLiteralDfa2_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(0, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(1, active0);
			return 2;
		}
		switch (curChar) {
		case 65:
		case 97:
			return jjMoveStringLiteralDfa3_0(active0, 0x48000L);
		case 68:
		case 100:
			return jjMoveStringLiteralDfa3_0(active0, 0x3000L);
		case 69:
		case 101:
			return jjMoveStringLiteralDfa3_0(active0, 0x600L);
		case 70:
		case 102:
			return jjMoveStringLiteralDfa3_0(active0, 0x3000000L);
		case 72:
		case 104:
			return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
		case 73:
		case 105:
			if ((active0 & 0x4000000L) != 0L)
				return jjStartNfaWithStates_0(2, 26, 11);
			return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
		case 76:
		case 108:
			return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
		case 78:
		case 110:
			return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
		case 79:
		case 111:
			return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
		case 80:
		case 112:
			return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
		case 82:
		case 114:
			return jjMoveStringLiteralDfa3_0(active0, 0x4800L);
		case 83:
		case 115:
			if ((active0 & 0x1000000000L) != 0L)
				return jjStartNfaWithStates_0(2, 36, 11);
			break;
		case 88:
		case 120:
			if ((active0 & 0x100000L) != 0L)
				return jjStartNfaWithStates_0(2, 20, 11);
			break;
		default:
			break;
		}
		return jjStartNfa_0(1, active0);
	}

	private int jjMoveStringLiteralDfa3_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(1, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(2, active0);
			return 3;
		}
		switch (curChar) {
		case 65:
		case 97:
			return jjMoveStringLiteralDfa4_0(active0, 0x3200000L);
		case 67:
		case 99:
			return jjMoveStringLiteralDfa4_0(active0, 0x4800L);
		case 71:
		case 103:
			return jjMoveStringLiteralDfa4_0(active0, 0x3000L);
		case 73:
		case 105:
			if ((active0 & 0x800000000L) != 0L)
				return jjStartNfaWithStates_0(3, 35, 11);
			return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
		case 77:
		case 109:
			return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
		case 82:
		case 114:
			return jjMoveStringLiteralDfa4_0(active0, 0x400L);
		case 83:
		case 115:
			return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
		case 84:
		case 116:
			if ((active0 & 0x2000000000L) != 0L)
				return jjStartNfaWithStates_0(3, 37, 11);
			return jjMoveStringLiteralDfa4_0(active0, 0x408200L);
		default:
			break;
		}
		return jjStartNfa_0(2, active0);
	}

	private int jjMoveStringLiteralDfa4_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(2, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(3, active0);
			return 4;
		}
		switch (curChar) {
		case 67:
		case 99:
			return jjMoveStringLiteralDfa5_0(active0, 0x3000000L);
		case 69:
		case 101:
			return jjMoveStringLiteralDfa5_0(active0, 0x3000L);
		case 78:
		case 110:
			return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
		case 79:
		case 111:
			return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
		case 80:
		case 112:
			return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
		case 82:
		case 114:
			return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
		case 83:
		case 115:
			if ((active0 & 0x800L) != 0L) {
				jjmatchedKind = 11;
				jjmatchedPos = 4;
			} else if ((active0 & 0x80000L) != 0L)
				return jjStartNfaWithStates_0(4, 19, 11);
			return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
		case 84:
		case 116:
			return jjMoveStringLiteralDfa5_0(active0, 0x400L);
		case 87:
		case 119:
			return jjMoveStringLiteralDfa5_0(active0, 0x200L);
		case 89:
		case 121:
			if ((active0 & 0x400000L) != 0L)
				return jjStartNfaWithStates_0(4, 22, 11);
			break;
		default:
			break;
		}
		return jjStartNfa_0(3, active0);
	}

	private int jjMoveStringLiteralDfa5_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(3, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(4, active0);
			return 5;
		}
		switch (curChar) {
		case 71:
		case 103:
			return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
		case 73:
		case 105:
			return jjMoveStringLiteralDfa6_0(active0, 0x8400L);
		case 76:
		case 108:
			return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
		case 78:
		case 110:
			return jjMoveStringLiteralDfa6_0(active0, 0x40000L);
		case 79:
		case 111:
			return jjMoveStringLiteralDfa6_0(active0, 0x200L);
		case 83:
		case 115:
			if ((active0 & 0x1000L) != 0L) {
				jjmatchedKind = 12;
				jjmatchedPos = 5;
			}
			return jjMoveStringLiteralDfa6_0(active0, 0x22000L);
		case 84:
		case 116:
			if ((active0 & 0x1000000L) != 0L)
				return jjStartNfaWithStates_0(5, 24, 11);
			else if ((active0 & 0x2000000L) != 0L)
				return jjStartNfaWithStates_0(5, 25, 11);
			break;
		default:
			break;
		}
		return jjStartNfa_0(4, active0);
	}

	private int jjMoveStringLiteralDfa6_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(4, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(5, active0);
			return 6;
		}
		switch (curChar) {
		case 67:
		case 99:
			return jjMoveStringLiteralDfa7_0(active0, 0x400L);
		case 68:
		case 100:
			if ((active0 & 0x40000L) != 0L)
				return jjStartNfaWithStates_0(6, 18, 11);
			break;
		case 69:
		case 101:
			if ((active0 & 0x20000L) != 0L)
				return jjStartNfaWithStates_0(6, 17, 11);
			break;
		case 73:
		case 105:
			return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
		case 76:
		case 108:
			return jjMoveStringLiteralDfa7_0(active0, 0x202000L);
		case 82:
		case 114:
			return jjMoveStringLiteralDfa7_0(active0, 0x200L);
		case 88:
		case 120:
			if ((active0 & 0x8000L) != 0L)
				return jjStopAtPos(6, 15);
			break;
		default:
			break;
		}
		return jjStartNfa_0(5, active0);
	}

	private int jjMoveStringLiteralDfa7_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(5, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(6, active0);
			return 7;
		}
		switch (curChar) {
		case 69:
		case 101:
			if ((active0 & 0x200000L) != 0L)
				return jjStartNfaWithStates_0(7, 21, 11);
			return jjMoveStringLiteralDfa8_0(active0, 0x400L);
		case 73:
		case 105:
			return jjMoveStringLiteralDfa8_0(active0, 0x2000L);
		case 75:
		case 107:
			if ((active0 & 0x200L) != 0L)
				return jjStopAtPos(7, 9);
			break;
		case 83:
		case 115:
			return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
		default:
			break;
		}
		return jjStartNfa_0(6, active0);
	}

	private int jjMoveStringLiteralDfa8_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(6, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(7, active0);
			return 8;
		}
		switch (curChar) {
		case 83:
		case 115:
			if ((active0 & 0x400L) != 0L)
				return jjStopAtPos(8, 10);
			return jjMoveStringLiteralDfa9_0(active0, 0x2000L);
		case 84:
		case 116:
			if ((active0 & 0x4000L) != 0L)
				return jjStopAtPos(8, 14);
			break;
		default:
			break;
		}
		return jjStartNfa_0(7, active0);
	}

	private int jjMoveStringLiteralDfa9_0(long old0, long active0) {
		if (((active0 &= old0)) == 0L)
			return jjStartNfa_0(7, old0);
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			jjStopStringLiteralDfa_0(8, active0);
			return 9;
		}
		switch (curChar) {
		case 84:
		case 116:
			if ((active0 & 0x2000L) != 0L)
				return jjStopAtPos(9, 13);
			break;
		default:
			break;
		}
		return jjStartNfa_0(8, active0);
	}

	private int jjStartNfaWithStates_0(int pos, int kind, int state) {
		jjmatchedKind = kind;
		jjmatchedPos = pos;
		try {
			curChar = input_stream.readChar();
		} catch (java.io.IOException e) {
			return pos + 1;
		}
		return jjMoveNfa_0(state, pos + 1);
	}

	static final long[] jjbitVec0 = { 0x0L, 0x0L, 0xffffffffffffffffL,
			0xffffffffffffffffL };

	private int jjMoveNfa_0(int startState, int curPos) {
		int startsAt = 0;
		jjnewStateCnt = 26;
		int i = 1;
		jjstateSet[0] = startState;
		int kind = 0x7fffffff;
		for (;;) {
			if (++jjround == 0x7fffffff)
				ReInitRounds();
			if (curChar < 64) {
				long l = 1L << curChar;
				do {
					switch (jjstateSet[--i]) {
					case 0:
						if ((0x3ff400000000000L & l) != 0L) {
							if (kind > 53)
								kind = 53;
							jjCheckNAdd(11);
						} else if ((0x280000000000L & l) != 0L)
							jjCheckNAddTwoStates(21, 22);
						else if ((0x2400L & l) != 0L) {
							if (kind > 3)
								kind = 3;
						} else if (curChar == 37)
							jjCheckNAddTwoStates(8, 9);
						else if (curChar == 39)
							jjCheckNAddTwoStates(5, 6);
						else if (curChar == 34)
							jjCheckNAddTwoStates(2, 3);
						if ((0x3ff000000000000L & l) != 0L) {
							if (kind > 6)
								kind = 6;
							jjCheckNAddStates(0, 2);
						}
						break;
					case 17:
					case 11:
						if ((0x7ff600800000000L & l) == 0L)
							break;
						if (kind > 53)
							kind = 53;
						jjCheckNAdd(11);
						break;
					case 1:
						if (curChar == 34)
							jjCheckNAddTwoStates(2, 3);
						break;
					case 2:
						if ((0xfffffffbffffffffL & l) != 0L)
							jjCheckNAddTwoStates(2, 3);
						break;
					case 3:
						if (curChar == 34 && kind > 8)
							kind = 8;
						break;
					case 4:
						if (curChar == 39)
							jjCheckNAddTwoStates(5, 6);
						break;
					case 5:
						if ((0xffffff7fffffffffL & l) != 0L)
							jjCheckNAddTwoStates(5, 6);
						break;
					case 6:
						if (curChar == 39 && kind > 8)
							kind = 8;
						break;
					case 7:
						if (curChar == 37)
							jjCheckNAddTwoStates(8, 9);
						break;
					case 8:
						if ((0xffffffffffffdbffL & l) != 0L)
							jjCheckNAddTwoStates(8, 9);
						break;
					case 9:
						if ((0x2400L & l) == 0L)
							break;
						if (kind > 16)
							kind = 16;
						jjCheckNAdd(9);
						break;
					case 10:
						if ((0x3ff400000000000L & l) == 0L)
							break;
						if (kind > 53)
							kind = 53;
						jjCheckNAdd(11);
						break;
					case 20:
						if ((0x280000000000L & l) != 0L)
							jjCheckNAddTwoStates(21, 22);
						break;
					case 21:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 6)
							kind = 6;
						jjCheckNAdd(21);
						break;
					case 22:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 7)
							kind = 7;
						jjCheckNAddTwoStates(22, 23);
						break;
					case 23:
						if (curChar == 46)
							jjCheckNAdd(24);
						break;
					case 24:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 7)
							kind = 7;
						jjCheckNAdd(24);
						break;
					case 25:
						if ((0x3ff000000000000L & l) == 0L)
							break;
						if (kind > 6)
							kind = 6;
						jjCheckNAddStates(0, 2);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else if (curChar < 128) {
				long l = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 0:
						if ((0x7fffffe07fffffeL & l) != 0L) {
							if (kind > 53)
								kind = 53;
							jjCheckNAdd(11);
						}
						if ((0x8000000080000L & l) != 0L)
							jjAddStates(3, 4);
						break;
					case 17:
						if ((0x7fffffe87ffffffL & l) != 0L) {
							if (kind > 53)
								kind = 53;
							jjCheckNAdd(11);
						}
						if ((0x20000000200L & l) != 0L)
							jjstateSet[jjnewStateCnt++] = 18;
						else if (curChar == 95)
							jjstateSet[jjnewStateCnt++] = 16;
						break;
					case 2:
						jjAddStates(5, 6);
						break;
					case 5:
						jjAddStates(7, 8);
						break;
					case 8:
						jjAddStates(9, 10);
						break;
					case 10:
						if ((0x7fffffe07fffffeL & l) == 0L)
							break;
						if (kind > 53)
							kind = 53;
						jjCheckNAdd(11);
						break;
					case 11:
						if ((0x7fffffe87ffffffL & l) == 0L)
							break;
						if (kind > 53)
							kind = 53;
						jjCheckNAdd(11);
						break;
					case 12:
						if ((0x8000000080000L & l) != 0L)
							jjAddStates(3, 4);
						break;
					case 13:
						if ((0x2000000020L & l) != 0L && kind > 23)
							kind = 23;
						break;
					case 14:
					case 18:
						if ((0x400000004000000L & l) != 0L)
							jjCheckNAdd(13);
						break;
					case 15:
						if ((0x20000000200L & l) != 0L)
							jjstateSet[jjnewStateCnt++] = 14;
						break;
					case 16:
						if ((0x8000000080000L & l) != 0L)
							jjstateSet[jjnewStateCnt++] = 15;
						break;
					case 19:
						if ((0x20000000200L & l) != 0L)
							jjstateSet[jjnewStateCnt++] = 18;
						break;
					default:
						break;
					}
				} while (i != startsAt);
			} else {
				int i2 = (curChar & 0xff) >> 6;
				long l2 = 1L << (curChar & 077);
				do {
					switch (jjstateSet[--i]) {
					case 2:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjAddStates(5, 6);
						break;
					case 5:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjAddStates(7, 8);
						break;
					case 8:
						if ((jjbitVec0[i2] & l2) != 0L)
							jjAddStates(9, 10);
						break;
					default:
						break;
					}
				} while (i != startsAt);
			}
			if (kind != 0x7fffffff) {
				jjmatchedKind = kind;
				jjmatchedPos = curPos;
				kind = 0x7fffffff;
			}
			++curPos;
			if ((i = jjnewStateCnt) == (startsAt = 26 - (jjnewStateCnt = startsAt)))
				return curPos;
			try {
				curChar = input_stream.readChar();
			} catch (java.io.IOException e) {
				return curPos;
			}
		}
	}

	static final int[] jjnextStates = { 21, 22, 23, 17, 19, 2, 3, 5, 6, 8, 9, };

	/** Token literal values. */
	public static final String[] jjstrLiteralImages = { "", null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, };

	/** Lexer state names. */
	public static final String[] lexStateNames = { "DEFAULT", };
	static final long[] jjtoToken = { 0x3fffffffffffc9L, };
	static final long[] jjtoSkip = { 0x6L, };
	protected SimpleCharStream input_stream;
	private final int[] jjrounds = new int[26];
	private final int[] jjstateSet = new int[52];
	protected char curChar;

	/** Constructor. */
	public PajekParserTokenManager(SimpleCharStream stream) {
		if (SimpleCharStream.staticFlag)
			throw new Error(
					"ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
		input_stream = stream;
	}

	/** Constructor. */
	public PajekParserTokenManager(SimpleCharStream stream, int lexState) {
		this(stream);
		SwitchTo(lexState);
	}

	/** Reinitialise parser. */
	public void ReInit(SimpleCharStream stream) {
		jjmatchedPos = jjnewStateCnt = 0;
		curLexState = defaultLexState;
		input_stream = stream;
		ReInitRounds();
	}

	private void ReInitRounds() {
		int i;
		jjround = 0x80000001;
		for (i = 26; i-- > 0;)
			jjrounds[i] = 0x80000000;
	}

	/** Reinitialise parser. */
	public void ReInit(SimpleCharStream stream, int lexState) {
		ReInit(stream);
		SwitchTo(lexState);
	}

	/** Switch to specified lex state. */
	public void SwitchTo(int lexState) {
		if (lexState >= 1 || lexState < 0)
			throw new TokenMgrError("Error: Ignoring invalid lexical state : "
					+ lexState + ". State unchanged.",
					TokenMgrError.INVALID_LEXICAL_STATE);
		else
			curLexState = lexState;
	}

	protected Token jjFillToken() {
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
	public Token getNextToken() {
		Token matchedToken;
		int curPos = 0;

		EOFLoop: for (;;) {
			try {
				curChar = input_stream.BeginToken();
			} catch (java.io.IOException e) {
				jjmatchedKind = 0;
				matchedToken = jjFillToken();
				return matchedToken;
			}

			try {
				input_stream.backup(0);
				while (curChar <= 32 && (0x100000200L & (1L << curChar)) != 0L)
					curChar = input_stream.BeginToken();
			} catch (java.io.IOException e1) {
				continue EOFLoop;
			}
			jjmatchedKind = 0x7fffffff;
			jjmatchedPos = 0;
			curPos = jjMoveStringLiteralDfa0_0();
			if (jjmatchedKind != 0x7fffffff) {
				if (jjmatchedPos + 1 < curPos)
					input_stream.backup(curPos - jjmatchedPos - 1);
				if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L) {
					matchedToken = jjFillToken();
					return matchedToken;
				} else {
					continue EOFLoop;
				}
			}
			int error_line = input_stream.getEndLine();
			int error_column = input_stream.getEndColumn();
			String error_after = null;
			boolean EOFSeen = false;
			try {
				input_stream.readChar();
				input_stream.backup(1);
			} catch (java.io.IOException e1) {
				EOFSeen = true;
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
				if (curChar == '\n' || curChar == '\r') {
					error_line++;
					error_column = 0;
				} else
					error_column++;
			}
			if (!EOFSeen) {
				input_stream.backup(1);
				error_after = curPos <= 1 ? "" : input_stream.GetImage();
			}
			throw new TokenMgrError(EOFSeen, curLexState, error_line,
					error_column, error_after, curChar,
					TokenMgrError.LEXICAL_ERROR);
		}
	}

	private void jjCheckNAdd(int state) {
		if (jjrounds[state] != jjround) {
			jjstateSet[jjnewStateCnt++] = state;
			jjrounds[state] = jjround;
		}
	}

	private void jjAddStates(int start, int end) {
		do {
			jjstateSet[jjnewStateCnt++] = jjnextStates[start];
		} while (start++ != end);
	}

	private void jjCheckNAddTwoStates(int state1, int state2) {
		jjCheckNAdd(state1);
		jjCheckNAdd(state2);
	}

	private void jjCheckNAddStates(int start, int end) {
		do {
			jjCheckNAdd(jjnextStates[start]);
		} while (start++ != end);
	}

}
