package com.company;

public class kamushki {
    public static void main(String args[]) {

    }

    public abstract class player extends kamushki {
        abstract void hand();
        abstract boolean turn();
    }

    public class first extends player {

        void hand() {

        }

        @Override
        boolean turn() {
            return false;
        }
    }

    public class second extends player {

        void hand() {

        }

        @Override
        boolean turn() {
            return false;
        }
    }
}
