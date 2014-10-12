package org.lolhens.renderengine.test

import java.awt.BorderLayout
import java.awt.event.{WindowAdapter, WindowEvent}
import javax.media.opengl.awt.GLCanvas
import javax.swing.JFrame

/**
 * Created by LolHens on 12.10.2014.
 */
class Window extends JFrame {
  val canvas = new GLCanvas()

  addWindowListener(new WindowAdapter() {
    override def windowClosing(event: WindowEvent) = System.exit(0)
  })

  setSize(500, 500)
  setTitle("TEST WINDOW")

  getContentPane().add(canvas, BorderLayout.CENTER)
}