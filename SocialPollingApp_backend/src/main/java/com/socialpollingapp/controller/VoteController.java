package com.socialpollingapp.controller;

import com.socialpollingapp.model.Poll;
import com.socialpollingapp.service.VoteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vote")
public class VoteController {
    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping("/{pollId}/{optionId}")
    public void castVote(@PathVariable Long pollId, @PathVariable Long optionId) {
        // Cast vote logic here
    }
}
