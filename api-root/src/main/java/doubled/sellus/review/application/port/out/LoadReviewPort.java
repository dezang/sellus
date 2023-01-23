package doubled.sellus.review.application.port.out;

import doubled.sellus.review.Review;

public interface LoadReviewPort {

    Review getReview(Long reviewId);

}
