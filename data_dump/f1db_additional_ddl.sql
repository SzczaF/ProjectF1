alter table constructorresults
    add constraint constructorresults_constructors_constructorId_fk
        foreign key (constructorId) references constructors (constructorId);

alter table constructorresults
    add constraint constructorresults_races_raceId_fk
        foreign key (raceId) references races (raceId);
