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
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorEdgeLoadBalancingDataCenterFailoverRuleResult
    {
        public readonly bool? AbsolutePath;
        public readonly string? ContextRoot;
        public readonly string? FailoverHostname;
        public readonly bool? ModifyRequest;
        public readonly bool? OverrideHostname;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeLoadBalancingDataCenterFailoverRuleResult(
            bool? absolutePath,

            string? contextRoot,

            string? failoverHostname,

            bool? modifyRequest,

            bool? overrideHostname)
        {
            AbsolutePath = absolutePath;
            ContextRoot = contextRoot;
            FailoverHostname = failoverHostname;
            ModifyRequest = modifyRequest;
            OverrideHostname = overrideHostname;
        }
    }
}