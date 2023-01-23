package doubled.sellus.review.adapter.in.internal;

import doubled.sellus.review.Review;
import doubled.sellus.review.application.service.GetReviewService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class InternalReviewAdapter implements ReviewReader {

    private final GetReviewService getReviewService;

    @Override
    public Review getReview(Long reviewId) {
        return getReviewService.getReview(reviewId);
    }

    @Override
    public List<Review> getReviewByUserId(Long userId) {
        return null;
    }

    @Override
    public List<Review> getReviewByProductId(Long productId) {
        return null;
    }
}
