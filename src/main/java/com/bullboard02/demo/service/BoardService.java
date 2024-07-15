package com.bullboard02.demo.service;
import com.bullboard02.demo.entity.Board;
import com.bullboard02.demo.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    @Autowired
    private final BoardRepository boardRepository;
    public void persist(Board board){
        boardRepository.save(board);
        //service 파일에서 repository.save(엔티티)
    }
    public List<Board> selectAll(){
        return (List<Board>)boardRepository.findAll();
    }
//    public Board selectOne(Long boardId){
//        return boardRepository.;
//    }
    public Board selectOne(Long id){
        return boardRepository.getOne(id);
    }

}