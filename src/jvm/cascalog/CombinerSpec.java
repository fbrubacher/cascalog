/*
    Copyright 2010 Nathan Marz
 
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
 
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
 
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package cascalog;

import java.io.Serializable;


public class CombinerSpec implements Serializable {
    public Object[] init_spec;
    public Object[] combiner_spec;
    public Object[] extractor_spec;

    public CombinerSpec(Object[] init_spec, Object[] combiner_spec) {
        this(init_spec, combiner_spec, null);
    }
    
    public CombinerSpec(Object[] init_spec, Object[] combiner_spec, Object[] extractor_spec) {
        this.init_spec = init_spec;
        this.combiner_spec = combiner_spec;
        this.extractor_spec = extractor_spec;
    }
}
