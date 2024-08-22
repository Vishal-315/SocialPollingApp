package com.socialpollingapp.service;

import com.socialpollingapp.model.Option;
import com.socialpollingapp.model.Poll;
import com.socialpollingapp.model.Vote;
import com.socialpollingapp.repository.VoteRepository;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public void castVote(Poll poll, Option option) {
        Vote vote = new Vote();
        vote.setPoll(poll);
        vote.setOption(option);
        voteRepository.save(vote);

        option.setVoteCount(option.getVoteCount() + 1);
    }
}
