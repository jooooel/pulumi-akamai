# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['GtmProperty']


class GtmProperty(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 backup_cname: Optional[pulumi.Input[str]] = None,
                 backup_ip: Optional[pulumi.Input[str]] = None,
                 balance_by_download_score: Optional[pulumi.Input[bool]] = None,
                 cname: Optional[pulumi.Input[str]] = None,
                 comments: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 dynamic_ttl: Optional[pulumi.Input[int]] = None,
                 failback_delay: Optional[pulumi.Input[int]] = None,
                 failover_delay: Optional[pulumi.Input[int]] = None,
                 ghost_demand_reporting: Optional[pulumi.Input[bool]] = None,
                 handout_limit: Optional[pulumi.Input[int]] = None,
                 handout_mode: Optional[pulumi.Input[str]] = None,
                 health_max: Optional[pulumi.Input[float]] = None,
                 health_multiplier: Optional[pulumi.Input[float]] = None,
                 health_threshold: Optional[pulumi.Input[float]] = None,
                 ipv6: Optional[pulumi.Input[bool]] = None,
                 liveness_tests: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyLivenessTestArgs']]]]] = None,
                 load_imbalance_percentage: Optional[pulumi.Input[float]] = None,
                 map_name: Optional[pulumi.Input[str]] = None,
                 max_unreachable_penalty: Optional[pulumi.Input[int]] = None,
                 min_live_fraction: Optional[pulumi.Input[float]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 score_aggregation_type: Optional[pulumi.Input[str]] = None,
                 static_rr_sets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyStaticRrSetArgs']]]]] = None,
                 static_ttl: Optional[pulumi.Input[int]] = None,
                 stickiness_bonus_constant: Optional[pulumi.Input[int]] = None,
                 stickiness_bonus_percentage: Optional[pulumi.Input[int]] = None,
                 traffic_targets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyTrafficTargetArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 unreachable_threshold: Optional[pulumi.Input[float]] = None,
                 use_computed_targets: Optional[pulumi.Input[bool]] = None,
                 wait_on_complete: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        `GtmProperty` provides the resource for creating, configuring and importing a gtm property to integrate easily with your existing GTM infrastructure to provide a secure, high performance, highly available and scalable solution for Global Traffic Management. Note: Import requires an ID of the format: `existing_domain_name`:`existing_property_name`

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        demo_property = akamai.GtmProperty("demoProperty",
            domain="demo_domain.akadns.net",
            handout_limit=5,
            handout_mode="normal",
            score_aggregation_type="median",
            traffic_targets=[akamai.GtmPropertyTrafficTargetArgs(
                datacenter_id=3131,
            )],
            type="weighted-round-robin")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] balance_by_download_score: * `static_ttl`
               * `unreachable_threshold`
               * `health_multiplier`
               * `dynamic_ttl`
               * `max_unreachable_penalty`
               * `map_name`
               * `load_imbalance_percentage`
               * `health_max`
               * `cname`
               * `comments`
               * `ghost_demand_reporting`
               * `min_live_fraction`
        :param pulumi.Input[str] domain: Domain name
        :param pulumi.Input[bool] ipv6: * `stickiness_bonus_percentage`
               * `stickiness_bonus_constant`
               * `health_threshold`
        :param pulumi.Input[str] name: Liveness test name
               * `test_interval`
               * `test_object_protocol`
               * `test_timeout`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyStaticRrSetArgs']]]] static_rr_sets: * `type`
               * `ttl`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyTrafficTargetArgs']]]] traffic_targets: * `datacenter_id`
        :param pulumi.Input[str] type: Property type  
               * `score_aggregation_type`
        :param pulumi.Input[bool] use_computed_targets: * `backup_ip`
        :param pulumi.Input[bool] wait_on_complete: Wait for transaction to complete
               * `failover_delay`
               * `failback_delay`
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['backup_cname'] = backup_cname
            __props__['backup_ip'] = backup_ip
            __props__['balance_by_download_score'] = balance_by_download_score
            __props__['cname'] = cname
            __props__['comments'] = comments
            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__['domain'] = domain
            __props__['dynamic_ttl'] = dynamic_ttl
            __props__['failback_delay'] = failback_delay
            __props__['failover_delay'] = failover_delay
            __props__['ghost_demand_reporting'] = ghost_demand_reporting
            if handout_limit is None and not opts.urn:
                raise TypeError("Missing required property 'handout_limit'")
            __props__['handout_limit'] = handout_limit
            if handout_mode is None and not opts.urn:
                raise TypeError("Missing required property 'handout_mode'")
            __props__['handout_mode'] = handout_mode
            __props__['health_max'] = health_max
            __props__['health_multiplier'] = health_multiplier
            __props__['health_threshold'] = health_threshold
            __props__['ipv6'] = ipv6
            __props__['liveness_tests'] = liveness_tests
            __props__['load_imbalance_percentage'] = load_imbalance_percentage
            __props__['map_name'] = map_name
            __props__['max_unreachable_penalty'] = max_unreachable_penalty
            __props__['min_live_fraction'] = min_live_fraction
            __props__['name'] = name
            if score_aggregation_type is None and not opts.urn:
                raise TypeError("Missing required property 'score_aggregation_type'")
            __props__['score_aggregation_type'] = score_aggregation_type
            __props__['static_rr_sets'] = static_rr_sets
            __props__['static_ttl'] = static_ttl
            __props__['stickiness_bonus_constant'] = stickiness_bonus_constant
            __props__['stickiness_bonus_percentage'] = stickiness_bonus_percentage
            if traffic_targets is None and not opts.urn:
                raise TypeError("Missing required property 'traffic_targets'")
            __props__['traffic_targets'] = traffic_targets
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['unreachable_threshold'] = unreachable_threshold
            __props__['use_computed_targets'] = use_computed_targets
            __props__['wait_on_complete'] = wait_on_complete
            __props__['weighted_hash_bits_for_ipv4'] = None
            __props__['weighted_hash_bits_for_ipv6'] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="akamai:trafficmanagement/gtmProperty:GtmProperty")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(GtmProperty, __self__).__init__(
            'akamai:index/gtmProperty:GtmProperty',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            backup_cname: Optional[pulumi.Input[str]] = None,
            backup_ip: Optional[pulumi.Input[str]] = None,
            balance_by_download_score: Optional[pulumi.Input[bool]] = None,
            cname: Optional[pulumi.Input[str]] = None,
            comments: Optional[pulumi.Input[str]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            dynamic_ttl: Optional[pulumi.Input[int]] = None,
            failback_delay: Optional[pulumi.Input[int]] = None,
            failover_delay: Optional[pulumi.Input[int]] = None,
            ghost_demand_reporting: Optional[pulumi.Input[bool]] = None,
            handout_limit: Optional[pulumi.Input[int]] = None,
            handout_mode: Optional[pulumi.Input[str]] = None,
            health_max: Optional[pulumi.Input[float]] = None,
            health_multiplier: Optional[pulumi.Input[float]] = None,
            health_threshold: Optional[pulumi.Input[float]] = None,
            ipv6: Optional[pulumi.Input[bool]] = None,
            liveness_tests: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyLivenessTestArgs']]]]] = None,
            load_imbalance_percentage: Optional[pulumi.Input[float]] = None,
            map_name: Optional[pulumi.Input[str]] = None,
            max_unreachable_penalty: Optional[pulumi.Input[int]] = None,
            min_live_fraction: Optional[pulumi.Input[float]] = None,
            name: Optional[pulumi.Input[str]] = None,
            score_aggregation_type: Optional[pulumi.Input[str]] = None,
            static_rr_sets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyStaticRrSetArgs']]]]] = None,
            static_ttl: Optional[pulumi.Input[int]] = None,
            stickiness_bonus_constant: Optional[pulumi.Input[int]] = None,
            stickiness_bonus_percentage: Optional[pulumi.Input[int]] = None,
            traffic_targets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyTrafficTargetArgs']]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            unreachable_threshold: Optional[pulumi.Input[float]] = None,
            use_computed_targets: Optional[pulumi.Input[bool]] = None,
            wait_on_complete: Optional[pulumi.Input[bool]] = None,
            weighted_hash_bits_for_ipv4: Optional[pulumi.Input[int]] = None,
            weighted_hash_bits_for_ipv6: Optional[pulumi.Input[int]] = None) -> 'GtmProperty':
        """
        Get an existing GtmProperty resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] balance_by_download_score: * `static_ttl`
               * `unreachable_threshold`
               * `health_multiplier`
               * `dynamic_ttl`
               * `max_unreachable_penalty`
               * `map_name`
               * `load_imbalance_percentage`
               * `health_max`
               * `cname`
               * `comments`
               * `ghost_demand_reporting`
               * `min_live_fraction`
        :param pulumi.Input[str] domain: Domain name
        :param pulumi.Input[bool] ipv6: * `stickiness_bonus_percentage`
               * `stickiness_bonus_constant`
               * `health_threshold`
        :param pulumi.Input[str] name: Liveness test name
               * `test_interval`
               * `test_object_protocol`
               * `test_timeout`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyStaticRrSetArgs']]]] static_rr_sets: * `type`
               * `ttl`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['GtmPropertyTrafficTargetArgs']]]] traffic_targets: * `datacenter_id`
        :param pulumi.Input[str] type: Property type  
               * `score_aggregation_type`
        :param pulumi.Input[bool] use_computed_targets: * `backup_ip`
        :param pulumi.Input[bool] wait_on_complete: Wait for transaction to complete
               * `failover_delay`
               * `failback_delay`
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["backup_cname"] = backup_cname
        __props__["backup_ip"] = backup_ip
        __props__["balance_by_download_score"] = balance_by_download_score
        __props__["cname"] = cname
        __props__["comments"] = comments
        __props__["domain"] = domain
        __props__["dynamic_ttl"] = dynamic_ttl
        __props__["failback_delay"] = failback_delay
        __props__["failover_delay"] = failover_delay
        __props__["ghost_demand_reporting"] = ghost_demand_reporting
        __props__["handout_limit"] = handout_limit
        __props__["handout_mode"] = handout_mode
        __props__["health_max"] = health_max
        __props__["health_multiplier"] = health_multiplier
        __props__["health_threshold"] = health_threshold
        __props__["ipv6"] = ipv6
        __props__["liveness_tests"] = liveness_tests
        __props__["load_imbalance_percentage"] = load_imbalance_percentage
        __props__["map_name"] = map_name
        __props__["max_unreachable_penalty"] = max_unreachable_penalty
        __props__["min_live_fraction"] = min_live_fraction
        __props__["name"] = name
        __props__["score_aggregation_type"] = score_aggregation_type
        __props__["static_rr_sets"] = static_rr_sets
        __props__["static_ttl"] = static_ttl
        __props__["stickiness_bonus_constant"] = stickiness_bonus_constant
        __props__["stickiness_bonus_percentage"] = stickiness_bonus_percentage
        __props__["traffic_targets"] = traffic_targets
        __props__["type"] = type
        __props__["unreachable_threshold"] = unreachable_threshold
        __props__["use_computed_targets"] = use_computed_targets
        __props__["wait_on_complete"] = wait_on_complete
        __props__["weighted_hash_bits_for_ipv4"] = weighted_hash_bits_for_ipv4
        __props__["weighted_hash_bits_for_ipv6"] = weighted_hash_bits_for_ipv6
        return GtmProperty(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="backupCname")
    def backup_cname(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "backup_cname")

    @property
    @pulumi.getter(name="backupIp")
    def backup_ip(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "backup_ip")

    @property
    @pulumi.getter(name="balanceByDownloadScore")
    def balance_by_download_score(self) -> pulumi.Output[Optional[bool]]:
        """
        * `static_ttl`
        * `unreachable_threshold`
        * `health_multiplier`
        * `dynamic_ttl`
        * `max_unreachable_penalty`
        * `map_name`
        * `load_imbalance_percentage`
        * `health_max`
        * `cname`
        * `comments`
        * `ghost_demand_reporting`
        * `min_live_fraction`
        """
        return pulumi.get(self, "balance_by_download_score")

    @property
    @pulumi.getter
    def cname(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "cname")

    @property
    @pulumi.getter
    def comments(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "comments")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        Domain name
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="dynamicTtl")
    def dynamic_ttl(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "dynamic_ttl")

    @property
    @pulumi.getter(name="failbackDelay")
    def failback_delay(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "failback_delay")

    @property
    @pulumi.getter(name="failoverDelay")
    def failover_delay(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "failover_delay")

    @property
    @pulumi.getter(name="ghostDemandReporting")
    def ghost_demand_reporting(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "ghost_demand_reporting")

    @property
    @pulumi.getter(name="handoutLimit")
    def handout_limit(self) -> pulumi.Output[int]:
        return pulumi.get(self, "handout_limit")

    @property
    @pulumi.getter(name="handoutMode")
    def handout_mode(self) -> pulumi.Output[str]:
        return pulumi.get(self, "handout_mode")

    @property
    @pulumi.getter(name="healthMax")
    def health_max(self) -> pulumi.Output[Optional[float]]:
        return pulumi.get(self, "health_max")

    @property
    @pulumi.getter(name="healthMultiplier")
    def health_multiplier(self) -> pulumi.Output[Optional[float]]:
        return pulumi.get(self, "health_multiplier")

    @property
    @pulumi.getter(name="healthThreshold")
    def health_threshold(self) -> pulumi.Output[Optional[float]]:
        return pulumi.get(self, "health_threshold")

    @property
    @pulumi.getter
    def ipv6(self) -> pulumi.Output[Optional[bool]]:
        """
        * `stickiness_bonus_percentage`
        * `stickiness_bonus_constant`
        * `health_threshold`
        """
        return pulumi.get(self, "ipv6")

    @property
    @pulumi.getter(name="livenessTests")
    def liveness_tests(self) -> pulumi.Output[Optional[Sequence['outputs.GtmPropertyLivenessTest']]]:
        return pulumi.get(self, "liveness_tests")

    @property
    @pulumi.getter(name="loadImbalancePercentage")
    def load_imbalance_percentage(self) -> pulumi.Output[Optional[float]]:
        return pulumi.get(self, "load_imbalance_percentage")

    @property
    @pulumi.getter(name="mapName")
    def map_name(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "map_name")

    @property
    @pulumi.getter(name="maxUnreachablePenalty")
    def max_unreachable_penalty(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "max_unreachable_penalty")

    @property
    @pulumi.getter(name="minLiveFraction")
    def min_live_fraction(self) -> pulumi.Output[Optional[float]]:
        return pulumi.get(self, "min_live_fraction")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Liveness test name
        * `test_interval`
        * `test_object_protocol`
        * `test_timeout`
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="scoreAggregationType")
    def score_aggregation_type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "score_aggregation_type")

    @property
    @pulumi.getter(name="staticRrSets")
    def static_rr_sets(self) -> pulumi.Output[Optional[Sequence['outputs.GtmPropertyStaticRrSet']]]:
        """
        * `type`
        * `ttl`
        """
        return pulumi.get(self, "static_rr_sets")

    @property
    @pulumi.getter(name="staticTtl")
    def static_ttl(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "static_ttl")

    @property
    @pulumi.getter(name="stickinessBonusConstant")
    def stickiness_bonus_constant(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "stickiness_bonus_constant")

    @property
    @pulumi.getter(name="stickinessBonusPercentage")
    def stickiness_bonus_percentage(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "stickiness_bonus_percentage")

    @property
    @pulumi.getter(name="trafficTargets")
    def traffic_targets(self) -> pulumi.Output[Sequence['outputs.GtmPropertyTrafficTarget']]:
        """
        * `datacenter_id`
        """
        return pulumi.get(self, "traffic_targets")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Property type  
        * `score_aggregation_type`
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="unreachableThreshold")
    def unreachable_threshold(self) -> pulumi.Output[Optional[float]]:
        return pulumi.get(self, "unreachable_threshold")

    @property
    @pulumi.getter(name="useComputedTargets")
    def use_computed_targets(self) -> pulumi.Output[Optional[bool]]:
        """
        * `backup_ip`
        """
        return pulumi.get(self, "use_computed_targets")

    @property
    @pulumi.getter(name="waitOnComplete")
    def wait_on_complete(self) -> pulumi.Output[Optional[bool]]:
        """
        Wait for transaction to complete
        * `failover_delay`
        * `failback_delay`
        """
        return pulumi.get(self, "wait_on_complete")

    @property
    @pulumi.getter(name="weightedHashBitsForIpv4")
    def weighted_hash_bits_for_ipv4(self) -> pulumi.Output[int]:
        return pulumi.get(self, "weighted_hash_bits_for_ipv4")

    @property
    @pulumi.getter(name="weightedHashBitsForIpv6")
    def weighted_hash_bits_for_ipv6(self) -> pulumi.Output[int]:
        return pulumi.get(self, "weighted_hash_bits_for_ipv6")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
