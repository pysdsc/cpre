package hello.core.order;

public interface OrderService {

    // 1. 주문 생성 시 회원 ID, 상품명, 상품 가격
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
