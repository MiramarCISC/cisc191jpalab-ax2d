package edu.sdccd.cisc191.service;

import java.time.Instant;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.sdccd.cisc191.model.MatchRecord;
import edu.sdccd.cisc191.model.MatchStatus;
import edu.sdccd.cisc191.model.PlayerAccount;
import edu.sdccd.cisc191.model.QueueEntry;
import edu.sdccd.cisc191.repository.MatchRecordRepository;
import edu.sdccd.cisc191.repository.PlayerAccountRepository;
import edu.sdccd.cisc191.repository.QueueEntryRepository;

@Service
public class MatchmakingService {

    private final PlayerAccountRepository playerAccountRepository;
    private final QueueEntryRepository queueEntryRepository;
    private final MatchRecordRepository matchRecordRepository;

    public MatchmakingService(
            PlayerAccountRepository playerAccountRepository,
            QueueEntryRepository queueEntryRepository,
            MatchRecordRepository matchRecordRepository
    ) {
        this.playerAccountRepository = playerAccountRepository;
        this.queueEntryRepository = queueEntryRepository;
        this.matchRecordRepository = matchRecordRepository;
    }

    public PlayerAccount registerPlayer(String username, int rating) {
        // TODO: Create a new PlayerAccount and save it with playerAccountRepository.
        throw new UnsupportedOperationException("TODO: implement registerPlayer");
    }

    public QueueEntry enqueuePlayer(Long playerId) {
        // TODO:
        // 1. Load the player by id or throw IllegalArgumentException if missing.
        // 2. Create a QueueEntry with Instant.now().
        // 3. Save it with queueEntryRepository.
        throw new UnsupportedOperationException("TODO: implement enqueuePlayer");
    }

    public MatchRecord createMatch(Long playerOneId, Long playerTwoId, String arenaName) {
        // TODO:
        // 1. Load both players or throw IllegalArgumentException.
        // 2. Create a MatchRecord with status OPEN.
        // 3. Save it with matchRecordRepository.
        throw new UnsupportedOperationException("TODO: implement createMatch");
    }

    public MatchRecord finishMatch(Long matchId, Long winnerId) {
        // TODO:
        // 1. Load the match or throw IllegalArgumentException.
        // 2. Load the winner or throw IllegalArgumentException.
        // 3. Verify winner is either playerOne or playerTwo, else throw IllegalArgumentException.
        // 4. Set winner and status COMPLETED.
        // 5. Save and return the match.
        throw new UnsupportedOperationException("TODO: implement finishMatch");
    }

    public List<QueueEntry> getQueue() {
        return queueEntryRepository.findAllByOrderByJoinedAtAsc();
    }

    public List<MatchRecord> findRecentMatchesForPlayer(Long playerId) {
        // TODO:
        // 1. Verify the player exists or throw IllegalArgumentException.
        // 2. Return matches where the player appears as playerOne or playerTwo.
        throw new UnsupportedOperationException("TODO: implement findRecentMatchesForPlayer");
    }
}
