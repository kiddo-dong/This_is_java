package gpt.Lambda.exam07;

@FunctionalInterface
public interface PriceFilter {
    boolean filter(Product product);
}