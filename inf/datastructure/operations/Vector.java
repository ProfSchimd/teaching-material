// Copyright 2022 Michele Schimd (ITIS C. Zuccante)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
 

/**
 * This interface defines the API for a <em>vector</em> data structure. A vector
 * is a structure allowing access of elements by <em>index</em> (<em>rank</em>).
 * 
 * The present interface uses {@link Object} references to allow the most flexible
 * use.
 * 
 * @version 0.1
 * @author Michele Schimd
 */

public interface Vector {

    /**
     * Inserts the given element at the end of the vector
     * @param o the element to insert
     */
    void insert(Object o);

    /**
     * Inserts the given element at the given position shifting to right any
     * subsequent element.
     * @param i the position of insertion
     * @param o the element to insert
     */
    void insert(int i, Object o);

    /**
     * Search for the given element returning the index of the element, if found -1 otherwise.
     * 
     * The comparison of elements uses <code>equals</code> method of objects, if more than one element
     * exists in the vector, the position of one of them is returned (which one is implementation
     * specific).
     * @param o the object to be searched
     * @return the position of the found element or -1 if not found.
     */
    int find(Object o);

    /**
     * Returns the element at the given position, <code>null</code> if the given position is out of range.
     * 
     * @param i the index of the element to retrieve
     * @return the element at the given position or  <code>null</code> if the index is invalid
     */
    Object get(int i);

    /**
     * Deletes and returns the element at the given position shifting to the left any subsequent element.
     * 
     * If the provided position is invalid (either negative or beyond the vector size), the operation
     * should have no effect and must return  <code>null</code>.
     * 
     * @param i the position of the element to delete
     * @return the deleted element, or  <code>null</code> if the given position is invalid
     */
    Object delete(int i);

    /**
     * Returns the number of elements stored in the vector
     * @return the number of stored elements.
     */
    int size();

    /**
     * Returns <code>true</code> if the vector has no element stored and <code>false</code> otherwise
     * @return <code>true</code> if no element is stored, <code>false</code>, otherwise.
     */
    boolean isEmpty();
}