package com.electronik54.revision_3.corejava.ch217_kubernetes_basics.solution;

public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 217: Kubernetes Basics (Advanced) ===\n");
        System.out.println("Pod: One or more containers with shared network/storage");
        System.out.println("Deployment: Declarative updates for Pods and ReplicaSets");
        System.out.println("Service: Stable network endpoint (ClusterIP, NodePort, LoadBalancer)");
        System.out.println("Ingress: HTTP/HTTPS routing to Services");
        System.out.println("ConfigMap: Non-sensitive configuration (env vars, files)");
        System.out.println("Secret: Sensitive data (base64 encoded, encrypted at rest)");
        System.out.println("HPA: Auto-scaling based on CPU/memory or custom metrics");
        System.out.println("Helm: Package manager (charts, templates, releases)");
    }
}