package fr.socrates.meetup.meetup_group.domain;

public interface MeetupGroupMemberRepository {
    MeetupGroupMember get(MeetupGroupMemberId meetupGroupMemberId);
    void persist(MeetupGroupMember meetupGroupMember);
}
