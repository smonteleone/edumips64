/* Token.java
 *
 * (c) 2008 Salvo Scellato
 *
 * This file is part of the EduMIPS64 project, and is released under the GNU
 * General Public License.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package edumips64.core.parser.tokens;
import edumips64.core.is.Instruction;

public abstract class Token{
    protected String buffer;
    protected int line;
    protected int column;
    
    public Token(String buffer, int line, int column){
        this.buffer = buffer;
        this.line = line;
        this.column = column;
    }

    public Token(String buffer, int line){
        this.buffer = buffer;
        this.line = line;
        this.column = 0;
    }

    public Token(String buffer){
        this.buffer = buffer;
        this.line = 0;
        this.column = 0;
    }

    public void setLine(int line){
        this.line = line;
    }

    public void setColumn(int column){
        this.column = column;
    }

    public boolean validate(char pattern){
        return false;
    }

    public String toString(){
        return  buffer;
    }

    public boolean isErrorToken(){
        return false;
    }

    public int getLine(){
        return line;
    }

    public int getColumn(){
        return column;
    }

    // TODO: abstract?
    public void addToParametersList(Instruction instr) throws ParameterException{}

    public String getBuffer() {
        return buffer;
    }
}




