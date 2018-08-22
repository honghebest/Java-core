void notify() 
          唤醒在此对象监视器上等待的单个线程。 
 void notifyAll() 
          唤醒在此对象监视器上等待的所有线程。 
 void wait() 
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。 
 void wait(long timeout) 
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者超过指定的时间量前，导致当前线程等待。 
 void wait(long timeout, int nanos) 
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法，或者其他某个线程中断当前线程，或者已超过某个实际时间量前，导致当前线程等待。
注意:

wait/notify/notifyAll只能在内部锁作用范围内调用。
wait/notify/notifyAll都是通过该内部锁的锁对象调用。
wait会释放锁。