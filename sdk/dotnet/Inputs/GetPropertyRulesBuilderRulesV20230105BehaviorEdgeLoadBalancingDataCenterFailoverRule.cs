// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs : global::Pulumi.InvokeArgs
    {
        [Input("absolutePath")]
        public bool? AbsolutePath { get; set; }

        [Input("contextRoot")]
        public string? ContextRoot { get; set; }

        [Input("failoverHostname")]
        public string? FailoverHostname { get; set; }

        [Input("modifyRequest")]
        public bool? ModifyRequest { get; set; }

        [Input("overrideHostname")]
        public bool? OverrideHostname { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingDataCenterFailoverRuleArgs();
    }
}