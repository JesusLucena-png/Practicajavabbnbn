package com.corporate.talent.hub.interfaces;

public interface Rud<O> {
    void read (O identification);
    void update (O identification);
    void delete (O identification);
}
