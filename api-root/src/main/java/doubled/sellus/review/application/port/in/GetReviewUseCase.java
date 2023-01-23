package doubled.sellus.review.application.port.in;

import doubled.sellus.review.Review;

public interface GetReviewUseCase {

    Review getReview(Long reviewId);

}
