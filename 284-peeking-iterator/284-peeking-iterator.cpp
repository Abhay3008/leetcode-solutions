/*
 * Below is the interface for Iterator, which is already defined for you.
 * **DO NOT** modify the interface for Iterator.
 *
 *  class Iterator {
 *		struct Data;
 * 		Data* data;
 *  public:
 *		Iterator(const vector<int>& nums);
 * 		Iterator(const Iterator& iter);
 *
 * 		// Returns the next element in the iteration.
 *		int next();
 *
 *		// Returns true if the iteration has more elements.
 *		bool hasNext() const;
 *	};
 */

class PeekingIterator : public Iterator {
public:
    int i = -1, sz;
    vector<int> nums;
	PeekingIterator(const vector<int>& a) : Iterator(a) {
	    sz = a.size();
        for(auto x : a)
            nums.push_back(x);
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	int peek() {
        if(i >= sz-1)   return -1;
        else  return nums[i+1];
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	int next() {
        if(i < sz-1)
        {
            i++;
            return nums[i];
        }
        return -1;
	}
	
	bool hasNext() const {
	    return i < sz-1;
	}
};