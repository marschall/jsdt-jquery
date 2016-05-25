package org.eclipselabs.jsdt.jquery.core.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class CompositeIterable<T> implements Iterable<T> {

  private final Iterable<T> first;
  private final Iterable<T> second;

  CompositeIterable(Iterable<T> first, Iterable<T> second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public Iterator<T> iterator() {
    return new CompositeIterator<T>(this.first.iterator(), this.second.iterator());
  }
  
  static final class CompositeIterator<E> implements Iterator<E> {
    
    private boolean useFirst;
    private final Iterator<E> first;
    private final Iterator<E> second;
    
    CompositeIterator(Iterator<E> first, Iterator<E> second) {
      this.first = first;
      this.second = second;
      this.useFirst = true;
    }

    @Override
    public boolean hasNext() {
      return this.first.hasNext() || this.second.hasNext();
    }

    @Override
    public E next() {
      if (this.useFirst) {
        if (this.first.hasNext()) {
          return this.first.next();
        } else {
          this.useFirst = false;
        }
      }
      if (this.second.hasNext()) {
        return this.second.next();
      }
      throw new NoSuchElementException();
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
    
  }

}
