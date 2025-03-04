package generations.gg.generations.core.generationscore.world.container;

import generations.gg.generations.core.generationscore.world.container.slots.PredicateSlotItemHandler;
import generations.gg.generations.core.generationscore.world.item.CalyrexSteedItem;
import generations.gg.generations.core.generationscore.world.item.WalkmonItem;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.Items;

public class CalyrexSteedContainer extends GenericChestContainer {

    public CalyrexSteedContainer(int containerId, Inventory playerInventory, FriendlyByteBuf buf) {
        super(GenerationsContainers.CALYREX_STEED.get(), containerId, playerInventory, buf);
    }

    public CalyrexSteedContainer(int containerId, Inventory playerInventory, GenericContainer container, int lockedSlot) {
        super(GenerationsContainers.CALYREX_STEED.get(), containerId, playerInventory, container, lockedSlot);
    }

    @Override
    public Slot getSlot(Container container, int slot, int x, int y) {
        if(container instanceof Inventory) return super.getSlot(container, slot, x, y);
        return new PredicateSlotItemHandler(container, slot, x, y, itemStack -> itemStack.is(Items.CARROT));
    }

    @Override
    public void save(Player player) {
        var stack = getPlayerInventory().getItem(this.getLocked());
        if(stack.getItem() instanceof CalyrexSteedItem walkmon) {
            walkmon.save((GenericContainer.SimpleGenericContainer) getContainer(), stack);
        }
    }
}
