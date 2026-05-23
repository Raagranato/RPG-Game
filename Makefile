CXX = g++
CXXFLAGS = -Wall -Wextra -I include/
SRC = $(wildcard src/*.cpp src/**/*.cpp)

all:
	$(CXX) $(CXXFLAGS) main.cpp $(SRC) -o bin/game
	./bin/game

clean:
	rm -rf bin/