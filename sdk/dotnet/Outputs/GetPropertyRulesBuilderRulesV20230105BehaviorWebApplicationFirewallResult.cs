// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorWebApplicationFirewallResult
    {
        public readonly Outputs.GetPropertyRulesBuilderRulesV20230105BehaviorWebApplicationFirewallFirewallConfigurationResult? FirewallConfiguration;
        public readonly bool? Locked;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorWebApplicationFirewallResult(
            Outputs.GetPropertyRulesBuilderRulesV20230105BehaviorWebApplicationFirewallFirewallConfigurationResult? firewallConfiguration,

            bool? locked,

            string? templateUuid,

            string? uuid)
        {
            FirewallConfiguration = firewallConfiguration;
            Locked = locked;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
