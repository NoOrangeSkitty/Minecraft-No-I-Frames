package net.mcreator.noiframes.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.mcreator.noiframes.NoIFramesMod;

import net.minecraft.world.damagesource.DamageSource;

import javax.annotation.Nullable;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

@Mod.EventBusSubscriber
public class NoIFrame {
	@SubscribeEvent
	public static void onEntityHurt(LivingHurtEvent event) {
		Entity entity = event.getEntity();
		if (event != null && entity != null) {
			execute(event, entity, event.getSource());
		}
	}

	public static void execute(Entity entity, DamageSource damagesource) {
		execute(null, entity, damagesource);
	}

	private static void execute(@Nullable Event event, Entity entity, DamageSource damagesource) {
		if (entity == null){
			return;
		}
			//entity.hurtTime = 10;
		if ((damagesource) == DamageSource.IN_FIRE || (damagesource) == DamageSource.SWEET_BERRY_BUSH || (damagesource) == DamageSource.LAVA || (damagesource) == DamageSource.HOT_FLOOR || (damagesource) == DamageSource.IN_WALL || (damagesource) == DamageSource.CACTUS){
			return;
		}
		entity.invulnerableTime = 0;
		}
	}
