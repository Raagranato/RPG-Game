CXXFLAGS = -Wall -Wextra -I include/
SRC = $(wildcard src/*.cpp src/**/*.cpp)

THEGAME:
	g++ $(CXXFLAGS) main.cpp $(SRC) -o bin/game
	./bin/game

test_weapon:
	g++ $(CXXFLAGS) tests/test_weapon.cpp $(SRC) -o bin/test_weapon
	./bin/test_weapon

test_armor:
	g++ $(CXXFLAGS) tests/test_armor.cpp $(SRC) -o bin/test_armor
	./bin/test_armor

test_npc:
	g++ $(CXXFLAGS) tests/test_npc.cpp $(SRC) -o bin/test_npc
	./bin/test_npc

test_all:
	rm -f bin/*

	g++ $(CXXFLAGS) tests/test_weapon.cpp $(SRC) -o bin/test_weapon

	g++ $(CXXFLAGS) tests/test_armor.cpp $(SRC) -o bin/test_armor

	g++ $(CXXFLAGS) tests/test_npc.cpp $(SRC) -o bin/test_npc
	./bin/*

clean:
	rm -f bin/*