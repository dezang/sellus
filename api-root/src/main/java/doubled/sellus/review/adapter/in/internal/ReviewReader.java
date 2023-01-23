package doubled.sellus.review.adapter.in.internal;

import doubled.sellus.review.Review;

import java.util.List;

public interface ReviewReader {

    Review getReview(Long id);

    List<Review> getReviewByUserId(Long userId);

    List<Review> getReviewByProductId(Long productId);

}
