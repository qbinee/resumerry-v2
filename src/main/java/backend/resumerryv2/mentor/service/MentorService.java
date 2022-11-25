package backend.resumerryv2.mentor.service;

import backend.resumerryv2.mentor.domain.dto.FieldOfMentorList;
import backend.resumerryv2.mentor.domain.dto.MentorContent;
import backend.resumerryv2.mentor.domain.repository.MentorCustomRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MentorService {
    private final MentorCustomRepository mentorCustomRepository;

    public Page<MentorContent> getMentorList(FieldOfMentorList fieldOfMentorList, Pageable pageable) {
        return mentorCustomRepository.searchAll(fieldOfMentorList, pageable);
    }
}