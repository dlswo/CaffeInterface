package org.letter;

public class CaffeLatte extends AbstractBeverage {

    @Override
    public void getOrder() {
        print("라떼에 시럽을 넣을까요?");
        print("우유거품 올려 드려요?");
    }
}
