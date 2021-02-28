package net.yukkuritaku.commands;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;
import net.dv8tion.jda.api.EmbedBuilder;
import net.yukkuritaku.utils.ColorUtils;

public final class InfoCommand extends Command {

    public InfoCommand(){
     this.name = "info";
     this.help = "このBotの詳細を確認出来ます";
     this.aliases = new String[] {"i"};
    }

    @Override
    protected final void execute(final CommandEvent event) {
        final String str = "\n";
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setTitle("Info");
        embedBuilder.setColor(ColorUtils.astolfo(1, 3, 0.5f, 1.0f, 1));
        embedBuilder.setDescription(
                "このBotは自分が「ランダムにプロセカのスタンプが選ばれる機能が欲しいなー」って思いながら作りました"
                        + str +
                        "色々頑張ってます！ バグや間違いあったら報告お願いします"
                        + str +
                        "開発環境: Java: Jdk-15.0.2, JDA: 4.2.0_168, jda-utilities: 3.0.5"
        );
        embedBuilder.addField("Version", "1.7.2", false);
        embedBuilder.addField("ChangeLog",
                        "1.6.5: イベントのえななんのスタンプ追加"
                + str + "1.6.6: (Develop Log)Maven Compiler source, targetをJava 15に変更、ずっと11にしてた(あほや)"
                + str + "1.7.0: 4コマの31、32話追加　普通に追加するの忘れてた"
                + str + "1.7.1: ウェブサイトのURLの拡張子をwebpからpngに変更、変わった理由はよくわからん"
                + str + "1.7.2: イベント: スマイルオブドリーマーのえむちゃんのスタンプ追加"
                ,

                false);
        event.reply(embedBuilder.build());
    }
}