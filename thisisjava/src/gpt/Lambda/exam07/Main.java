package gpt.Lambda.exam07;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("맥북", "전자제품", 2000000),
            new Product("키보드", "전자제품", 15000),
            new Product("볼펜", "문구류", 900),
            new Product("노트", "문구류", 1200),
            new Product("프린터", "전자제품", 80000),
            new Product("만년필", "문구류", 20000)
        );

        // 람다를 이용한 가격 필터 인터페이스 구현
        PriceFilter expensiveFilter = product -> product.getPrice() >= 10000;

        // 필터링 → 그룹핑 → 평균계산
        Map<String, Double> averagePricesByCategory = products.stream()
            .filter(expensiveFilter::filter) // 가격이 10000원 이상인 상품만
            .collect(Collectors.groupingBy(
                Product::getCategory,                    // 카테고리별로 그룹핑
                Collectors.averagingDouble(Product::getPrice) // 평균 가격 계산
            ));

        // 출력
        averagePricesByCategory.forEach((category, avgPrice) ->
            System.out.println(category + " 평균 가격: " + avgPrice + "원")
        );
    }
}
