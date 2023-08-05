package ru.geekbrains.lesson3;

import java.util.Comparator;

/**
 * Связный список
 * @param <T>
 */
public class LinkedList<T> {

    /**
     * Указатель на первый элемент связного списка
     */
    public Node head;

    /**
     * Указатель на хвост связного списка
     */


    //public Node tail;
    

    /**
     * Узел
     */
    class Node{

        /**
         * Ссылка на следующий элемент
         */
        public Node next;

        /**
         * Значение узла
         */
        public T value;

    }
    
    /**
     * Добавление нового элемента в начало связного списка
     * @param value значение
     */
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;

    }

    /**
     * Удаление первого элемента связного списка
     */
    public void removeFirst(){
        if (head != null)
            head = head.next;
    }

    /**
     * Поиск элемента в списке по значению
     * @param value
     * @return
     */
    public T contains(T value){
        Node node = head;
        while (node != null){
            node.value.equals(node.value);
            if (node.value.equals(value))
                return node.value;
            node = node.next;
        }
        return null;
    }

    /**
     * Сортировка (выбором)
     */
    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null){

            Node minValueNode = node;

            Node node2 = node.next;
            while (node2 != null){
                if (comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }

            if (minValueNode != node){
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }

            node = node.next;
        }
    }  
    
    public void revList(){      
        Node node = head;
        Node current = node.next;
        if (head != null) {
            
            node.next = head;
            node = head.next;
            head.next = null;
            while (current != null){
                node.next = current.next;
                current.next = head;
                    head = current;
                    current = node.next;
            }
        }
        else{
            System.out.println("Список пуст!");
            
        }
    }

    /**
     * Добавление элемента в конец связного списка
     * @param value значение
     */
    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }

    }

    /**
     * Удаление последнего элемента из связного списка
     */
    public void removeLast(){
        if (head == null)
            return;
        Node node = head;
        while (node.next != null){
            if (node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
        }

        head = null;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }

        return stringBuilder.toString();

    }


}
